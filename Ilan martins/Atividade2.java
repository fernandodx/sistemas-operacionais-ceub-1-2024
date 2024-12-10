// - Pesquise e responda. O que é um DeadLock? Quais os problemas podem acontecer em uma aplicação quando isso acontecer. 
//- Faça um exemplo de um código em java que dê Deadlock. 

//Deadlock é uma situação em que dois ou mais threads em um programa estão esperando 
//por recursos que nunca serão liberados, resultando em um impasse. Isso ocorre geralmente 
//em sistemas com múltiplos threads ou processos que compartilham recursos comuns, como 
//arquivos, memória ou locks.
//Um deadlock ocorre quando todas as seguintes condições são verdadeiras simultaneamente:
//Mutual Exclusion: Pelo menos um recurso está sendo usados exclusivamente por um thread.
//Hold and Wait: Um thread que detém um recurso está esperando para adquirir outro //recurso que está sendo usado por outro thread.
//No Preemption: Os recursos não podem ser forçados a serem liberados.
//Circular Wait: Existe uma cadeia circular de threads, onde cada thread está aguardando um //recurso que outro thread na cadeia detém.

public class DeadlockExample {
    static class Recurso {
        private final String nome;

        public Recurso(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Recurso recurso1 = new Recurso("Recurso 1");
        Recurso recurso2 = new Recurso("Recurso 2");

                Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1 bloqueou " + recurso1.getNome());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recurso2) {
                    System.out.println("Thread 1 bloqueou " + recurso2.getNome());
                }
            }
        });

        
        Thread thread2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread 2 bloqueou " + recurso2.getNome());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recurso1) {
                    System.out.println("Thread 2 bloqueou " + recurso1.getNome());
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}