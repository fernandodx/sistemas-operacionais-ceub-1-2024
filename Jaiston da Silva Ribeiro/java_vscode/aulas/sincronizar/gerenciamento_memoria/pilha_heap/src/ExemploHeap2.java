public class ExemploHeap2 {

    public static void main(String[] args) {
        

    
    StringBuffer resultado = new StringBuffer();

    Thread thread1 = new Thread(() -> {
        for(int i=0; i<100; i++){
            resultado.append(i);
            resultado.append(" ");
        }
    });

    Thread thread2 = new Thread(() -> {
        for(int i=101; i<200; i++){
            resultado.append(i);
            resultado.append(" ");
        }    
    });

    thread1.start();
    thread2.start();

    System.out.println(resultado.toString());
    try{
        thread1.join();
        thread2.join();
    }catch(InterruptedException e){
        System.out.println(resultado.toString());
    }

}
}
