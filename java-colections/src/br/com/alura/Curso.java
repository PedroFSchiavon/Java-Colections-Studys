package br.com.alura;

import java.util.*;

public class Curso {
    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new ArrayList<>();
    private final Set<Aluno> alunos = new TreeSet<>();
    private final Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int duracaoTotal(){
        int total = 0;
        return this.aulas.stream().mapToInt(Aula::getTempoDuracao).sum();
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(this.alunos);
    }

    public void matricular(Aluno aluno){
        this.alunos.add(aluno);
        matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public Aluno buscaPorMatricula(int matricula){
        return this.matriculaParaAluno.get(matricula);
    }


    @Override
    public String toString() {
        return "[Curso: " + nome + ", Duração: " + duracaoTotal() + ", \nAulas: " + aulas + "]";
    }
}
