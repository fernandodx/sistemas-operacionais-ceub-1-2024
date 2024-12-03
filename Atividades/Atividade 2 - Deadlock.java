// Deadlock é uma situação em que ocorre um impasse, e dois ou mais processos ficam impedidos de continuar suas execuções, ou seja, ficam bloqueados, esperando que o outro processe. 
//Quando acontece um deadlock, as principais causas são: Perda de recursos, paralisação do sistema, tempo de resposta maior, dificuldade de detectar no sistema, entre outros problemas.

class Banheiro {
    private final String nome;

    public Banheiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Pessoa extends Thread {
    private final Banheiro banheiro1;
    private final Banheiro banheiro2;

    public Pessoa(Banheiro banheiro1, Banheiro banheiro2) {
        this.banheiro1 = banheiro1;
        this.banheiro2 = banheiro2;
    }

    @Override
    public void run() {
        try {
            usarBanheiros();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void usarBanheiros() throws InterruptedException {
        synchronized (banheiro1) {
            System.out.println(Thread.currentThread().getName() + " entrou no " + banheiro1.getNome());

            Thread.sleep(100);

            synchronized (banheiro2) {
                System.out.println(Thread.currentThread().getName() + " entrou no " + banheiro2.getNome());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Banheiro banheiroA = new Banheiro("Banheiro A");
        Banheiro banheiroB = new Banheiro("Banheiro B");

        Pessoa pessoa1 = new Pessoa(banheiroA, banheiroB);
        Pessoa pessoa2 = new Pessoa(banheiroB, banheiroA);

        pessoa1.start();
        pessoa2.start();
    }
}
