class Contador extends Thread {
    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        System.out.println("Id da thread: " + id);
        
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread ID " + id + ": " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Contador thread1 = new Contador();
        Contador thread2 = new Contador();
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Contagem finalizada.");
    }
}
