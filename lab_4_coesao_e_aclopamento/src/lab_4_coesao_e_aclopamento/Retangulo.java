package lab_4_coesao_e_aclopamento;

class Retangulo extends FigurasGeometricas {
    private double altura, largura;

    public Retangulo(double altura, double largura) {
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
