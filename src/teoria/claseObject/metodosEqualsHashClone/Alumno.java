package teoria.claseObject.metodosEqualsHashClone;

import java.util.Objects;

public class Alumno implements Cloneable{
    private final String dni;
    private String nombreAlumno; //permitimos cambio de nombre

    public Alumno(String dni, String nombreAlumno) {
        this.dni = dni;
        this.nombreAlumno = nombreAlumno;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public String toString() {
        return String.format("ALUMNO: %s con DNI: %s", nombreAlumno, dni);
    }
    //sobreescribimos el hashCode y equals para decir que dos objetos son iguales si tienen igual dni


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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
