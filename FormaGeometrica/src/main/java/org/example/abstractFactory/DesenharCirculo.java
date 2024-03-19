package org.example.abstractFactory;

public class DesenharCirculo implements Desenhar{

    @Override
    public Desenhar2D createDesenho2D() {
        return new Circulo2D();
    }

    @Override
    public Desenhar3D createDesenho3D() {
        return new Circulo3D();
    }
}
