public class DeadlockExample {
    private static final Object recursoA = new Object();
    private static final Object recursoB = new Object();
    private static final Object recursoC = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (recursoA) {
                System.out.println("Thread 1: bloqueou recurso A");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recursoB) {
                    System.out.println("Thread 1: bloqueou recurso B");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (recursoB) {
                System.out.println("Thread 2: bloqueou recurso B");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recursoC) {
                    System.out.println("Thread 2: bloqueou recurso C");
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (recursoC) {
                System.out.println("Thread 3: bloqueou recurso C");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recursoA) {
                    System.out.println("Thread 3: bloqueou recurso A");
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

