package model;

public class Projeto {
    private String nome;
    private double notaFinal;
    private Equipe equipe;
    private Apresentacao banca;

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    public void setBanca(Apresentacao banca) {
        this.banca = banca;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getNome() {
        return nome;
    }
}
