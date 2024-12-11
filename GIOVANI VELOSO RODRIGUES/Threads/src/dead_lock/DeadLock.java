/*O deadlock acontece quando duas ou mais threads ficam presas indefinidamente, esperando os recursos que nunca serão liberados.  
  isso pode acontecer com sistemas de sofware concorrente.*/



package dead_lock;
public class DeadLock{
    private static final Object recurso1 = new Object();
    private static final Object recurso2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1: bloqueou recurso 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (recurso2) {
                    System.out.println("Thread 1: bloqueou recurso 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread 2: bloqueou recurso 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (recurso1) {
                    System.out.println("Thread 2: bloqueou recurso 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
