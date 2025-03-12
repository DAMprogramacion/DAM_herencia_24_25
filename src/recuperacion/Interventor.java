package recuperacion;

public class Interventor extends Persona{
    private PartidoPolitico partidoPolitico;

    public Interventor(String nombrePersona, String telefonoPersona, Sexo sexo,
                       PartidoPolitico partidoPolitico) {
        super(nombrePersona, telefonoPersona, sexo);
        this.partidoPolitico = partidoPolitico;
    }

    public Interventor() {

    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), partidoPolitico);
    }
}
