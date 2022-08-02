package br.com.alura.testes;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class TesteLambda {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Era uma vez a Broa");
        palavras.add("A broa é muito fofa");
        palavras.add("O que ninguem te contou, é que a broa na verdade é um bebé");
        palavras.add("Hahahaha");

        palavras.forEach(System.out::println);
//        palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
        //palavras.sort(comparing(String::length));
        palavras.sort(String::compareTo);
        System.out.println("--------------------------------------------");
        palavras.forEach(palavra -> System.out.println(palavra));
    }
}
