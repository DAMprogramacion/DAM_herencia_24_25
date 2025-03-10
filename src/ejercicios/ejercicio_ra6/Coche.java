package ejercicios.ejercicio_ra6;

import java.util.Objects;

public class Coche {
    private final String codigoCoche;
    private final String marcaCoche;

    public Coche(String codigoCoche, String marcaCoche) {
        this.codigoCoche = codigoCoche;
        this.marcaCoche = marcaCoche;
    }

    public String getCodigoCoche() {
        return codigoCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", codigoCoche, marcaCoche);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(codigoCoche, coche.codigoCoche);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoCoche);
    }
}
