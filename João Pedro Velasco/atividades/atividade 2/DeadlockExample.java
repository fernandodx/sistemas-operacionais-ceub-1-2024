//João Pedro Gomes de Velasco
//O deadlock é quando um processo não consegue executar sua função após algum impasse. Podem causar redução no desempenho, aumento do uso de recursos, interrupção do fluxo de trabalho entre outros problemas.

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: segurou lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 1: tentando segurar lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: segurou lock2");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: segurou lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2: tentando segurar lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2: segurou lock1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
