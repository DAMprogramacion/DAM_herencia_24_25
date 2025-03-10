package ejercicios.ejercicio_ra7;

import java.time.LocalDate;

public class AlumnoESO extends Alumno{
    private final CursoESO cursoESO;
    private final boolean nee;

    public AlumnoESO(String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno,
                     CursoESO cursoESO, boolean nee) {
        super(nobreAlumno, dni, fechaNacimiento, nuevoAlumno);
        this.cursoESO = cursoESO;
        this.nee = nee;
    }

    public CursoESO getCursoESO() {
        return cursoESO;
    }

    public boolean isNee() {
        return nee;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(), cursoESO.toString(),
                nee ? "NEE" : "NO NEE");
    }
}
