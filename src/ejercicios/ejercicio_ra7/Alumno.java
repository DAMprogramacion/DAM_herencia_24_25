package ejercicios.ejercicio_ra7;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
    private String nobreAlumno;
    private final String dni;
    private final LocalDate fechaNacimiento;
    private boolean nuevoAlumno;

    public Alumno( String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nobreAlumno = nobreAlumno;
        this.nuevoAlumno = nuevoAlumno;
    }

    public String getNobreAlumno() {
        return nobreAlumno;
    }

    public void setNobreAlumno(String nobreAlumno) {
        this.nobreAlumno = nobreAlumno;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isNuevoAlumno() {
        return nuevoAlumno;
    }

    public void setNuevoAlumno(boolean nuevoAlumno) {
        this.nuevoAlumno = nuevoAlumno;
    }
    //Felipe Viedma,11111111h,10/10/2001,alumno nuevo

    @Override
    public String toString() {
        String alumnoCentro = nuevoAlumno ? "alumno nuevo" : "alumno del centro";
        return String.format("%s,%s,%d/%d/%d,%s", nobreAlumno, dni, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), getFechaNacimiento().getYear(), alumnoCentro);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
