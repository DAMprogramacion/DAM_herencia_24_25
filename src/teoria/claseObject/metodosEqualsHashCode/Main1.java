package teoria.claseObject.metodosEqualsHashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        List<Persona2> personas = new ArrayList<>();
        Persona2 persona11 = new Persona2("1", "joaquin");
        Persona2 persona22 = new Persona2("2", "ana");
        Persona2 persona33 = new Persona2("1", "joaquin");
        Persona2 persona44 = new Persona2("1", "gustavo");
        personas.add(persona11); personas.add(persona22);
        personas.add(persona33); personas.add(persona44);
        personas.forEach(System.out::println);
        Set<Persona2> persona2Set = new HashSet<>(); //NO PERMITE DUPLICADOS
        persona2Set.add(persona11); persona2Set.add(persona22);
        persona2Set.add(persona33); persona2Set.add(persona44);
        System.out.println("=============");
        persona2Set.forEach(System.out::println);
        System.out.println("*********************");
        System.out.println("*********************");
        //Ahora con Persona1, donde dos personas son iguales si tienen los dos atributos iguales
        List<Persona1> personas1 = new ArrayList<>();
        Persona1 persona1 = new Persona1("1", "joaquin");
        Persona1 persona2 = new Persona1("2", "ana");
        Persona1 persona3 = new Persona1("1", "joaquin");
        Persona1 persona4 = new Persona1("1", "gustavo");
        personas1.add(persona1); personas1.add(persona2);
        personas1.add(persona3); personas1.add(persona4);
        personas1.forEach(System.out::println);
        Set<Persona1> persona1Set = new HashSet<>(); //NO PERMITE DUPLICADOS
        persona1Set.add(persona1); persona1Set.add(persona2);
        persona1Set.add(persona3); persona1Set.add(persona4);
        System.out.println("=============");
        persona1Set.forEach(System.out::println);
    }
}
