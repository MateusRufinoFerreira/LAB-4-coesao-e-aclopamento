package lab_4_coesao_e_aclopamento;

public class Circulo extends FigurasGeometricas {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0)
            throw new IllegalArgumentException("Raio deve ser positivo.");
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
