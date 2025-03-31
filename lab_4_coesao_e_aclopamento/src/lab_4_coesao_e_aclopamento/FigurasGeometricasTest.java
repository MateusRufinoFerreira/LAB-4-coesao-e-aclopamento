package lab_4_coesao_e_aclopamento;

import org.junit.Test;
import static org.junit.Assert.*;

public class FigurasGeometricasTest {

    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50.0, retangulo.calcularArea(), 0.0001);
        assertEquals(30.0, retangulo.calcularPerimetro(), 0.0001);
    }

    @Test
    public void testQuadrado() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(49.0, quadrado.calcularArea(), 0.0001);
        assertEquals(28.0, quadrado.calcularPerimetro(), 0.0001);
    }

    @Test
    public void testCirculo() {
        Circulo circulo = new Circulo(7);
        assertEquals(Math.PI * 49, circulo.calcularArea(), 0.0001);
        assertEquals(2 * Math.PI * 7, circulo.calcularPerimetro(), 0.0001);
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo(3, 25, 3, 4, 5);
        assertEquals(37.5, triangulo.calcularArea(), 0.0001);
        assertEquals(12.0, triangulo.calcularPerimetro(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetanguloInvalido() {
        new Retangulo(-10, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadradoInvalido() {
        new Quadrado(-7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCirculoInvalido() {
        new Circulo(-7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTrianguloInvalido() {
        new Triangulo(3, 25, 3, 4, -5);
    }
}
