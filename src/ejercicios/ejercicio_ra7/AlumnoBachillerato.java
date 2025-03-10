package ejercicios.ejercicio_ra7;

import java.time.LocalDate;

public class AlumnoBachillerato extends Alumno{
    private ModalidadBachillerato modalidadBachillerato;

    public AlumnoBachillerato(String nobreAlumno, String dni, LocalDate fechaNacimiento, boolean nuevoAlumno,
                              ModalidadBachillerato modalidadBachillerato) {
        super(nobreAlumno, dni, fechaNacimiento, nuevoAlumno);
        this.modalidadBachillerato = modalidadBachillerato;
    }

    public ModalidadBachillerato getModalidadBachillerato() {
        return modalidadBachillerato;
    }

    public void setModalidadBachillerato(ModalidadBachillerato modalidadBachillerato) {
        this.modalidadBachillerato = modalidadBachillerato;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), modalidadBachillerato.toString());
    }
}
