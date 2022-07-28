package br.com.alura;

import java.util.Objects;

public class Aluno {
    private final String nome;
    private final int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        if (nome == null || nome.length() < 3){
            throw new NullPointerException("Esse campo não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Aluno outroAluno = (Aluno) obj;
//        return this.nome.equals(outroAluno.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return this.nome.hashCode();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "[ Aluno: " + nome + "; Matricula: " + numeroMatricula + " ]";
    }
}
