package teoria.introduccion;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Motocicleta motocicleta = new Motocicleta(
                "david garcía", LocalDate.now(), 500 );
        System.out.println(motocicleta);
        Coche coche = new Coche("pepe garcía", LocalDate.of(2009, 2, 12),
                4, true, false);
        System.out.println(coche);
    }
}
