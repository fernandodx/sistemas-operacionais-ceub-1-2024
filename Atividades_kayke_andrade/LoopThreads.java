
    /*Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread.

Você pode imprimir a id da thread através do método getId(), por exemplo:

Thread threadAtual = Thread.currentThread();
long id = threadAtual.getId();
System.out.println("Id da thread: " + id);

Responda:  Rode o programa no mínimo duas vezes para ver se o resultado da execução difere. */ 
public class LoopThreads implements Runnable {



    private String id;

    public LoopThreads(String threadId) {
        this.id = threadId;


}

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(" thereads " + id + " - contagem : " +  i ) ;

        }
}

    public static void main(String[] args) {
        
        Thread theread1 = new Thread(new LoopThreads("1")) ;
        Thread theread2 = new Thread(new LoopThreads("2")) ;
        theread1.start();

        theread2.start() ;
    }
}
