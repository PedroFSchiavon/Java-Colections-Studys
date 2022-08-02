package br.com.alura.testes;

import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.List;

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

    }
}
