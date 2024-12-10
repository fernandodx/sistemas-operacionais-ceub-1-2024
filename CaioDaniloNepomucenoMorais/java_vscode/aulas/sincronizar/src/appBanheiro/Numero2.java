public class Numero2 implements Runnable {

    private banheiro banheiro;

    public Numero2(banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumero2();
    }

}
