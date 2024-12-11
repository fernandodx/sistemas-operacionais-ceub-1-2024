package app_lista;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    int tamanho() {
        return elementos.length;

    }

    String getElemento(int indice) {
        return elementos[indice];

    }

    public void addElemento(String elemento) {
        synchronized (this) {
            this.elementos[indice] = elemento;
            this.indice++;
        }
    }
}
