package org.example.abstractFactory;

public class DesenharQuadrado implements Desenhar {

    @Override
    public Desenhar2D createDesenho2D() {
        return new Quadrado2D();
    }

    @Override
    public Desenhar3D createDesenho3D() {
        return new Quadrado3D();
    }
}
