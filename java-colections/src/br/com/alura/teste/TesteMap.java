package br.com.alura.teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();
        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        Map<String, Integer> nomesParaIdade = new HashMap<>();

        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        //pessoas.forEach((key, value) -> System.out.println("Id: " + key + "| Nome: " + value));
        Set<Map.Entry<String, Integer>> associacaos = nomesParaIdade.entrySet();
        //nomesParaIdade.entrySet().forEach(map -> System.out.println(map));
        for (Map.Entry<String,Integer> associacao: associacaos) {
            System.out.println(associacao.getKey() + "=_=_=" + associacao.getValue());
        }
    }
}
