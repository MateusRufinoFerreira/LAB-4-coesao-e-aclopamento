package lab_4_coesao_e_aclopamento;

public class Quadrado extends FigurasGeometricas {
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0)
            throw new IllegalArgumentException("Lado deve ser positivo.");
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
