package recuperacion;

public class Main {
    public static void main(String[] args) {
        Persona miembro1 = new Miembro();
        miembro1.setNombrePersona("joaquina ríos");
        miembro1.setTelefonoPersona("999123456");
        miembro1.setSexo(Sexo.MUJER);
        ((Miembro) miembro1).setFuncion(Funcion.VOCAL1);
        System.out.println(miembro1);

        Persona miembro2 = new Miembro(
                "esteban garcía", "666999999", Sexo.HOMBRE,
                Funcion.PRESIDENTE);
        System.out.println(miembro2);

        Persona interventor1 = new Interventor();
        interventor1.setNombrePersona("luisa perales");
        interventor1.setSexo(Sexo.MUJER);
        interventor1.setTelefonoPersona("777123456");
        ((Interventor) interventor1).setPartidoPolitico(PartidoPolitico.PODEMOS);
        System.out.println(interventor1);

        Persona interventor2 = new Interventor("emilio martínez", "666666699", Sexo.HOMBRE,
                PartidoPolitico.PP);
        System.out.println(interventor2);

        MesaElectoral mesaElectoral = new MesaElectoral("mesa 1");
        mesaElectoral.addPersona(miembro1); mesaElectoral.addPersona(interventor1);
        mesaElectoral.addPersona(miembro2); mesaElectoral.addPersona(interventor2);

        System.out.printf("Nº interventores: %d%n", mesaElectoral.getNumeroInterventores());
        mesaElectoral.getMiembros().forEach(
                persona -> System.out.printf("%S: %s%n",
                        persona.getNombrePersona(), persona.getFuncion()));
        System.out.println("======VALIDAR TELÉFONOS===========");
        String[] telefonos = {"123456789", "987654321", "13456789", "9876543210"};
        for (String telefono : telefonos)
            System.out.printf("Valido %s: %B%n", telefono, MesaElectoral.validarTelefono(telefono));
    }
}
