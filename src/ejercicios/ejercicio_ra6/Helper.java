package ejercicios.ejercicio_ra6;

import java.util.List;

public class Helper {
    public static boolean chequearCodigo (String codigo) {
        return codigo.matches("E-[0-9]{2}[ABC]{2}");
    }
    public static boolean chequearMarca (String marca) {
        return marca.toLowerCase().matches("honda|ford|seat|suzuki");
    }
    public static Coche[] listarCochesPorMarca (List<Coche> coches, String marca) {
        return (Coche[]) coches.stream().
                filter(coche -> coche.getMarcaCoche().equalsIgnoreCase(marca)).
                toArray();
    }
 }
