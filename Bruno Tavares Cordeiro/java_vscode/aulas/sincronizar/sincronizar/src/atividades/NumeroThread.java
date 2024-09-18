public class NumeroThread implements Runnable {

    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();

        for (int i = 1; i <= 1000; i++) {
            System.out.println("Id da thread: " + id + " - Número: " + i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new NumeroThread());
        Thread thread2 = new Thread(new NumeroThread());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finalizada.");
    }
}
