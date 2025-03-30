package lab_4_coesao_e_aclopamento;


abstract class FigurasGeometricas {
	
	
	public abstract double calcularArea();
    public abstract double calcularPerimetro();
    }

	//public static final int R = -1;
	//public static final int Q = 0;
	//public static final int C = 1;
	//public static final int T = 2;
	/*
	private int alturaRetangulo;
	private int larguraRetangulo;
	private int ladoQuadrado;
	private int raioCirculo;
	private int alturaTriangulo;
	private int baseTriangulo;
	private int lado1Triangulo;
	private int lado2Triangulo;
	private int lado3Triangulo;
	
	public FigurasGeometricas(int alturaRetangulo, int larguraRetangulo, int ladoQuadrado, int raioCirculo,int alturaTriangulo,int baseTriangulo,int lado1Triangulo,int lado2Triangulo,int lado3Triangulo){
		this.alturaRetangulo = alturaRetangulo;
		this.larguraRetangulo = larguraRetangulo;
		this.ladoQuadrado = ladoQuadrado;
		this.raioCirculo = raioCirculo;
		this.alturaTriangulo = alturaTriangulo;
		this.baseTriangulo = baseTriangulo;
		this.lado1Triangulo = lado1Triangulo;
		this.lado2Triangulo = lado2Triangulo;
		this.lado3Triangulo = lado3Triangulo;
	}	*/
	
	/*public void a(int tipoDaFigura){
		switch (tipoDaFigura) {
		case R:
			System.out.println("A área deste retângulo é: " + alturaRetangulo * larguraRetangulo);
			break;
		case Q:
			System.out.println("A área deste quadrado é: " + 2 * larguraQuadrado);
			break;
		case C:
			System.out.println("A área deste círculo é: " + (2 * 3.14 * raioCirculo));
			break;
		case T:
			System.out.println("Todas as áreas são: " +  (alturaRetangulo * larguraRetangulo) + " " + (2 * larguraQuadrado) + " e " 
					+ (2 * 3.14 * raioCirculo) + " retângulo, quadrado e círculo, respectivamente");
			break;
		default:
			System.out.println("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
			break;
		}/**/
	
	
	/*private double resultado = 0;
    private double pi = 3.14;
	    public double areaPerimetro(String calculo, String tipoDaFigura, double valor1, double valor2, double valor3) {
	        

	        if (calculo.equals("area")) {
	            if (tipoDaFigura.equals("retangulo")) {
	                resultado = valor1 * valor2;
	            } else if (tipoDaFigura.equals("quadrado")) {
	                resultado = valor1 * valor1;
	            } else if (tipoDaFigura.equals("circulo")) {
	                resultado = pi * (valor1 * valor1);
	            } else if (tipoDaFigura.equals("triangulo")) {
	                resultado = (valor1 * valor2) / 2;
	            } else {
	                System.out.println("Nome de figura inválido");
	            }
	        } else if (calculo.equals("perimetro")) {
	            if (tipoDaFigura.equals("retangulo")) {
	                resultado = 2 * (valor1 + valor2);
	            } else if (tipoDaFigura.equals("quadrado")) {
	                resultado = 4 * valor1;
	            } else if (tipoDaFigura.equals("circulo")) {
	                resultado = 2 * pi * valor1;
	            } else if (tipoDaFigura.equals("triangulo")) {
	                resultado = valor1 + valor2 + valor3;
	            } else {
	                System.out.println("Nome de figura inválido");
	            }
	        } else {
	            System.out.println("Cálculo inválido");
	        }
	        System.out.println("A(O)"+ calculo + " do "+ tipoDaFigura +" é: "+ resultado);
	        return resultado; 
	    }
	}
}
	
	
	
	public int perimetro(String tipoDaFigura){
		
		int perimetro;
		
		if (tipoDaFigura == "retangulo"){
			perimetro = (2 * alturaRetangulo) + (2 * larguraRetangulo);
			System.out.println("O perímetro do retângulo é: " + perimetro);
		}else if (tipoDaFigura == "quadrado"){
			perimetro = 4 * ladoQuadrado;
			System.out.println("O perímetro do quadrado é: " + perimetro);
		}else if (tipoDaFigura == "circulo"){
			perimetro = (int) (3.14 * raioCirculo);
			System.out.println("O perímetro do círculo é: " + perimetro);
		}else if (tipoDaFigura == "triangulo"){
			perimetro = -234;
		}else{
			perimetro = -2658;
		}
		return perimetro;
	}
	
	public String toStringDaFigura(int tipoDaFigura){
		String toString;
		switch (tipoDaFigura) {
		case R:
			toString = "O retângulo criado tem altura de tamanho: " + alturaRetangulo + 
			"e largura de tamanho: " + larguraRetangulo;
			break;
		case Q:
			toString = "O quadrado criado tem lados de tamanho: " + larguraQuadrado; 
			break;
		case C:
			toString = "O circulo criado tem raio de tamanho: " + raioCirculo;
			break;
		case T:
			toString = "O retângulo criado tem altura: " + alturaRetangulo + " e largura de: " + larguraRetangulo +
			" O quadrado criado tem lados de: " + larguraQuadrado +
			" O circulo criado tem raio de: " + raioCirculo;
			break;

		default:
			toString = null;
			break;
		}
		return toString;
	}
}*/

