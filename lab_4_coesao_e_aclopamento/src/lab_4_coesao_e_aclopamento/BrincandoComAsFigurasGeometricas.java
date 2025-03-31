package lab_4_coesao_e_aclopamento;


public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {
		/*
		int retangulo;
		int quadrado;
		int circulo;
		int triangulo;
		
		FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);
		*/
		try {
			FigurasGeometricas retangulo = new Retangulo(10, 5);
			System.out.println("Área do retângulo: " + retangulo.calcularArea());
			System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no retângulo: " + e.getMessage());
		}

		try {
			FigurasGeometricas quadrado = new Quadrado(7);
			System.out.println("Área do quadrado: " + quadrado.calcularArea());
			System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no quadrado: " + e.getMessage());
		}

		try {
			FigurasGeometricas circulo = new Circulo(7);
			System.out.println("Área do círculo: " + circulo.calcularArea());
			System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no círculo: " + e.getMessage());
		}

		try {
			FigurasGeometricas triangulo = new Triangulo(3, 25, 3, 4, 5);
			System.out.println("Área do triângulo: " + triangulo.calcularArea());
			System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro no triângulo: " + e.getMessage());
		}
	}
		
/*
		
		String inf = fig.toStringDaFigura(-1);
		inf = fig.toStringDaFigura(1);
		System.out.println(inf);
		inf = fig.toStringDaFigura(0);
		System.out.println(inf);
		inf = fig.toStringDaFigura(4);
		System.out.println(inf);
		inf = fig.toStringDaFigura(2);
		System.out.println(inf);*/
	}



