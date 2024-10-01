package app_lista;

public class BuscarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Silva";
		
		Thread threadAlunos1 = new Thread(new TarefaBuscaNome("src/app_lista/turma1.txt", nome));
		Thread threadAlunos2 = new Thread(new TarefaBuscaNome("src/app_lista/turma2.txt", nome));
		Thread threadCientistas = new Thread(new TarefaBuscaNome("src/app_lista/cientistas.txt", nome));
		
		threadAlunos1.start();
		threadAlunos2.start();
		threadCientistas.start();

	}

}



