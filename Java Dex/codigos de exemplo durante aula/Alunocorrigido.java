public class Alunocorrigido {
    private int matricula;
    private String nome;
    private String curso;

    // Construtor padrão
    public Alunocorrigido() {}

    // Construtor com parâmetros
    public Alunocorrigido (int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    // Getter para 'matricula'
    public int getMatricula() {
        return matricula;
    }

    // Setter para 'matricula'
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // (Caso necessário, você pode adicionar getters e setters para 'nome' e 'curso' também)
}
