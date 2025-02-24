package teoria.figuras.figurasRegulares;

import teoria.figuras.figuras4Lados.FigurasCuadráticas;

public class Cuadrado extends FigurasCuadráticas {
    public Cuadrado( int lado) {
        super("cuadrado", lado, lado, lado, lado);
    }
    public int getArea() {
        return getLado1() * getLado1();
    }
    //nombre,lado1,lado2,lado3,lado4,perimetro,area
    @Override
    public String toString() {
        return String.format("%s;%d", super.toString(), getArea());
    }
}
