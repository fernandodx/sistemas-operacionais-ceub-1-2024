public class prova {
    
    public class Contador {

        private int count = 0;
    
        public synchronized void incrementar() {
            count++;
        }
    
        public int Valor() {
            return count;
        }
    
        public static void main(String[] args) {
            Contador contado = new Contador();
    
            
            Runnable tarefa = () -> {
                for (int i = 0; i < 1000; i++) {
                    contado.incrementar();
                }
            };
    
           
            Thread thread1 = new Thread(tarefa);
            Thread thread2 = new Thread(tarefa);
    
          
            thread1.start();
            thread2.start();
    
            try {
               
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            System.out.println("Valor final do contador: " + contado.obterValor());
        }
    }
    
}
