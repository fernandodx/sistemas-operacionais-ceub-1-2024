package br.com.ceub;

public class BuscaAluno {

	public static void main(String[] args) {
		
		String nome ="Jaiston";
		
		Thread threadAluno1 = new Thread(new TarefaBuscaNome("src/turma1.txt", nome));
		Thread threadAluno2 = new Thread(new TarefaBuscaNome("src/turma2.txt", nome));
		Thread threadCientistas = new Thread(new TarefaBuscaNome("src/Cientistas.txt", nome));
		
		threadAluno1.start();
		threadAluno2.start();
		threadCientistas.start();
		
		// TODO Auto-generated method stub

	}

}
