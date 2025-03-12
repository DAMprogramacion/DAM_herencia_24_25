package ejercicios.ejerciciosTema;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String nombrePersona;
    private final LocalDate fechaNacimiento;
    private final String dni;

    public Persona(LocalDate fechaNacimiento, String dni, String nombrePersona) {
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.nombrePersona = nombrePersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    @Override
    public String toString() {
        return String.format("%S,%d/%d/%d,%s", nombrePersona, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear(), dni);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
