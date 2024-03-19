package org.example.abstractFactory;

public interface Desenhar {

    Desenhar2D createDesenho2D();

    Desenhar3D createDesenho3D();

}
