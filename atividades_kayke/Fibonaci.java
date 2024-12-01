public class Fibonaci {
    //Faça um programa em Java para calcular o Fibonacci. Veja como ele é calculado aqui : https://www.todamateria.com.br/sequencia-de-fibonacci/
    public static void main(String[] args) {
        int n = 10; 
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        // vai calcular os termos 
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        // vai imprimir
        for (long term : fibonacci) {
            System.out.print(term + " ");
        }
    }


}
