package app_banheiro;
public class Numero1 implements Runnable {

    private Banheiro banheiro;

    public Numero1(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumero1();
    }

}
