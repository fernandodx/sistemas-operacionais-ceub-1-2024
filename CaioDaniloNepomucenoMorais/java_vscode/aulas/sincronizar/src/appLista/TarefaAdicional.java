package appLista;

import java.util.List;

public class TarefaAdicional implements Runnable {
    private List<String> lista;
    private int numeroThreads;

    public TarefaAdicional(List<String> lista, int numeroThreads) {
        this.lista = lista;
        this.numeroThreads = numeroThreads;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            lista.add("Thread" + numeroThreads + "- loop:" + i);
        }

    }

}
