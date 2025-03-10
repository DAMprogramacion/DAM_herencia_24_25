package ejercicios.ejercicio_ra7;

import java.time.LocalDate;
import java.time.Period;

public class Helper { //no lo pide el ejercicio
    public static int calcularEdad(Alumno alumno) {
        Period period = Period.between(alumno.getFechaNacimiento(), LocalDate.now());
        return period.getYears();
    }
}
