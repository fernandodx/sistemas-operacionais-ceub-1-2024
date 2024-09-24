public class ThreadExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Thread threadAtual = Thread.currentThread();
            long id = threadAtual.getId();
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Id da thread: " + id + " - Número: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread threadAtual = Thread.currentThread();
            long id = threadAtual.getId();
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Id da thread: " + id + " - Número: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
