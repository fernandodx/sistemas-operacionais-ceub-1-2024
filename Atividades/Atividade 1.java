// Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread.

// Você pode imprimir a id da thread através do método getId(), por exemplo:

// Thread threadAtual = Thread.currentThread();
// long id = threadAtual.getId();
//System.out.println("Id da thread: " + id);

//Responda:  Rode o programa no mínimo duas vezes para ver se o resultado da execução difere.

public class TwoThreadsExample {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new NumberPrinter(), "Thread-1");
        Thread thread2 = new Thread(new NumberPrinter(), "Thread-2");       
        thread1.start();
        thread2.start();
    }
}
class NumberPrinter implements Runnable {
    @Override
    public void run() {
       
        Thread currentThread = Thread.currentThread();
        long threadId = currentThread.getId();

       
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread ID: " + threadId + " - Número: " + i);
        }
    }
}
