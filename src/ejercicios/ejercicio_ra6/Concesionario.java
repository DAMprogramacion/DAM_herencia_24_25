package ejercicios.ejercicio_ra6;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombreConcesionario;
    private final List<Coche> coches = new ArrayList<>();

    public Concesionario(String nombreConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
    }

    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    public void setNombreConcesionario(String nombreConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
    }

    public List<Coche> getCoches() {
        return coches;
    }
    public boolean addCoche (Coche coche) {
        return coches.add(coche);
    }
    public boolean eliminarCochePorCodigo (String codigo) {
        for (Coche coche : coches)
            if (coche.getCodigoCoche().equalsIgnoreCase(codigo))
                return coches.remove(coche);
        return false;
    }
}
