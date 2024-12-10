
public class banheiro {

    private boolean isSujo = true;

    public void fazerNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta do banheiro!");

        synchronized (this) {
            atividadeDentroBanheiro(nome, 5);
            while (this.isSujo) {
                System.out.println("Eita! Banheiro Sujo... Tô fora!");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void limpar() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + "batendo na porta do banheiro!");

        synchronized (this) {
            if (!this.isSujo) {
                System.out.println("O banheiro já esta limpo!");
                return;
            }
            System.out.println("Iniciando a limpeza do banheiro");

            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.isSujo = false;
            System.out.println("Banheiro Limpo!");

            System.out.println("Saindo do banheiro. Tchau!");
            // Este avisa todas as threads que estavam no estado await que
            // elas podem tentar novamente a sua execução.
            this.notifyAll();
        }

    }

    public void fazerNumero2() {
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " lavando as mãos ");
        System.out.println(nome + " saindo do banheiro ");
    }

}