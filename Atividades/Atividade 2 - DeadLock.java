    // - Pesquise e responda. O que é um DeadLock? Quais os problemas podem acontecer em uma aplicação quando isso acontecer. 

//Um deadlock ocorre quando dois ou mais processos ficam travados, esperando que um libere o recurso necessário para o outro, sem que isso aconteça. É como duas pessoas tentando passar por uma porta estreita ao mesmo tempo, sem ceder, resultando em um bloqueio mútuo.

//Esse problema pode fazer a aplicação congelar, reduzir a eficiência do sistema ao bloquear recursos e causar insatisfação ao usuário devido a falhas aparentes. Em sistemas críticos, os riscos aumentam, podendo ocorrer perda de dados ou falhas de segurança.

//Para evitar deadlocks, os desenvolvedores podem organizar melhor a ordem de uso dos recursos, definir tempos máximos de espera ou usar algoritmos que detectem e solucionem o problema automaticamente. Isso garante maior estabilidade e desempenho do sistema.

    //- Faça um exemplo de um código em java que dê Deadlock. 

  public class DeadlockExample {
    static class Recurso {
        private final String nome;

        public Recurso(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Recurso recurso1 = new Recurso("Recurso 1");
        Recurso recurso2 = new Recurso("Recurso 2");

                Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1 bloqueou " + recurso1.getNome());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recurso2) {
                    System.out.println("Thread 1 bloqueou " + recurso2.getNome());
                }
            }
        });

        
        Thread thread2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread 2 bloqueou " + recurso2.getNome());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recurso1) {
                    System.out.println("Thread 2 bloqueou " + recurso1.getNome());
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
