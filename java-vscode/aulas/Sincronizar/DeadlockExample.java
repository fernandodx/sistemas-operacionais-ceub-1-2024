//- Pesquise e responda. O que é um DeadLock? Quais os problemas podem acontecer em uma aplicação quando isso acontecer. 
//- Faça um exemplo de um código em java que dê Deadlock. 

// Respostas:
// Travamento da aplicação: A execução das threads envolvidas para e a aplicação pode parecer congelada.
// Uso ineficiente de recursos: Recursos alocados nunca são liberados, o que pode esgotar o sistema.
// Impacto na experiência do usuário: Em sistemas críticos, como bancos ou sistemas médicos, um deadlock pode causar perda de dados ou interrupção de serviços.

public class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Bloqueou resource1");

                try {
                    
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Tentando bloquear resource2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Bloqueou resource2");
                }
            }
        });

        
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Bloqueou resource2");

                try {
                   
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Tentando bloquear resource1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Bloqueou resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
