package app_lista;

public class Lista {

    private String[] elementos = new String[100];
    private int indice = 0;

    int tamanho() {
        return elementos.length;
    }

    String getElemento(int indice) {
        return elementos[indice];
    }

    public void addElementos(String elemento) {
        synchronized (this) {

            this.elementos[indice] = elemento;

            this.indice++;

        }

    }

}
