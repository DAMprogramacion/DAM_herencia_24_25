package ejercicios;

import java.time.LocalDate;
import java.time.Period;

public class ProfesorTitular extends Profesor{
    private final LocalDate fechaContratacion;

    public ProfesorTitular(LocalDate fechaNacimiento, String dni, String nombrePersona,
                           Especialidad especialidad, LocalDate fechaContratacion) {
        super(fechaNacimiento, dni, nombrePersona, especialidad);
        this.fechaContratacion = fechaContratacion;
    }

    public  LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), calcularAntiguedad());
    }

    private int calcularAntiguedad() {
        return Period.between(fechaContratacion, LocalDate.now()).getYears();
    }
    public int calcularAntiguedadEnMeses() {
        return Period.between(fechaContratacion, LocalDate.now()).getMonths();
    }
}
