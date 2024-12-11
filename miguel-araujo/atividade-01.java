public class ThreadExample {
    public static void main(String[] args) {
        Runnable printNumbers = () -> {
            Thread threadAtual = Thread.currentThread();
            long id = threadAtual.getId();
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Thread ID: " + id + " - Número: " + i);
            }
        };

        Thread thread1 = new Thread(printNumbers);
        Thread thread2 = new Thread(printNumbers);

        thread1.start();
        thread2.start();
    }
}
