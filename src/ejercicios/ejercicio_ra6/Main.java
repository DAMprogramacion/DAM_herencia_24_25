package ejercicios.ejercicio_ra6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DATOS INCORRECTO: E21AB,ford E-22AB,mercedes
        boolean correctoCodigoCoche1 = Helper.chequearCodigo("E21AB");
        boolean correctoCodigoCoche2 = Helper.chequearCodigo("E-22AB");
        System.out.printf("¿Valido código E-22AB? %B%n", correctoCodigoCoche2);
        System.out.printf("¿Valido código E21AB? %B%n", correctoCodigoCoche1);
        boolean correctoMarcaCoche1 = Helper.chequearMarca("ford");
        boolean correctoMarcaCoche2 = Helper.chequearMarca("mercedes");
        System.out.printf("¿Valido marca ford? %B%n", correctoMarcaCoche1);
        System.out.printf("¿Valido marca mercedes? %B%n", correctoMarcaCoche2);
        System.out.printf("¿Válido coche1? %B%n", correctoMarcaCoche1 && correctoCodigoCoche1);
        System.out.printf("¿Válido coche2? %B%n", correctoMarcaCoche2 && correctoCodigoCoche2);
        System.out.println("======================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre del concesionario:");
        String nombreConcesionario = scanner.nextLine();
        scanner.close();
        //creamos el concensionario
        //leemos el fichero coches.csv, con cada línea válida
        //creamos un objeto Coche y lo añadimos al concesionario
    }
}
