package br.com.alura.testes;

import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStreamCurso {
    public static void main(String[] args) {
        Curso java = new Curso("Java", 346);
        Curso python = new Curso("Python", 456);
        Curso c = new Curso("C", 127);
        Curso javascript = new Curso("Javascript", 234);
        Curso ruby = new Curso("Ruby", 121);
        Curso cSharp = new Curso("C#", 387);
        Curso linux = new Curso("Linux", 675);

        List<Curso> cursos = new ArrayList<>();
        cursos.add(java);
        cursos.add(python);
        cursos.add(c);
        cursos.add(javascript);
        cursos.add(ruby);
        cursos.add(cSharp);
        cursos.add(linux);

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));
        System.out.println("-----------STREAM----------------");
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 300)
                .forEach(curso -> System.out.println(curso.getNome()));
        Stream<String> nomeCurso = cursos.stream()
                .map(Curso::getNome);
//        System.out.println("-----------STREAM----------------");
//        cursos.stream()
//                .filter(curso -> curso.getAlunos() > 300)
//                .mapToInt(Curso::getAlunos)
//                .forEach(System.out::println);
        System.out.println("-----------STREAM----------------");
        Optional<Curso> first = cursos.stream()
                .filter(curso -> curso.getAlunos() > 300)
                .findFirst();
        first.ifPresent(curso -> System.out.println(curso.getNome()));
        System.out.println("-----------STREAM----------------");
        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);
        System.out.println("-----------STREAM----------------");
        List<Curso> cursosFiltrados = cursos.stream()
                .filter(curso -> curso.getAlunos() > 300)
                .collect(Collectors.toList());
        cursosFiltrados
                .forEach(filtrado -> System.out.println(filtrado.getNome()
                        + " Tem " + filtrado.getAlunos() + " alunos!"));
    }
}
