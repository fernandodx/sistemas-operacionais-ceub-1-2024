public class Main {
    public static class DeadlockExample {

        private final Object resource1 = new Object();
        private final Object resource2 = new Object();

        public static void main(String[] args) {
            DeadlockExample deadlock = new DeadlockExample();
            deadlock.createDeadlock();
        }

        private void createDeadlock() {

            Thread thread1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println("Thread 1: bloqueou objeto1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 1: tentando bloquear objeto2");
                    synchronized (resource2) {
                        System.out.println("Thread 1: bloqueou objeto2");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (resource2) {
                    System.out.println("Thread 2: bloqueou objeto1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 2: tentando bloquear objeto1");
                    synchronized (resource1) {
                        System.out.println("Thread 2: bloqueou objeto1");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }
}
