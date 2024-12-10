/* 
public class App {
    public static void main(String[] args) throws Exception {

        banheiro banheiro = new banheiro();

        Thread convidado1 = new Thread(new Numero1(banheiro), "João");
        Thread convidado2 = new Thread(new Numero2(banheiro), "Rafael");
        Thread convidado3 = new Thread(new Numero1(banheiro), "Caique");
        Thread convidado4 = new Thread(new Numero2(banheiro), "Reginaldo");
        Thread limpeza = new Thread(new Limpeza(banheiro), "Serverino Limpeza");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
        limpeza.start();
        ;
    }
}
*/

public class Contador {
    private int count = 0;

    public synchronized void incrementar() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Contador contador = new Contador();

        Runnable incrementar = () -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        };

        Thread incrementar1 = new Thread(incrementar);
        Thread incrementar2 = new Thread(incrementar);

        incrementar1.start();
        incrementar2.start();

        try {
            incrementar1.join();
            incrementar2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("O Valor do contador é de: " + contador.getCount());

    }

}