public class DeadlockExample {
    public static void main(String[] args) {
        final Object resource1 = "Recurso 1";
        final Object resource2 = "Recurso 2";

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: bloqueou " + resource1);

                try {
                    // Simula um atraso
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: tentando bloquear " + resource2);
                synchronized (resource2) {
                    System.out.println("Thread 1: bloqueou " + resource2);
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: bloqueou " + resource2);

                try {
                    // Simula um atraso
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: tentando bloquear " + resource1);
                synchronized (resource1) {
                    System.out.println("Thread 2: bloqueou " + resource1);
                }
            }
        });

        // Inicia as threads
        thread1.start();
        thread2.start();
    }
}
