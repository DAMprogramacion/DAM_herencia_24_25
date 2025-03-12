package ejercicios.ejerciciosTema;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private int mesesContratacion;

    public ProfesorInterino(LocalDate fechaNacimiento, String dni, String nombrePersona,
                            Especialidad especialidad, int mesesContratacion) {
        super(fechaNacimiento, dni, nombrePersona, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    public int getMesesContratacion() {
        return mesesContratacion;
    }

    public void setMesesContratacion(int mesesContratacion) {
        this.mesesContratacion = mesesContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), mesesContratacion);
    }
}
