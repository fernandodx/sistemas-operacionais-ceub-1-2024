//Atividade 3

 //- Faça um programa em Java para calcular o Fibonacci. Veja como ele é calculado aqui : https://www.todamateria.com.br/sequencia-de-fibonacci/

//Objetivo: 

 //- Fazer vocês entenderem como funciona a recursividade. 

//Avaliação: 

 //- Faça um código da sua cabeça, tente resolver sem usar GPT ou qualquer site de ajuda, isso é um desafio. 
 //- Após a conclusão da tarefa, pesquise na internet como resolver esse problema usando recursividade e tente entender o que esta acontecendo. 


public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; 
         int resultado = fibonacci(n);
        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);
    }
}



