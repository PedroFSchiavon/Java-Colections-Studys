package br.com.alura;

public class Aula implements Comparable<Aula>{
    private String nomeAula;
    private int tempoDuracao;

    public Aula(String nomeAula, int tempoDuracao){
        this.nomeAula = nomeAula;
        this.tempoDuracao = tempoDuracao;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.nomeAula + " duração: " + tempoDuracao + "]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nomeAula.compareTo(outraAula.nomeAula);
    }
}
