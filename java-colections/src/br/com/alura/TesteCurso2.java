package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
    public static void main(String[] args) {
        Curso cursoColecoes = new Curso("Aprofundando em coleções", "Paulo Silveira");
//        Curso javaBasico = new Curso("Modulo básico de Java", "Nico Stephan");
//        Curso nodeJs = new Curso("Iniciando com JavaScript", "Moça alura");

        cursoColecoes.adiciona(new Aula("Herança lista", 20));
        cursoColecoes.adiciona(new Aula("Aprendendo sobre coleções", 16));
        cursoColecoes.adiciona(new Aula("Mapeando as coleções.", 19));

        List<Aula> aulas = new ArrayList<>(cursoColecoes.getAulas());
        Collections.sort(aulas);
        System.out.println(cursoColecoes.getAulas());
        System.out.println(aulas);

        System.out.println(cursoColecoes.duracaoTotal());

        System.out.println(cursoColecoes);
    }
}
