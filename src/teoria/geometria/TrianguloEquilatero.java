package teoria.geometria;

public class TrianguloEquilatero extends FiguraRegular{
    private final String nombreFigura;

    public TrianguloEquilatero(float longitudLado) {
        super(3, longitudLado);
        this.nombreFigura = Helper.nombrarFiguraRegular(3);
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
    public float calcularArea() {
        return (float) (Math.pow(getLongitudLado(), 2) * Math.sqrt(3) / 4);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreFigura).append(". ").append(super.toString());
        builder.append(". Área: ").append(calcularArea());
        return builder.toString();
    }
}


