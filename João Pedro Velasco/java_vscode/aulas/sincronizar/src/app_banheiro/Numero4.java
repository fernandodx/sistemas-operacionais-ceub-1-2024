
public class Numero4 implements Runnable {
    private Banheiro banheiro;

    public Numero4(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumeroDois();
    }

}
