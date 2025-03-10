package ejercicios.ejercicio_ra7;

import java.time.LocalDate;

public class AlumnoFPGradoSuperior extends AlumnoFP{
    private String tituloProyecto;

    public AlumnoFPGradoSuperior(String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno,
                                 CicloFormativo cicloFormativo,
                                 String tituloProyecto) {
        super(nobreAlumno, dni, fechaNacimiento, nuevoAlumno, cicloFormativo);
        this.tituloProyecto = tituloProyecto;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(),tituloProyecto);
    }
}
