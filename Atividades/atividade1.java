public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());
        thread1.start();
        thread2.start();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            Thread threadAtual = Thread.currentThread();
            long id = threadAtual.getId();
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Id da thread: " + id + " - Número: " + i);
            }
        }
    }
}
