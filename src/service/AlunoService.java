package service;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void setNome(String nomeDigitado) {
        this.setNome(nomeDigitado);
    }


    public String getNome() {
        return getNome();
    }

    public void listarAlunos(){

        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadrastado");
        } else {
            for (Aluno a : alunos){
                System.out.println("Aluno: " + a);
            }
        }

    }
}
