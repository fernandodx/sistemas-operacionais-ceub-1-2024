public class App {
    public static void main(String[] args) throws Exception {
       
        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new Numero1 (banheiro),  "João");
        Thread convidado2 = new Thread(new Numero2 (banheiro),  "andre");
        Thread convidado3 = new Thread(new Numero1 (banheiro),  "natusoe");
        Thread convidado4 = new Thread(new Numero2 (banheiro),  "andrade");
        Thread convidado5 = new Thread(new Numero1 (banheiro),  "maudivas");
    
        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
        convidado5.start();
    }


}
