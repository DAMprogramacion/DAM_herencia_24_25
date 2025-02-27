package ejercicios;

import java.time.LocalDate;

public class Profesor extends Persona{
    private Especialidad especialidad;

    public Profesor(LocalDate fechaNacimiento, String dni, String nombrePersona,
                    Especialidad especialidad) {
        super(fechaNacimiento, dni, nombrePersona);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), especialidad.toString());
    }

}
