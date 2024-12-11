package app_lista;

import java.util.List;

public class Tarefa implements Runnable {

    private List<String> lista;
    private int numeroThread;

    public Tarefa(List<String> lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            lista.add("Thread " + numeroThread + "- loop: " + i);
        }

    }

}
