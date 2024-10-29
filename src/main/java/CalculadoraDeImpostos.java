package src.main.java;

public class CalculadoraDeImpostos {
    private float valorImposto;

    public float getValorImposto() {
        return valorImposto;
    }

    public void calcularICMS(Produto produto) {
        Calculadora calculadora = new Calculadora(produto.getValor());
        this.valorImposto = calculadora.calcular(new ICMS());
    }

    public void calcularISS(Produto produto) {
        Calculadora calculadora = new Calculadora(produto.getValor());
        this.valorImposto = calculadora.calcular(new ISS());
    }

    public void calcularIPI(Produto produto) {
        Calculadora calculadora = new Calculadora(produto.getValor());
        this.valorImposto = calculadora.calcular(new IPI());
    }

    public void calcularCOFINS(Produto produto) {
        Calculadora calculadora = new Calculadora(produto.getValor());
        this.valorImposto = calculadora.calcular(new COFINS());
    }

    public void calcularPIS(Produto produto) {
        Calculadora calculadora = new Calculadora(produto.getValor());
        this.valorImposto = calculadora.calcular(new PIS());
    }
}
