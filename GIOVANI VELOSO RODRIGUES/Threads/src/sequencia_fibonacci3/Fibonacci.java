package sequencia_fibonacci3;

public class Fibonacci{
	static int numeroVezes = 10;
	
   public static void main(String[] args) {
		for(int i = 0; i< numeroVezes; i++) {
			System.out.println("O resultado do termo numero "+ numeroVezes + " é " + calculo(i) + ". " + i + " de " + numeroVezes);
		}
	}
	
	public static int calculo(int n) {
		if (n == 1) {
			return n;
		}
		
		int termoResultado = (n - 1) + (n - 2);
		return termoResultado;
	}
}