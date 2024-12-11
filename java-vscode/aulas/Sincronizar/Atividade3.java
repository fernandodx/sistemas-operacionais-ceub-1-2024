//Atividade 3
//
// - Faça um programa em Java para calcular o Fibonacci. Veja como ele é calculado aqui : https://www.todamateria.com.br/sequencia-de-fibonacci/
//
// Objetivo: 
 
//  - Fazer vocês entenderem como funciona a recursividade. 
 
// Avaliação: 
 
//  - Faça um código da sua cabeça, tente resolver sem usar GPT ou qualquer site de ajuda, isso é um desafio. 
//  - Após a conclusão da tarefa, pesquise na internet como resolver esse problema usando recursividade e tente entender o que esta acontecendo. 


public class Atividade3 {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));

        // Exemplo para imprimir a sequência até o número n
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
