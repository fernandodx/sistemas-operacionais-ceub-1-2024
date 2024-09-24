public class app2 {
    public static void main(String[] args) {
        final String resource1 = "Recurso 1";
        final String resource2 = "Recurso 2";

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: segurou " + resource1);

                // Aguarda um pouco para garantir que a Thread 2 entre
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: segurou " + resource2);
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: segurou " + resource2);

                // Aguarda um pouco para garantir que a Thread 1 entre
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: segurou " + resource1);
                }
            }
        });

        t1.start();
        t2.start();
    }
}