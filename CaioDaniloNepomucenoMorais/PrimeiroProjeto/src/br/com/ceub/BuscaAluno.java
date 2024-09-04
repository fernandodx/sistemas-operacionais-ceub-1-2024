package br.com.ceub;

public class BuscaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Gabriel";
		
		Thread thereAlunos1 = new Thread(new TarefaBuscaNome("src/tuma1.txt", nome));
		Thread thereAlunos2 = new Thread(new TarefaBuscaNome("src/turma2.txt", nome));
		Thread thereCientistas = new Thread(new TarefaBuscaNome("src/cientistas.txt", nome));
		
		thereAlunos1.start();
		thereAlunos2.start();
		thereCientistas.start();
		
		
		
		
	}
	
}



