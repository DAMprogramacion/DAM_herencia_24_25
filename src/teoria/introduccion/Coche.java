package teoria.introduccion;

import java.time.LocalDate;

public class Coche extends Vehiculo{
    private final boolean diesel;
    private final boolean descapotable;

    public boolean isDiesel() {
        return diesel;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public Coche(String nombrePropieatrio,
                 LocalDate fechaCompra, int numeroPasajeros, boolean diesel, boolean descapotable) {
        super(4, nombrePropieatrio, fechaCompra, numeroPasajeros);
        this.diesel = diesel;
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String mensaje = isDescapotable() ? "si" : "no";
        builder.append("Coche ¿Descapotable? ").append(mensaje);
        mensaje = isDiesel() ? "diesel" : "gasolina";
        builder.append(". Combustible: ").append(mensaje).append(". ").append(super.toString());
        return builder.toString();
    }
}
