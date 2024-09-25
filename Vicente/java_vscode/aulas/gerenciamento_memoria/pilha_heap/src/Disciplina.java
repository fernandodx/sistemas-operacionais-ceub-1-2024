public class Disciplina {

    private String nome;
    private Departamento departamento;

    public Disciplina(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void imprimirDetalhes() {
        System.out.println("Departamento: " + nome);
        // departamento.imprimirDetalhes();
    }
}
