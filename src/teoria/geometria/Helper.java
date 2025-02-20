package teoria.geometria;

public class Helper {
    //metodo que pasamos el nº lados y devuelve al nombre de la figura geométrica
    public static String nombrarFiguraRegular(int lados) {
        switch (lados) {
            case 3 -> {
                return "TRIÁNGULO EQUILATERO";
            }
            case 4 -> {
                return "CUADRADO";
            }
            case 5 -> {
                return "PENTÁGONO REGULAR";
            }
            case 6 -> {
                return "HEXÁGONO REGULAR";
            }
            default -> {
                return "";
            }
        }
    }
}
