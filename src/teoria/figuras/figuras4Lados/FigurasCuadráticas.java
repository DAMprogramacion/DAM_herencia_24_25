package teoria.figuras.figuras4Lados;

public class FigurasCuadráticas {
    private final String nombreFigura;
    private final int lado1;
    private final int lado2;
    private final int lado3;
    private final int lado4;

    public FigurasCuadráticas(String nombreFigura, int lado1, int lado2, int lado3, int lado4) {
        this.nombreFigura = nombreFigura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    protected String getNombreFigura() {
        return nombreFigura;
    }

    protected int getLado1() {
        return lado1;
    }

    protected int getLado2() {
        return lado2;
    }

    protected int getLado3() {
        return lado3;
    }

    protected int getLado4() {
        return lado4;
    }
    protected int getPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }
    //nombre,lado1,lado2,lado3,lado4,perimetro
    @Override
    public String toString() {
        return String.format("%s;%d;%d;%d;%d;%d",
                nombreFigura, lado1, lado2, lado3, lado4, getPerimetro());
    }
}
