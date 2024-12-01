public class App {
    public static void main(String[] args) throws Exception {

        Departamento departamento = new Departamento("Ciência");

        Disciplina disciplina = new Disciplina("Sistemas Operacionais w", departamento);
        Disciplina disciplina2 = new Disciplina("Sistemas Operacionais", departamento);

        System.out.println(disciplina.equals(disciplina2));

        // System.out.println(disciplina == disciplina2);
        // System.out.println("Disciplina: " + disciplina);
        // System.out.println("Disciplina 2: " + disciplina2);

        // disciplina = disciplina2;

        // System.out.println(disciplina == disciplina2);

        // System.out.println("Disciplina: " + disciplina);
        // System.out.println("Disciplina 2: " + disciplina2);

        // Adiciona a disciplina ao departamento
        // departamento.adicionarDisciplina(disciplina);

        // tentar imprimir os detalhes do departamento
        // departamento.imprimirDetalhes();
    }
}
