package recuperacion;

public class Persona {
    private String nombrePersona;
    private String telefonoPersona;
    private Sexo sexo;

    public Persona(String nombrePersona, String telefonoPersona, Sexo sexo) {
        this.nombrePersona = nombrePersona;
        this.telefonoPersona = telefonoPersona;
        this.sexo = sexo;
    }

    public Persona() {

    }


    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", nombrePersona, telefonoPersona, sexo);
    }
}
