package org.example.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaGeometricaTest {

    @Test
    void deveDesenharQuadrao2D() {
        Desenhar desenhar = new DesenharQuadrado();
        FormaGeometrica formaGeometrica = new FormaGeometrica(desenhar);
        assertEquals("Desenhar um Quadrado", formaGeometrica.desenho2D());
    }

    @Test
    void deveDesenharCirculo2D() {
        Desenhar desenhar = new DesenharCirculo();
        FormaGeometrica formaGeometrica = new FormaGeometrica(desenhar);
        assertEquals("Desenhar um Circulo", formaGeometrica.desenho2D());

    }

    @Test
    void deveDesenharQuadrao3D() {
        Desenhar desenhar = new DesenharQuadrado();
        FormaGeometrica formaGeometrica = new FormaGeometrica(desenhar);
        assertEquals("Desenhar um Cubo", formaGeometrica.desenho3D());
    }

    @Test
    void deveDesenharCirculo3D() {
        Desenhar desenhar = new DesenharCirculo();
        FormaGeometrica formaGeometrica = new FormaGeometrica(desenhar);
        assertEquals("Desenhar uma Esfera", formaGeometrica.desenho3D());

    }

}