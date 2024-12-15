import java.util.Scanner;

public class Fibo {
    public class FibonacciCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de termos da sequência de Fibonacci: ");
            int n = scanner.nextInt();

            int num1 = 0, num2 = 1;

            System.out.print("Sequência de Fibonacci até " + n + " termos: ");

            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + " ");

                int nextTerm = num1 + num2;
                num1 = num2;
                num2 = nextTerm;
            }

            scanner.close();
        }
    }

}
