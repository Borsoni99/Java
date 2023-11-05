package Dao;
import java.util.ArrayList;
import java.util.List;

import Entidades.Aluno;

public class AlunoDao {

    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void remover(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                return;
            }
        }
    }

    public void atualizar(int matricula, String curso) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                aluno.setCurso(curso);
                return;
            }
        }
    }

    public Aluno listar(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listar() {
        return alunos;
    }

}
