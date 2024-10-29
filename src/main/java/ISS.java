package src.main.java;

public class ISS implements Imposto {
    public float calcular(float valor) {
        return valor * 0.05f;
    }
}
