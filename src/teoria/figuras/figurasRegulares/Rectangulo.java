package teoria.figuras.figurasRegulares;

import teoria.figuras.figuras4Lados.FigurasCuadráticas;

public class Rectangulo extends FigurasCuadráticas {
    public Rectangulo(int lado1, int lado2) {
        super("rectángulo", lado1, lado1, lado2, lado2);
    }
    public int getArea() {
        int lado1 = getLado1();
        int lado2 = getLado2();
        int lado3 = getLado3();
        int lado4 = getLado4();
        int ladoMayor  = Math.max(lado1, Math.max(lado2, Math.max(lado3, lado4)));
        int ladoMenor  = Math.min(lado1, Math.min(lado2, Math.min(lado3, lado4)));
        return ladoMayor  * ladoMenor;
    }
    //nombre,lado1,lado2,lado3,lado4,perimetro,area
    @Override
    public String toString() {
        return String.format("%s;%d", super.toString(), getArea());
    }
}
