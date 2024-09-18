
public class Limpeza implements Runnable {

    private Banheiro banheiro;

    public Limpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        this.banheiro.limpar();
    }

}
