/*Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread.

Você pode imprimir a id da thread através do método getId(), por exemplo:

Thread threadAtual = Thread.currentThread();
long id = threadAtual.getId();
System.out.println("Id da thread: " + id);

Responda:  Rode o programa no mínimo duas vezes para ver se o resultado da execução difere.*/


package loop_threads1;

public class LoopThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter());
        Thread thread2 = new Thread(new NumberPrinter());

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread ID: " + id + " - Número: " + i);
        }
    }
}
