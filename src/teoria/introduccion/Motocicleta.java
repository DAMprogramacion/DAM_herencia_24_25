package teoria.introduccion;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
    private final int cilindrada;

    public Motocicleta(String nombrePropieatrio,
                       LocalDate fechaCompra, int cilindrada) {
        super(2, nombrePropieatrio, fechaCompra, 2);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta de cilindrada : " + cilindrada + "cc. " + super.toString();
    }
}
