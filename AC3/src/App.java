public class App {
    public static void main(String[] args) throws Exception {
        Eventos evento = new Eventos("ibtec palestras", "12/09/2023", "auditorio", 150);
        System.out.println("nome: " + evento.nome);
        
        Alunos aluno = new Alunos("thiago", "202208553818", 24, "ciencia de dados e ia");
        System.out.println("nome: " + aluno.nome);

        aluno.inscricaoEvento(evento);

        System.out.println(evento.alunos.nome);

        PainelDeControle painelDeControle = new PainelDeControle("joao, andre, paulo", 140);

        System.out.println(painelDeControle.palestrantes);
    }
}
