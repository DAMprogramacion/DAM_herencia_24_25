package ejercicios.ejercicio_ra7;

import java.time.LocalDate;

public class AlumnoFP extends Alumno{
    private final CicloFormativo cicloFormativo;

    public AlumnoFP(String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno,
                    CicloFormativo cicloFormativo) {
        super(nobreAlumno, dni, fechaNacimiento, nuevoAlumno);
        this.cicloFormativo = cicloFormativo;

    }
    public CicloFormativo getCicloFormativo() {
        return cicloFormativo;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), cicloFormativo.toString());
    }
}
