package ejercicios.ejerciciosTema;
import java.util.*;

public class Claustro {
    private final String nombreClaustro;
    private final Set<Profesor> profesores = new HashSet<>();

    public Claustro(String nombreClaustro) {
        this.nombreClaustro = nombreClaustro;
    }
    public void addProfesor (Profesor profesor) {
        profesores.add(profesor);
    }
    public boolean eliminarProfesorPorDNI (String dni) {
        for (Profesor profesor : profesores)
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                profesores.remove(profesor);
                return true;
            }
        return false;
    }
    public Profesor buscarProfesor (String dni) {
        List<Profesor> profesor = profesores.stream()
                .filter(p -> p.getDni().equalsIgnoreCase(dni))
                .toList();
        if (!profesor.isEmpty())
            return profesor.get(0);
        else
            return null;
    }

    public String getNombreClaustro() {
        return nombreClaustro;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public double calcularEdadMedia () {
        return profesores.stream().
                mapToDouble(Persona::getEdad).
                average().orElse(0);
    }
    public Profesor getProfesorMasAntiguo() {
        //no es la mejor forma, pero nos ayuda a practicar
        List<ProfesorInterino> profesorInterinos = new ArrayList<>();
        List<ProfesorTitular> profesorTitulares = new ArrayList<>();
        for (Profesor profesor: profesores) {
            //esto es nuevo y del siguiente tema:
            if (profesor instanceof ProfesorTitular)
                profesorTitulares.add((ProfesorTitular) profesor);
            else
                profesorInterinos.add((ProfesorInterino) profesor);
        }
        //ordeno la lista por meses de contratación, fácil para los interinos
        Collections.sort(profesorInterinos,
                Comparator.comparing(ProfesorInterino::getMesesContratacion));
        //los profesores con plaza no tienen ese metodo, lo creo en ProfesorTitular
        Collections.sort(profesorTitulares,
                Comparator.comparing(ProfesorTitular::calcularAntiguedadEnMeses));
        //si las dos listas están vacías, no hay profesores, devolvemos null
        if (profesorTitulares.isEmpty() && profesorInterinos.isEmpty())
            return null;
        //si está vacía la de profesores titulares, devuelve el último de la lista de interinos
        //porque está ordenada de menor a mayor antigüedad
        if (profesorTitulares.isEmpty())
            return profesorInterinos.getLast();
        //si está vaciá la de interinos, operación contraria
        if (profesorInterinos.isEmpty())
            return profesorTitulares.getLast();
        Profesor profesorMasAntiguo = profesorInterinos.getLast().getMesesContratacion() >
                profesorTitulares.getLast().calcularAntiguedadEnMeses() ?
                    profesorInterinos.getLast() : profesorTitulares.getLast();
        return profesorMasAntiguo;
        //ojo solo devuelve un profesor, puede haber profesores, independientemente que sean
        //titulares o interinos con la misma antigüedad, habría que modificar el código y
        //devolver una lista de profesores
    }

    public long getNumeroProfesoresPorEspecialidad (Especialidad especialidad) {
        return profesores.stream().
                filter(profesor ->  profesor.getEspecialidad().equals(especialidad)).
                count();
    }

    //método que nos devuelve el profesor de mas edad de una especialidad
    public Profesor getProferosMayorPorEspecialidad(Especialidad especialidad){
        return profesores.stream().
                filter(profesor -> profesor.getEspecialidad().equals(especialidad)).
                max(Comparator.comparing(Persona::getEdad)).orElse(null);
    }
    //metodo que nos devuelva de los profesores interinos el total de meses contratados
    public int getTotalMesesContratadosTodosInterinos() {
        return profesores.stream().
                filter(profesor -> profesor instanceof ProfesorInterino).
                mapToInt(profesor -> ((ProfesorInterino) profesor).getMesesContratacion()).
                sum();

    }



}




