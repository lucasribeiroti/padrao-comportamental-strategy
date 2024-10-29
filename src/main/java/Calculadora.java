package src.main.java;

public class Calculadora {
    private float valor;

    public Calculadora(float valor) {
        this.valor = valor;
    }

    public float calcular(Imposto imposto) {
        return imposto.calcular(valor);
    }
}
