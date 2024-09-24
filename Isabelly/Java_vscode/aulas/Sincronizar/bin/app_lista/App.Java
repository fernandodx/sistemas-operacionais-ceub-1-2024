package app_lista;

public class App {

    public static void main(String[] args){

        Lista lista = new Lista();

        for(int i = 0; i< 10; i++){
            new Thread().start();
        } 

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStacktrace();
        }

        for(int i = 0; i < lista.tamanho(); i++){
            System.out.println(i + " - " + lista.getElemento(i));
        }
    }
}