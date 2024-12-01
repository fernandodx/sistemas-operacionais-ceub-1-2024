//  - Faça um exemplo de um código em java que dê Deadlock.
public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: segurando lock 1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: esperando por lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: segurando lock 1 e lock 2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: segurando lock 2...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: esperando por lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: segurando lock 1 e lock 2...");
                }
                    }
        }
        );
    }
}


