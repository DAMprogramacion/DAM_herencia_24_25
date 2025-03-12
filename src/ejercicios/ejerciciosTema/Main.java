package ejercicios.ejerciciosTema;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creamos dos profores titulares
        Profesor pT1 = new ProfesorTitular(LocalDate.of(1999, 2,25),
                "12345678a", "Inma Abolafia", Especialidad.INFORMATICA,
                LocalDate.of(2005, 9, 1));
        Profesor pT2 = new ProfesorTitular(LocalDate.of(1990, 12,5),
                "12345678b", "Eva García", Especialidad.BIOLOGIA_GEOLOGIA,
                LocalDate.of(2006, 9, 1));
        //Creamos tres profesores interinos
        Profesor pI1 = new ProfesorInterino(LocalDate.of(2000, 8,1),
                "12345678c", "Irene Valdivia", Especialidad.INFORMATICA, 12);
        Profesor pI2 = new ProfesorInterino(LocalDate.of(1992, 7,5),
                "12345678d", "Gabriel Porras", Especialidad.FISICA_QUIMICA, 10);
        Profesor pI3 = new ProfesorInterino(LocalDate.of(1980, 4,9),
                "12345678e", "Saturnino Méndez", Especialidad.INFORMATICA, 11);
        //creamos un objeto Claustro
        Claustro claustro = new Claustro("IES VC");
        //añadimos los profesores
        claustro.addProfesor(pT1); claustro.addProfesor(pT2);
        claustro.addProfesor(pI1); claustro.addProfesor(pI2); claustro.addProfesor(pI3);
        Set<Profesor> profesorSet = claustro.getProfesores();
        profesorSet.forEach(System.out::println);
        System.out.println("=========================");
        Profesor pT6 = new ProfesorTitular(LocalDate.of(1999, 2,25),
                "12345678a", "Pepa Abolafia", Especialidad.BIOLOGIA_GEOLOGIA,
                LocalDate.of(2005, 9, 1));
        claustro.addProfesor(pT6); //si fuera una lista, se lo traga y lo duplicaría
        profesorSet.forEach(System.out::println); //al ser un Set no debe hacerlo
        //sobretodo porque hemos sobreescrito el hashCode y Equals usando el dni como clave
        System.out.println("**********ordenado alfabeticamente**************");
        claustro.getProfesores().stream().
                sorted(Comparator.comparing(Persona::getNombrePersona)).
                forEach(System.out::println);
        System.out.println("**********ordenado menor a mayor edad**************");
        claustro.getProfesores().stream().
                sorted(Comparator.comparing(Persona::getFechaNacimiento).reversed()).
                forEach(System.out::println);
    }
}






