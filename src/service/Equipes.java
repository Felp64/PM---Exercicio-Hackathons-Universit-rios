package service;

import java.util.*;

import model.Equipe;

public class Equipes {
    private List<Equipe> lista = new ArrayList<>();

    private Equipes() {
    }

    private static class Holder {
        private static final Equipes INSTANCE = new Equipes();
    }

    public static Equipes getInstancia() {
        return Holder.INSTANCE;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public Equipe pesquisarPorAluno(String aluno) {
        return lista.stream().filter(e -> e.getAlunos().contains(aluno)).findFirst().orElse(null);
    }

    public List<Equipe> getLista() {
        return lista;
    }
}