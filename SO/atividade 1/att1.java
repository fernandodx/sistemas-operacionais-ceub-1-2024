public class MultithreadingExample {
    public static void main(String[] args) {
        // Criação das threads
        Thread thread1 = new Thread(new NumberPrinter(), "Thread-1");
        Thread thread2 = new Thread(new NumberPrinter(), "Thread-2");

        // Inicia as threads
        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();
        String nome = threadAtual.getName();

        for (int i = 1; i <= 1000; i++) {
            System.out.println("Id da thread: " + id + ", Nome: " + nome + ", Número: " + i);
        }
    }
}
