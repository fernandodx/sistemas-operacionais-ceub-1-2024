import java.util.Scanner;

public class FibonacciCalculator {

    // Método recursivo para calcular Fibonacci
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Método iterativo para calcular Fibonacci
    public static int fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n para calcular o Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Escolha o método:");
        System.out.println("1. Recursivo");
        System.out.println("2. Iterativo");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Fibonacci de " + n + " (Recursivo): " + fibonacciRecursivo(n));
        } else if (escolha == 2) {
            System.out.println("Fibonacci de " + n + " (Iterativo): " + fibonacciIterativo(n));
        } else {
            System.out.println("Escolha inválida!");
        }

        scanner.close();
    }
}
