package teoria.figuras.main;

import teoria.figuras.figuras4Lados.FigurasCuadráticas;
import teoria.figuras.figurasRegulares.Cuadrado;
import teoria.figuras.figurasRegulares.Rectangulo;
import teoria.figuras.figurasRegulares.Rombo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FigurasCuadráticas> figurasCuadráticas = new ArrayList<>();
        Cuadrado cuadrado1 = new Cuadrado(2);
        Cuadrado cuadrado2 = new Cuadrado(3);
        figurasCuadráticas.add(cuadrado1);  //cuando se crea un nuevo cuadrado new Cuadrado
        figurasCuadráticas.add(cuadrado2);  //se crea antes un objeto de FiguraCuadratica
        System.out.println(cuadrado1);
        System.out.println(cuadrado2);
        System.out.printf("Aŕea del cuadrado 1 %d%n", cuadrado1.getArea());  //getArea tiene visibilidad public
        System.out.printf("Aŕea del cuadrado 2 %d%n", cuadrado2.getArea());

        FigurasCuadráticas rombo1 = new Rombo(2,3);
        FigurasCuadráticas rombo2 = new Rombo(21,3);
        FigurasCuadráticas rectangulo1 = new Rectangulo(2,3);
        FigurasCuadráticas rectangulo2 = new Rectangulo(2,30);
        figurasCuadráticas.add(rombo1); figurasCuadráticas.add(rombo2);
        figurasCuadráticas.add(rectangulo1); figurasCuadráticas.add(rectangulo2);

        System.out.println("========================");
        figurasCuadráticas.forEach(System.out::println);
    }
}
