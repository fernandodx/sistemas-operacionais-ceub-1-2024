public class Atividade4 {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));


        System.out.println("Sequência de Fibonacci até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}