package src.main.java;

public class PIS implements Imposto {
    @Override
    public float calcular(float valor) {
        return valor * 0.0165f;
    }
}
