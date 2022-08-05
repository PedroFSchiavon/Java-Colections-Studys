package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void verificaSeEstaSomandoCorretamente(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(15, 13);
        Assertions.assertEquals(28, soma);
    }
}
