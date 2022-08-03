package br.com.alura.testes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TesteDatas {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(dataFutura);
        Period periodo = Period.between(dataAtual, dataFutura);
        System.out.println(periodo);
        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.of(20, 45, 13);
        Duration duracao = Duration.between(time, time1);
        System.out.println(duracao);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(dataAtual);
        System.out.println(dataFormatada);
    }
}
