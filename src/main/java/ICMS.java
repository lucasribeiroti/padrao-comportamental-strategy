package src.main.java;

public class ICMS implements Imposto {
    public float calcular(float valor) {
        return valor * 0.18f;
    }
}
