package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.Collections;
import java.util.Set;

public class TesteAlunoCurso {
    public static void main(String[] args) {
        Curso cursoColecoes = new Curso("Aprofundando em coleções", "Paulo Silveira");
        cursoColecoes.adiciona(new Aula("Herança lista", 20));
        cursoColecoes.adiciona(new Aula("Aprendendo sobre coleções", 16));
        cursoColecoes.adiciona(new Aula("Mapeando as coleções.", 19));

        cursoColecoes.matricular(new Aluno("Pedro", 1111));
        cursoColecoes.matricular(new Aluno("Luqueira", 2222));
        cursoColecoes.matricular(new Aluno("Cristiano", 3333));
        cursoColecoes.matricular(new Aluno("Jeremias", 4444));
        cursoColecoes.matricular(new Aluno("Anna", 5555));
        cursoColecoes.matricular(new Aluno("Andressa", 6666));

        cursoColecoes.getAlunos().forEach(aluno -> System.out.println(aluno ));

        Set<String> teste = Collections.emptySet();

        teste.add("Cavalo");
        System.out.println(teste);
    }
}
