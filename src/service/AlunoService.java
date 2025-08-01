package service;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }


    public void listarAlunos(){

        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadrastado");
        } else {
            for (Aluno a : alunos){
                System.out.println(a);
            }
        }

    }

    public Aluno buscarAlunoPorNome(String nome){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }
        return null;
    }

    public Aluno buscarAlunoPorRA(String RA){
        for (Aluno aluno : alunos){
            if (aluno.getRA().equalsIgnoreCase(RA)){
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String RA){
        for (Aluno aluno : alunos){
            if (aluno.getRA().equalsIgnoreCase(RA)) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }
}
