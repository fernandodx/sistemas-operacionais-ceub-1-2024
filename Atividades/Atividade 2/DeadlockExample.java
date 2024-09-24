//O que é um Deadlock?
//Um deadlock ocorre em sistemas de computação, particularmente em ambientes de multithreading ou multiprocessamento, 
//quando dois ou mais threads ou processos ficam presos indefinidamente esperando uns pelos outros liberarem os 
//recursos que necessitam para continuar a execução. Isso geralmente acontece quando:

//Múltiplos recursos estão bloqueados por diferentes threads, e 
//Essas threads ficam em espera circular, ou seja, uma thread está esperando por um recurso que está bloqueado por 
//outra thread, que, por sua vez, está esperando por um recurso bloqueado pela primeira thread.

//Problemas causados por Deadlock:
//Congelamento da aplicação: As threads envolvidas no deadlock nunca conseguem avançar, levando a uma inatividade infinita.
//Perda de eficiência: Recursos ficam alocados sem ser utilizados, resultando em desperdício de memória ou CPU.
//Paralisação de serviços críticos: Se o deadlock ocorre em uma parte essencial do sistema, pode paralisar funcionalidades críticas.
//Difícil diagnóstico e correção: Deadlocks podem ser difíceis de detectar e corrigir, pois não há necessariamente erros óbvios, apenas um 
//congelamento de execução.

public class DeadlockExample {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Bloqueou resource1");

                try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }

                System.out.println("Thread 1: Tentando bloquear resource2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Bloqueou resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Bloqueou resource2");

                try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }

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

