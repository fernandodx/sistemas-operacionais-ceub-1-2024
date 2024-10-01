public class App {
    public static void main(String[] args) throws Exception {
        Departamento departamento = new Departamento("Ciência");
        Disciplina disciplina = new Disciplina("Sitemas Operacionais w", departamento);

        Disciplina disciplina2 = new Disciplina("Sistemas Operacionais", departamento);

        System.err.println(disciplina.equals(disciplina2));

        // System.out.println(disciplina == disciplina2);
        // System.out.println("Disciplina" + disciplina);
        // System.out.println("Disciplina 2" + disciplina2);

        disciplina = disciplina2;

        // System.out.println(disciplina == disciplina2);
        // System.out.println("Disciplina" + disciplina);
        // System.out.println("Disciplina 2" + disciplina2);

        // Adiciona a diciplina ao departamento

        // departamento.AdicionarDiciplina(disciplina);

        // tentar imprimir os detalhes do depatarmento
        // departamento.imprimirDetalhes();
    }
}
