# Hackathons Universitários

Este projeto simula a organização e avaliação de hackathons universitários, permitindo o cadastro de equipes, projetos, jurados e apresentações, além do cálculo automático das notas finais dos projetos.

🎓 Universidade Pontifícia Universidade Católica de Minas Gerais

Bacharel em Engenharia de Software – Campus Coração Eucarístico

Disciplina: Programação Modular

Professor: Daniel Kansaon

# Aluno

Felipe Augusto Mendes Pereira

## Estrutura do Projeto

- **app/**  
  Contém a classe principal (`App.java`) responsável por executar o fluxo do sistema.

- **model/**  
  Contém as entidades do domínio:  
  - `Equipe`: representa uma equipe de alunos.  
  - `Projeto`: representa um projeto submetido por uma equipe.  
  - `Jurado`: representa um jurado avaliador.  
  - `Apresentacao`: representa a apresentação de um projeto para a banca.

- **service/**  
  Contém os gerenciadores Singleton:  
  - `Equipes`: gerencia todas as equipes cadastradas.  
  - `Apresentacoes`: gerencia todas as apresentações realizadas.

## Funcionalidades

- Cadastro de equipes e alunos.
- Cadastro de projetos vinculados a equipes.
- Cadastro de jurados e notas para cada apresentação.
- Cálculo automático da nota final de cada projeto.
- Listagem dos projetos aprovados (nota final >= 7).

## Como Executar

1. **Pré-requisitos:**  
   - Java 17 ou superior instalado.

2. **Compilação:**  
   Compile todos os arquivos Java dentro da pasta `src`:
   ```sh
   javac -d bin src/model/*.java src/service/*.java src/app/App.java
   ```

3. **Execução:**  
   Execute a aplicação:
   ```sh
   java -cp bin app.App
   ```

## Exemplo de Saída

```
Projetos aprovados (nota >= 7):
Projeto1 - Nota: 8.25
Projeto2 - Nota: 7.75
```

## Observações

- O projeto utiliza o padrão Singleton para os gerenciadores de equipes e apresentações.
- As notas dos jurados são geradas aleatoriamente entre 6 e 10 para fins de simulação.
- O código está organizado em pacotes para facilitar a manutenção e evolução.

---