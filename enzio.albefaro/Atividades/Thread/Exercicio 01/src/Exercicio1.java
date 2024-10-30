public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new NumPrinter(), "Thread-1");
        Thread thread2 = new Thread(new NumPrinter(), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class NumPrinter implements Runnable {
    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();

        System.out.println("Id da thread: " + id);

        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread " + id + ": " + i);
        }
    }
}