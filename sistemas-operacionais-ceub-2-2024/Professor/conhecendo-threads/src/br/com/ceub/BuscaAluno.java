package br.com.ceub;

public class BuscaAluno {

	public static void main(String[] args) {
		
		String nome = "Silva";
		
		Thread threadAlunos1 = new Thread(new TarefaBuscaNome("src/turma1.txt", nome));
		Thread threadAlunos2 = new Thread(new TarefaBuscaNome("src/turma2.txt", nome));
		Thread threadCientistas = new Thread(new TarefaBuscaNome("src/cientistas.txt", nome));
		
		threadAlunos1.start();
		threadAlunos2.start();
		threadCientistas.start();
		
		
		

	}

}
