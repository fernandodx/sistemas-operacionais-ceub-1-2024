package br.com.ceub;

public class BuscarAluno {

	public static void main(String[] args) {
		
		String nome = "Jaiston";
		
		Thread threadAlunos1 = new Thread(new TarefaBuscaNome("tuma1.txt",nome));
		Thread threadAlunos2 = new Thread(new TarefaBuscaNome("turma2.txt",nome));
		Thread threadCientistas = new Thread(new TarefaBuscaNome("cientistas.txt",nome));
		
		threadAlunos1.start();
		threadAlunos2.start();
		threadCientistas.start();
		


	}

}
