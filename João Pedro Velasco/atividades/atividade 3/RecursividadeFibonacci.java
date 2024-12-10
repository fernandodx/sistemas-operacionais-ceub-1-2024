import java.util.Scanner;

public class RecursividadeFibonacci {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("qual número da sequencia de Fibonacci voce quer descobrir? ");
        int n = scanner.nextInt();
        System.out.println("o " + n + "º número da sequencia de Fibonacci é: " + fibonacci(n));
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}