//Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread.
//
//Você pode imprimir a id da thread através do método getId(), por exemplo:

//Thread threadAtual = Thread.currentThread();
//long id = threadAtual.getId();
//System.out.println("Id da thread: " + id);

//Responda:  Rode o programa no mínimo duas vezes para ver se o resultado da execução difere.


public class Atividade1 {
    public static void main(String[] args) {
       
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                long id = Thread.currentThread().getId();
                System.out.println("Thread ID: " + id + " - Número: " + i);
            }
        });

        
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                long id = Thread.currentThread().getId();
                System.out.println("Thread ID: " + id + " - Número: " + i);
            }
        });

        
        thread1.start();
        thread2.start();
    }
}
