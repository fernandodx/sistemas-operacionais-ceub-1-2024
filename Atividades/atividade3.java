public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;  // Número de termos da sequência que você deseja calcular
        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Função recursiva para calcular o n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Caso base: F(0) = 0 e F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursão: F(n) = F(n-1) + F(n-2)
        }
    }
}
