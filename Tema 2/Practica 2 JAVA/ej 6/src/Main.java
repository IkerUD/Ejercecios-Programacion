import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Insertar texto en una posición concreta de un StringBuilder.
        StringBuilder cadena, insertar;
        int posicion;

        // Datos de entrada
        Scanner sc = new Scanner(System.in);
        cadena = obtenerCadena(sc);
        insertar = obtenerCadena(sc);
        posicion = obtenerPosicion(sc);

        // Proceso
        cadena = insertar(cadena, insertar, posicion);
        System.out.println(cadena);
    }

    public static StringBuilder obtenerCadena(Scanner sc) {
        StringBuilder cadena;
        do
        {
            System.out.println("Teclea la cadena");
            cadena = new StringBuilder(sc.nextLine());
        }
        while (cadena.isEmpty());
        return cadena;

    }

    public static int obtenerPosicion(Scanner sc) {
        int posicion;
        do
        {
            System.out.println("Teclea la posición");
            posicion = sc.nextInt();
        }
        while (posicion < 0);
        return posicion;

    }

    public static StringBuilder insertar(StringBuilder cadena, StringBuilder insertar, int posicion) {
        return cadena.insert(posicion, insertar.toString());
    }
}