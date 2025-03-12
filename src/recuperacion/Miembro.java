package recuperacion;

public class Miembro extends Persona{
    private Funcion funcion;

    public Miembro(String nombrePersona, String telefonoPersona, Sexo sexo,
                   Funcion funcion) {
        super(nombrePersona, telefonoPersona, sexo);
        this.funcion = funcion;
    }

    public Miembro() {
        super();
    }


    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), funcion);
    }
}
