package ejercicios.ejercicio_ra7;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();
        Alumno alumnoFPGM1 = new AlumnoFPGradoMedio("juan lópez",  "12345678a" ,
                LocalDate.of(2000,12,16), true,
                CicloFormativo.SMR, false);
        alumnos.add(alumnoFPGM1);
        Alumno alumnoFPGM2 = new AlumnoFPGradoMedio("esperanza garcía",  "12345678b" ,
                LocalDate.of(1998,2,1), false,
                CicloFormativo.SMR, true);
        alumnos.add(alumnoFPGM2);
        Alumno alumnoFPGS1 = new AlumnoFPGradoSuperior("juan garcía",  "12345678c" ,
                LocalDate.of(2001,3,6), true,
                CicloFormativo.ASIR, "Kubernetes");
        alumnos.add(alumnoFPGS1);
        Alumno alumnoFPGS2 = new AlumnoFPGradoSuperior("sebastian lópez",  "12345678d" ,
                LocalDate.of(1998,10,26), false,
                CicloFormativo.DAM, "Full Stack");
        alumnos.add(alumnoFPGS2);
        Alumno alumnoBach1 = new AlumnoBachillerato("pepa martínez",  "12345678f" ,
                LocalDate.of(2005,3,16), false,
                ModalidadBachillerato.CIENCIAS);
        alumnos.add(alumnoBach1);
        Alumno alumnoBach2 = new AlumnoBachillerato("esther martínez",  "12345678g" ,
                LocalDate.of(2002,11,8), true,
                ModalidadBachillerato.LETRAS);
        alumnos.add(alumnoBach2);
        Alumno alumnoESO1 = new AlumnoESO("isabel roque",  "12345678h" ,
                LocalDate.of(2010,7,16), false,
                CursoESO.SEGUNDO, false);
        alumnos.add(alumnoESO1);
        Alumno alumnoESO2 = new AlumnoESO("maría roque",  "12345678i" ,
                LocalDate.of(2011,8,5), true,
                CursoESO.PRIMERO, true);
        alumnos.add(alumnoESO2);
        mostrarDatos(alumnos);
        System.out.println("====ordenados de menor a mayor=======");
        mostrarDatosPorEdad(alumnos); //no lo pide el ejercicio
        System.out.println("====nombres alfabéticamente=======");
        mostrarNombresAlumnosOrdeanadosAlfabeticamente(alumnos); //no lo pide el ejercicio
        System.out.println("====nombres y edad=======");
        mostrarNombresYEdadAlumnosOrdeanadosMayorAMenorEdad(alumnos); //no lo pide el ejercicio
        System.out.println("====nombre de alumnos de FP ordenados alfabéticamente=====");
        mostrarNombreAlfabeticamenteAlumnosFP(alumnos);

    }

    private static void mostrarNombreAlfabeticamenteAlumnosFP(Set<Alumno> alumnos) {
        alumnos.stream().
                filter(alumno -> alumno instanceof AlumnoFP).
                map(Alumno::getNobreAlumno).
                sorted().
                forEach(System.out::println);
    }

    //pepito de X años
    private static void mostrarNombresYEdadAlumnosOrdeanadosMayorAMenorEdad(Set<Alumno> alumnos) {
        alumnos.stream().
                sorted(Comparator.comparing(Alumno::getFechaNacimiento)).
                sorted(Comparator.comparing(Alumno::getNobreAlumno)).
                forEach(alumno -> System.out.println(
                        String.format("%s de %d años", alumno.getNobreAlumno(), Helper.calcularEdad(alumno))));
    }

    private static void mostrarNombresAlumnosOrdeanadosAlfabeticamente(Set<Alumno> alumnos) {
        alumnos.stream().
                map(Alumno::getNobreAlumno).
                sorted().
                forEach(System.out::println);
    }

    private static void mostrarDatosPorEdad(Set<Alumno> alumnos) {
        alumnos.stream().
            sorted(Comparator.comparing(Alumno::getFechaNacimiento).reversed()).
            forEach(System.out::println);
    }

    private static void mostrarDatos(Set<Alumno> alumnos) {
        alumnos.forEach(System.out::println);
    }
}
