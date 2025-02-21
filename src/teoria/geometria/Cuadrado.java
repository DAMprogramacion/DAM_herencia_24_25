package teoria.geometria;

public class Cuadrado extends FiguraRegular {
    private final String nombreFigura;

    public Cuadrado( float longitudLado) {
        super(4, longitudLado);
        this.nombreFigura = Helper.nombrarFiguraRegular(4);
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
    public float calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreFigura).append(". ").append(super.toString());
        builder.append(". Área: ").append(String.format("%.2f",calcularArea()));
        return builder.toString();
    }
}
