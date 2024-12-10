public class App {
    public static void main(String[] args) throws Exception {

        Departamento departamento = new Departamento("Ciência");
        Disciplina disciplina = new Disciplina("Sistemas Operacionais", departamento);
        Disciplina disciplina2 = new Disciplina("Sistema Operacionais 2", departamento);

        System.out.println(disciplina == disciplina2);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Disciplina 2: " + disciplina2);

        // DESCOBRIR COMO COMPARAR ESSAS DUAS DISCIPLINAS E RETORNAR TRUE!!!!!!!!

        // Adiciona a disciplina ao departamento
        // departamento.adicionarDisciplina(disciplina);
        // tentar imprimir os detalhes do departamento
        // departamento.imprimirDetalhes();

    }
}
