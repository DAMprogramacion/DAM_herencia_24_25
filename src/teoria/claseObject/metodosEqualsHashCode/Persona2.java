package teoria.claseObject.metodosEqualsHashCode;

import java.util.Objects;

public record Persona2(String id, String nombre) {
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona2 persona2 = (Persona2) o;
        return Objects.equals(id, persona2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
