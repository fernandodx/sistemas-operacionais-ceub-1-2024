public class banheiro {

    public void fazerNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta do banheiro");

        System.out.println(nome + " entrando no banheiro");

        System.out.println(nome + " fazendo coisa rapida");

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " lavando as mãos");
        System.out.println(nome + " saindo do banheiro");
        synchronized (this) {
            atividadeDentroBanheiro(nome, 10);
        }

    }

    public void fazerNumeroDois() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta do banheiro!");
        synchronized (this) {
            atividadeDentroBanheiro(nome, 10);
        }

    }

    private void atividadeDentroBanheiro(String nome, int tempoEmSegundo) {
        System.out.println(nome + " entrando no banheiro");
        if (tempoEmSegundo > 5) {
            System.out.println(nome + " fazendo coisa demorada");
        } else {
            System.out.println(nome + " fazendo coisa rápida");
        }

        try {
            Thread.sleep(tempoEmSegundo * 1000);
            System.out.println(nome + " dando descarga");
            Thread.sleep(2 * 1000);
            System.out.println(nome + " lavando as mãos");
            Thread.sleep(2 * 1000);
            System.out.println(nome + " saindo do banheiro");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
