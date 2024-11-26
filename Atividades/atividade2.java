///Deadlock (ou "interbloqueio") é uma situação que ocorre em sistemas de computação, especialmente em programação multithread, quando duas ou mais threads ficam bloqueadas, esperando por recursos que nunca estarão disponíveis. Ou seja, as threads estão em um ciclo de espera indefinido, onde nenhuma delas pode prosseguir com sua execução, resultando em um impasse que impede o progresso da aplicação.

    ///Isso normalmente acontece quando:

    ///Thread 1 bloqueia o Recurso A e espera pelo Recurso B.
    ///Thread 2 bloqueia o Recurso B e espera pelo Recurso A 



public class DeadlockExample {

    static class RecursoA {
        synchronized void metodoA(RecursoB recursoB) {
            System.out.println("Thread 1: Bloqueando Recurso A");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            recursoB.metodoB();
        }
    }

    static class RecursoB {
        synchronized void metodoB() {
            System.out.println("Thread 2: Bloqueando Recurso B");
        }
    }

    public static void main(String[] args) {
        final RecursoA recursoA = new RecursoA();
        final RecursoB recursoB = new RecursoB();

        // Thread 1 tentando acessar RecursoA e depois RecursoB
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                recursoA.metodoA(recursoB);
            }
        });

        // Thread 2 tentando acessar RecursoB e depois RecursoA
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                recursoB.metodoB();
                recursoA.metodoA(recursoB);
            }
        });

        thread1.start();
        thread2.start();
    }
}
