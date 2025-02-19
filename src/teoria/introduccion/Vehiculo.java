package teoria.introduccion;

import java.time.LocalDate;
import java.time.Period;

public class Vehiculo {
        private final int numeroRuedas;
        private final String nombrePropieatrio;
        private final LocalDate fechaCompra;
        private final int numeroPasajeros;

    public Vehiculo(int numeroRuedas, String nombrePropieatrio, LocalDate fechaCompra, int numeroPasajeros) {
        this.numeroRuedas = numeroRuedas;
        this.nombrePropieatrio = nombrePropieatrio;
        this.fechaCompra = fechaCompra;
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String getNombrePropieatrio() {
        return nombrePropieatrio;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

   @Override
    public String toString() {
        //VEHÍCULO: nº ruedas 4, propietario Joaquin Zafra, antigüedad coche 4 años, nº pasajeros 4
        StringBuilder builder = new StringBuilder();
        builder.append("VEHÍCULO: nº ruedas ").append(numeroRuedas).
                append(", propietario ").append(nombrePropieatrio).
                append(", antigüedad coche ").append(calcularAnnos()).
                append(" años, nº pasajeros ").append(numeroPasajeros);
        return builder.toString();
    }

    private int calcularAnnos() {
        Period period = Period.between(fechaCompra, LocalDate.now());
        return period.getYears();
    }
}
