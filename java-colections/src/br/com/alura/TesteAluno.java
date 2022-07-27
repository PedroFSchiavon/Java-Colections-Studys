package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Nico");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Ester");
        boolean foiAdicionado = alunos.add("Nico");

        for (String aluno: alunos) {
            System.out.print(aluno + " -> ");
        }
        System.out.println("\n" + alunos.size());
        System.out.println(foiAdicionado);
    }
}
