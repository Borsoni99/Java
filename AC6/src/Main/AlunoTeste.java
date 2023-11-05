package Main;
import Dao.AlunoCRUD;
import Entidades.Aluno;

class AlunoTeste {
    public void testeAdicionar() {
        Aluno aluno = new Aluno("Bernardo pinto", "Engenharia de Software", 123456789);

        AlunoCRUD crud = new AlunoCRUD();
        crud.adicionar(aluno);
        System.out.println("add");
        System.out.println(aluno);

    }
    public void testeRemover() {
        Aluno aluno = new Aluno("Thiago Borsoni", "ciencia de dados", 123456789);

        AlunoCRUD crud = new AlunoCRUD();
        crud.adicionar(aluno);
        crud.remover(123456789);
        System.out.println("remover");
        System.out.println(aluno);
    }
    public void testeAtualizar() {
        Aluno aluno = new Aluno("daniel Lloyd", "Engenharia da computação", 123456789);

        AlunoCRUD crud = new AlunoCRUD();
        crud.adicionar(aluno);
        crud.atualizar(123456789, "Ciência da Computação");
        System.out.println("atualizar");
        System.out.println(aluno);

    }
    public void testeListar() {
        Aluno aluno1 = new Aluno("João da Silva", "Engenharia civil", 1234);
        AlunoCRUD crud = new AlunoCRUD();
        crud.adicionar(aluno1);
        System.out.println("listar");
        System.out.println(crud.listar(1234));
    }

    public void testeListarTodos() {
        Aluno aluno1 = new Aluno("João da Silva", "Engenharia civil", 1234);
        Aluno aluno2 = new Aluno("daniel Lloyd", "Engenharia da computação", 123456789);
        Aluno aluno3 = new Aluno("Thiago Borsoni", "ciencia de dados", 123456789);
        AlunoCRUD crud = new AlunoCRUD();
        crud.adicionar(aluno1);
        crud.adicionar(aluno2);
        crud.adicionar(aluno3);
        System.out.println("listar todos");
        for (Aluno aluno : crud.listarTodos()){
            System.out.println(aluno);
        }
    }
}