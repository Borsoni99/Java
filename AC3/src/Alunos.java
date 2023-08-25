public class Alunos {
    String nome;
    String matricula;
    int idade;
    String curso;

    Alunos(String nome, String matricula, int idade, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    void inscricaoEvento(Eventos evento){
        evento.alunos = this;
    }


}
