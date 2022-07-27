package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new ArrayList<>();

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

    @Override
    public String toString() {
        return "[Curso: " + nome + ", Duração: " + duracaoTotal() + ", \nAulas: " + aulas + "]";
    }
}
