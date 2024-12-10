public class Banheiro {

    public void fazerNumeroUm() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta do banheiro");

        synchronized (this) {
            atividadeDentroBanheiro(nome, 5);
        }

    }

    public void fazerNumeroDois() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta do banheiro");

        synchronized (this) {
            atividadeDentroBanheiro(nome, 10);
        }

    }

    private void atividadeDentroBanheiro(String nome, int tempoEmSeg) {
        System.out.println(nome + " entrando no banheiro");
        if (tempoEmSeg > 5) {
            System.out.println(nome + " fazendo coisa demorada");
        } else {
            System.out.println(nome + " fazendo coisa rapida");
        }

        try {
            Thread.sleep(tempoEmSeg * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " lavando as mãos");
        System.out.println(nome + " saindo do banheiro");
    }
}
