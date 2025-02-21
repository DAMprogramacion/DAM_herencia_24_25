package teoria.geometria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraRegular cuadrado1 = new Cuadrado(2.2f);
        FiguraRegular cuadrado2 = new Cuadrado(2.5f);
        FiguraRegular triangulo1 = new TrianguloEquilatero(1.1f);
        FiguraRegular triangulo2 = new TrianguloEquilatero(1.1f);
        /*List<FiguraRegular> figuras = List.of(
                new Cuadrado(4), new TrianguloEquilatero(1.1f));
        figuras.add(cuadrado1); es inmutable, NO se pude hacer*/
        List<FiguraRegular> figuras = new ArrayList<>((List.of(  //lista mutable
                new Cuadrado(4), new TrianguloEquilatero(1.1f))));
        figuras.add(cuadrado1); figuras.add(cuadrado2);
        figuras.add(triangulo1); figuras.add(triangulo2);
        figuras.forEach(System.out::println);



    }
}
