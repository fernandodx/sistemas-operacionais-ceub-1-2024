public class App {
    public static void main(String[] args) throws Exception {
        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new Numero1(banheiro), "João");
        Thread convidado2 = new Thread(new Numero2(banheiro), "Jaiston");
        Thread convidado3 = new Thread(new Numero1(banheiro), "Marcus");

        Thread convidado4 = new Thread(new Numero2(banheiro), "Jeferson");
        Thread limpeza = new Thread(new Limpeza(banheiro), "Lucas da limpeza");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();

        limpeza.start();

    }
}
