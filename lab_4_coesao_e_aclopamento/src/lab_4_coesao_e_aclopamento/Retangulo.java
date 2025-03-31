package lab_4_coesao_e_aclopamento;

public class Retangulo extends FigurasGeometricas {
    private double altura, largura;

    public Retangulo(double altura, double largura) {
        if (altura <= 0 || largura <= 0)
            throw new IllegalArgumentException("Altura e largura devem ser positivas.");
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
