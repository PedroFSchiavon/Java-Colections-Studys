package br.com.alura.teste;

import br.com.alura.Aula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TesteAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Curso intensivo de java", 15);
        Aula a2 = new Aula("Aprendendo a usar Maven!", 10);
        Aula a3 = new Aula("Javascript para iniciantes", 30);
        Aula a4 = new Aula("Fafa de belem vs Ester tigresa", 60);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        aulas.add(a4);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempoDuracao));

        System.out.println(aulas);
    }
}
