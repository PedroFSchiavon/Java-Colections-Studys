package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TesteCursoMaps {
    public static void main(String[] args) {
        Curso cursoColecoes = new Curso("Aprofundando em coleções", "Paulo Silveira");
        cursoColecoes.adiciona(new Aula("Herança lista", 20));
        cursoColecoes.adiciona(new Aula("Aprendendo sobre coleções", 16));
        cursoColecoes.adiciona(new Aula("Mapeando as coleções.", 19));

        Aluno a1 = new Aluno("Pedro", 1111);
        Aluno a2 = new Aluno("Luqueira", 2222);
        Aluno a3 = new Aluno("Cristiano", 3333);
        Aluno a4 = new Aluno("Jeremias", 4444);
        Aluno a5 = new Aluno("Anna", 5555);
        Aluno a6 = new Aluno("Andressa", 6666);

        cursoColecoes.matricular(a1);
        cursoColecoes.matricular(a2);
        cursoColecoes.matricular(a3);
        cursoColecoes.matricular(a4);
        cursoColecoes.matricular(a5);
        cursoColecoes.matricular(a6);

        System.out.println("Procurando o aluno de matricula 1111");
        System.out.println("Aluno: " + cursoColecoes.buscaPorMatricula(1234));
    }
}
