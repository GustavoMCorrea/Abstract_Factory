package org.example.abstractFactory;

public class FormaGeometrica {

    private Desenhar2D desenhar2D;

    private Desenhar3D desenhar3D;

    public FormaGeometrica(Desenhar desenhar){
        this.desenhar2D = desenhar.createDesenho2D();
        this.desenhar3D = desenhar.createDesenho3D();
    }

    public String desenho2D(){return this.desenhar2D.desenhar();}

    public String desenho3D(){return this.desenhar3D.desenhar();}

}
