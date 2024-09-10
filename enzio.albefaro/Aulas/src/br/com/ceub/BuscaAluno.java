package br.com.ceub;

public class BuscaAluno {

	private static final String Silva = null;

	public static void main(String[] args) {

		String nome = "Enzio";
		
		Thread threadAlunos1 = new Thread(new TarefaBuscaNome("src/turma1.txt", Silva));
//		Thread threadAlunos2 = new Thread(new TarefaBuscaNome("turma2.txt", nome));
//		Thread threadcientistas = new Thread(new TarefaBuscaNome("cientistas.txt", nome));
		
		threadAlunos1.start();
//		threadAlunos2.start();
//		threadcientistas.start();
		
		
		
	}

}
