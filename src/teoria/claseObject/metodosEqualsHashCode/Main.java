package teoria.claseObject.metodosEqualsHashCode;

public class Main {
    public static void main(String[] args) {
        Persona1 persona1 = new Persona1("1", "joaquin");
        Persona1 persona2 = new Persona1("2", "ana");
        Persona1 persona3 = new Persona1("1", "joaquin"); //es un nuevo objeto
        //empezamos comparando posiciones de la pila
        System.out.println("pesona1 == persona1 " + (persona1 == persona1));  //true
        System.out.println("pesona1 == persona2 " + (persona1 == persona2));  //false
        System.out.println("pesona1 == persona3 " + (persona1 == persona3));  //false
        //vamos ahora la montículo
        System.out.println("pesona1.equals(persona1) " + persona1.equals(persona1));  //true
        System.out.println("pesona1.equals(persona2) " + persona1.equals(persona2));  //false
        System.out.println("pesona1.equals(persona3) " + persona1.equals(persona3));  //true
        //el último da true porque el record tiene un equals que compara atributos y son iguals 1 y joaquin

        //suponemos que dos son iguales si tienen el mismo id, y ahora joaquin decide llamarse Gustavo
        Persona1 persona4 = new Persona1("1", "gustavo");
        System.out.println("pesona1 == persona4 " + (persona1 == persona4));  //false
        System.out.println("pesona1.equals(persona4) " + persona1.equals(persona4));  //debería dar true

        System.out.println("=====================================================");
        //TRABAJAMOS CON Persona2 que si tiene sobreescrito los metodos hashCode y equals
        Persona2 persona11 = new Persona2("1", "joaquin");
        Persona2 persona22 = new Persona2("2", "ana");
        Persona2 persona33 = new Persona2("1", "joaquin"); //es un nuevo objeto
        //empezamos comparando posiciones de la pila
        System.out.println("pesona11 == persona11 " + (persona11 == persona11));  //true
        System.out.println("pesona11 == persona22 " + (persona11 == persona22));  //false
        System.out.println("pesona11 == persona33 " + (persona11 == persona33));  //false
        //vamos ahora la montículo
        System.out.println("pesona11.equals(persona11) " + persona11.equals(persona11));  //true
        System.out.println("pesona11.equals(persona22) " + persona11.equals(persona22));  //false
        System.out.println("pesona11.equals(persona33) " + persona11.equals(persona33));  //true
        //el último da true porque el record tiene un equals que compara atributos y son iguals 1 y joaquin

        //suponemos que dos son iguales si tienen el mismo id, y ahora joaquin decide llamarse Gustavo
        Persona2 persona44 = new Persona2("1", "gustavo");
        System.out.println("pesona11 == persona44 " + (persona11 == persona44));  //false
        System.out.println("pesona11.equals(persona44) " + persona11.equals(persona44));  //debería dar true



    }
}








