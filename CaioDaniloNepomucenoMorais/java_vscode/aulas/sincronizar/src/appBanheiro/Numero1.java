
public class Numero1 implements Runnable {

    private banheiro banheiro;

    public Numero1(banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumero1();
    }

}
