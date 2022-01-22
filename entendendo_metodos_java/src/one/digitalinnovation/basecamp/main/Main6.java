package one.digitalinnovation.basecamp.main;

import one.digitalinnovation.basecamp.model.Quadrilatero2;

public class Main6 {

    public static void main(String[] args) {

        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
