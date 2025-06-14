package model;

import java.util.*;

public class Apresentacao {
    private List<Jurado> jurados = new ArrayList<>();
    private Projeto projeto;

    public Apresentacao(Projeto projeto) {
        this.projeto = projeto;
    }

    public void adicionarJurado(Jurado jurado) {
        jurados.add(jurado);
    }

    public void calcularNotaFinal() {
        double soma = jurados.stream().mapToDouble(Jurado::getNota).sum();
        double media = soma / jurados.size();
        projeto.setNotaFinal(media);
    }

    public Projeto getProjeto() {
        return this.projeto;
    }
}
