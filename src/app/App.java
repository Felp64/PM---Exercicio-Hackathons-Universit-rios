package app;

import java.util.*;

import model.Apresentacao;
import model.Equipe;
import model.Jurado;
import model.Projeto;
import service.Equipes;
import service.Apresentacoes;

public class App {

    public static void main(String[] args) {
        Equipes equipes = Equipes.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();

        // Cria 2 equipes com 5 alunos cada
        for (int i = 1; i <= 2; i++) {
            Equipe equipe = new Equipe();
            for (int j = 1; j <= 5; j++) {
                equipe.adicionarAluno("Aluno" + i + j);
            }
            equipes.adicionar(equipe);

            // Cria um projeto para cada equipe
            Projeto projeto = new Projeto("Projeto" + i, equipe);
            equipe.setProjeto(projeto);

            // Cria uma banca com 4 jurados
            Apresentacao apresentacao = new Apresentacao(projeto);
            for (int k = 1; k <= 4; k++) {
                double nota = 6 + Math.random() * 4; // Notas entre 6 e 10
                apresentacao.adicionarJurado(new Jurado("Jurado" + i + k, nota));
            }
            apresentacao.calcularNotaFinal();
            projeto.setBanca(apresentacao);
            apresentacoes.adicionar(apresentacao);
        }

        // Lista projetos com nota final >= 7
        System.out.println("Projetos aprovados (nota >= 7):");
        equipes.getLista().stream()
                .map(e -> e.getAlunos().size() > 0 ? e : null)
                .filter(Objects::nonNull)
                .forEach(e -> {
                    Projeto p = e.getProjeto();
                    if (p.getNotaFinal() >= 7) {
                        System.out.println(p.getNome() + " - Nota: " + p.getNotaFinal());
                    }
                });
    }
}