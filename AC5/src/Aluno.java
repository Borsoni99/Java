public class Aluno {

    private String nome;
    private String curso;
    private int matricula;

    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula; 
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", curso='" + getCurso() + "'" +
            ", matricula='" + getMatricula() + "'" +
            "}";
    }

}
