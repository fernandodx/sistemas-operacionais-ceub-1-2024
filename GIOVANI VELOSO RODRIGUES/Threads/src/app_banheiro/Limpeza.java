package app_banheiro;

public class Limpeza implements Runnable {

    private Banheiro banheiro;

    public Limpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.banheiro.limpar();
        }
    }

}
