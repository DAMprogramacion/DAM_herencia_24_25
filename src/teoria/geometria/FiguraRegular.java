package teoria.geometria;
//una figura regular tiene todos los lados iguales
public class FiguraRegular {
    private final int numeroLados;
    private final float longitudLado;

    public FiguraRegular(int numeroLados, float longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    public float calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public float getLongitudLado() {
        return longitudLado;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FIGURA REGULAR: ").append(numeroLados).append(" lados.");
        builder.append(" Longitud del lado: ").append(String.format("%.2f", longitudLado));
        builder.append(". Perímetro: ").append(String.format("%.2f", calcularPerimetro()));
        return builder.toString();
    }
}



