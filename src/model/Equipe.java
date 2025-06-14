package model;

import java.util.*;

public class Equipe {
    private List<String> alunos = new ArrayList<>();
    private Projeto projeto;

    public void adicionarAluno(String aluno) {
        alunos.add(aluno);
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}