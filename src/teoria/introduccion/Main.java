package teoria.introduccion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo motocicleta = new Motocicleta(
                "david garcía", LocalDate.now(), 500 );
        //System.out.println(motocicleta);
        Vehiculo coche = new Coche("pepe garcía", LocalDate.of(2009, 2, 12),
                4, true, false);
        //System.out.println(coche);
        vehiculos.add(motocicleta); vehiculos.add(coche);
        vehiculos.forEach(System.out::println);
    }
}
