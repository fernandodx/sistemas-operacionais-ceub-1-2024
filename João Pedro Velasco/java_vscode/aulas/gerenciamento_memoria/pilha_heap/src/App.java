public class App {
    public static void main(String[] args) throws Exception {
        Departamento departamento = new Departamento("Ciência");
        Disciplina disciplina = new Disciplina("Sistemas Operacionais", departamento);
        Disciplina disciplina2 = new Disciplina("Sistemas Operacionais", departamento);

        System.out.println(disciplina == disciplina2);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Disciplina 2: " + disciplina2 + "\n");

        disciplina = disciplina2;

        System.out.println(disciplina == disciplina2);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Disciplina 2: " + disciplina2 + "\n");
        // adiciona disciplina na lista
        // departamento.adicionarDisciplina(disciplina);

        // imprime detalhes do departamento
        // departamento.imprimirDetalhes();
    }

}
