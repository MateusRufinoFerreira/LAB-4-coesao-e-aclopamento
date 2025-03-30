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
		 	FigurasGeometricas retangulo = new Retangulo(10, 5);
	        FigurasGeometricas quadrado = new Quadrado(7);
	        FigurasGeometricas circulo = new Circulo(7);
	        FigurasGeometricas triangulo = new Triangulo(3, 25, 3, 4, 5);

	        System.out.println("Área do retângulo: " + retangulo.calcularArea());
	        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

	        System.out.println("Área do quadrado: " + quadrado.calcularArea());
	        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

	        System.out.println("Área do círculo: " + circulo.calcularArea());
	        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

	        System.out.println("Área do triângulo: " + triangulo.calcularArea());
	        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
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


