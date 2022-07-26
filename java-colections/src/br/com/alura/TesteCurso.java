package br.com.alura;

public class TesteCurso {
    public static void main(String[] args) {
        Curso cursoColecoes = new Curso("Aprofundando em coleções", "Paulo Silveira");
        Curso javaBasico = new Curso("Modulo básico de Java", "Nico Stephan");
        Curso nodeJs = new Curso("Iniciando com JavaScript", "Moça alura");

        System.out.println(cursoColecoes.getAulas());
        cursoColecoes.adiciona(new Aula("Herança lista", 20));
        cursoColecoes.adiciona(new Aula("Aprendendo sobre coleções", 16));

        System.out.println(cursoColecoes.getAulas());
    }
}
