package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.CalculadoraDeImpostos;
import src.main.java.Produto;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeImpostosTest {

    @Test
    void deveCalcularICMS() {
        Produto produto = new Produto(1000.0f);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcularICMS(produto);
        assertEquals(180.0f, calculadora.getValorImposto());
    }

    @Test
    void deveCalcularISS() {
        Produto produto = new Produto(1000.0f);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcularISS(produto);
        assertEquals(50.0f, calculadora.getValorImposto());
    }

    @Test
    void deveCalcularIPI() {
        Produto produto = new Produto(1000.0f);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcularIPI(produto);
        assertEquals(100.0f, calculadora.getValorImposto());
    }

    @Test
    void deveCalcularCOFINS() {
        Produto produto = new Produto(1000.0f);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcularCOFINS(produto);
        assertEquals(76.0f, calculadora.getValorImposto());
    }

    @Test
    void deveCalcularPIS() {
        Produto produto = new Produto(1000.0f);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcularPIS(produto);
        assertEquals(16.5f, calculadora.getValorImposto());
    }
}
