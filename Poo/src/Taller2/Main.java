package Taller2;

import Taller2.solucion1.Circulo;
import Taller2.solucion1.Cuadrado;
import Taller2.solucion1.Rectangulo;
import Taller2.solucion1.Figura;


public class Main {

    public static void main(String[] args) {

        System.out.println("Solución 1");

        // Instanciar clase
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println(circulo.dibujar());
        System.out.println(cuadrado.dibujar());
        System.out.println(rectangulo.dibujar());

        System.out.println();

        System.out.println("Solución 2");

        Figura figuraCirculo = new Figura("Ciculo");
        Figura figuraCuadrado = new Figura("Cuadrado");
        Figura figuraRectangulo = new Figura("Rectangulo");

        System.out.println(figuraCirculo.dibujar());
        System.out.println(figuraCuadrado.dibujar());
        System.out.println(figuraRectangulo.dibujar());


    }
}
