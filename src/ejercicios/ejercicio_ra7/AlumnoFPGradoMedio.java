package ejercicios.ejercicio_ra7;

import java.time.LocalDate;

public class AlumnoFPGradoMedio extends AlumnoFP{
    private boolean erasmus;

    public boolean isErasmus() {
        return erasmus;
    }

    public void setErasmus(boolean erasmus) {
        this.erasmus = erasmus;
    }

    public AlumnoFPGradoMedio(String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno,
                              CicloFormativo cicloFormativo,
                              boolean erasmus) {
        super(nobreAlumno, dni, fechaNacimiento, nuevoAlumno, cicloFormativo);
        this.erasmus = erasmus;

    }

    @Override
    public String toString() {
        String mensaje = erasmus ? "ERASMUS" : "NO ERASMUS";
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append(',').append(mensaje);
        return builder.toString();
    }
}
