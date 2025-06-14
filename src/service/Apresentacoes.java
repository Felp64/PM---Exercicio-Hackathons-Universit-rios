package service;

import java.util.*;

import model.Apresentacao;
import model.Projeto;

public class Apresentacoes {
    private List<Apresentacao> lista = new ArrayList<>();

    private Apresentacoes() {
    }

    private static class Holder {
        private static final Apresentacoes INSTANCE = new Apresentacoes();
    }

    public static Apresentacoes getInstancia() {
        return Holder.INSTANCE;
    }

    public void adicionar(Apresentacao apresentacao) {
        lista.add(apresentacao);
    }

    public List<Apresentacao> pesquisarPorProjeto(Projeto projeto) {
        return lista.stream().filter(a -> a.getProjeto().equals(projeto)).toList();
    }
}