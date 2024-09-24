package app_lista;

public class TarefaAdicional implements Runnable {

    private Lista lista;
    private int numeroThread;

    public TarefaAdicional(Lista lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            lista.addElementos("Thread " + numeroThread + "- loop: " + i);
        }

    }

}