import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
        } else {
            System.out.println("Sequência Fibonacci até " + n + " termos:");
            
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        
        scanner.close();
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num; 
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2); 
        }
    }
}

