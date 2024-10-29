package src.main.java;

public class COFINS implements Imposto {
    @Override
    public float calcular(float valor) {
        return valor * 0.076f;
    }
}
