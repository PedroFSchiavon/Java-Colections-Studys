package br.com.alura;

public class Aluno {
    private final String nome;
    private final int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[ Aluno: " + nome + "; Matricula: " + numeroMatricula + " ]";
    }
}
