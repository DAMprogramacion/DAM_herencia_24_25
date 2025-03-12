package recuperacion;

import java.util.ArrayList;
import java.util.List;

public class MesaElectoral {

    private final String nombreColegioElectoral;
    private final List<Persona> personas = new ArrayList<>();

    public MesaElectoral(String nombreColegioElectoral) {
        this.nombreColegioElectoral = nombreColegioElectoral;
    }
    public void addPersona (Persona persona) {
        personas.add(persona);
    }
    public List<Miembro> getMiembros() {
        List<Miembro> miembros = new ArrayList<>();
       for (Persona persona : personas)
           if (persona instanceof Miembro)
               miembros.add((Miembro) persona);
       return miembros;
    }
    public long getNumeroInterventores() {
        return personas.stream().
                filter(persona -> persona instanceof Interventor).
                count();
    }
    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[967][0-9]{8}");
    }
    public void mostrarDatos(List<Persona> pps) {
        for (Persona persona : pps) {
            if (persona instanceof Miembro)
                System.out.printf("MIEMBRO: nombre: %s, tfn: %s",
                        persona.getNombrePersona(), persona.getTelefonoPersona());
            else
                System.out.printf("INTERVENTOR: nombre: %s, tfn: %s",
                        persona.getNombrePersona(), persona.getTelefonoPersona());
        }
    }
}
