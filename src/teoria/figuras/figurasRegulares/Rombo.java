package teoria.figuras.figurasRegulares;

import teoria.figuras.figuras4Lados.FigurasCuadráticas;

public class Rombo extends FigurasCuadráticas {
    private final int diagonal1;
    private final int diagonal2;

    public Rombo( int diagonal1, int diagonal2) {
        super("rombo",
                getLado(diagonal1, diagonal2),
                getLado(diagonal1, diagonal2),
                getLado(diagonal1, diagonal2),
                getLado(diagonal1, diagonal2));
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    private static int getLado(int diagonal1, int diagonal2) {
        return (int) Math.sqrt(Math.pow(diagonal1, 2) + Math.pow(diagonal2, 2) / 2);
    }

    public double getArea() {
        return diagonal1 * diagonal2 / 2.0;
    }
    //nombre,lado1,lado2,lado3,lado4,perimetro,area
    @Override
    public String toString() {
        return String.format("%s;%.2f", super.toString(), getArea());
    }
}
