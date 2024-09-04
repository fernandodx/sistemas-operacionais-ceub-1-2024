public class Numero3 implements Runnable {
    private Banheiro banheiro;

    public Numero3(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumeroDois();
    }
}
