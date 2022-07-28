package br.com.alura.teste;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TestandoLista {
    public static void main(String[] args) {
        String aula1 = "Mavem, como utilizar!";
        String aula2 = "Spring boot na pratica";
        String aula3 = "Aprendendo o lixo do nodeJS";

        ArrayList<String> aulas = new ArrayList<String>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        //aulas.remove(0);
        System.out.println(aulas);

        System.out.println("O primeiro indice da lista é o: " + aulas.get(0));

        for (String aula:
             aulas) {
            System.out.println(aula);
        }

        aulas.sort(null);

        System.out.println(aulas);
    }
}
