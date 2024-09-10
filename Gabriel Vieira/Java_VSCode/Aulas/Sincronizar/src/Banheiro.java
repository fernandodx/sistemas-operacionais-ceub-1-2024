public class Banheiro {

    public void fazerNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " Batendo na porta do banheiro!");

        synchronized (this) {
            atividadeDentroBanheiro(nome, 5);
        }

    }

    public void fazerNumero2() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " Batendo na porta do banheiro!");

        synchronized (this) {
            atividadeDentroBanheiro(nome, 10);
        }
    }

    private void atividadeDentroBanheiro(String nome, int tempoEmSegundo) {
        System.out.println(nome + " Entrando no banheiro");

        if (tempoEmSegundo > 5) {
            System.out.println(nome + " Fazendo coisa demorada");
        } else {
            System.out.println(nome + " Fazendo coisa rápida");
        }

        try {
            Thread.sleep(tempoEmSegundo * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " Dando descarga");
        System.out.println(nome + " Lavando as mãos ");
        System.out.println(nome + " Saindo do banheiro ");
    }

}
