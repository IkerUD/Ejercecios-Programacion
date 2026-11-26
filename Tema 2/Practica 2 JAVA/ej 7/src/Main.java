import java.util.Scanner;

public class Main {

    public static StringBuilder cadena;

    public static void main(String[] args) {

        // Eliminar un carácter de una posición

        // Datos de entrada
        Scanner sc = new Scanner(System.in);
        obtenerCadena(sc);
        char caracter = obtenerCaracter(sc);

        // Proceso
        eliminar(caracter);
        System.out.println(cadena);
    }

    public static void obtenerCadena(Scanner sc)
    {

        do
        {
            System.out.println("Teclea la cadena");
            cadena = new StringBuilder(sc.nextLine());
        }
        while (cadena.length() == 0);

    }

    public static char obtenerCaracter(Scanner sc)
    {
        char caracter;
        System.out.println("Teclea el carácter que quieres eliminar");
        caracter = sc.nextLine().charAt(0);
        return caracter;
    }

    public static void eliminar(char caracter) {
        // Elimina solo la primera ocurrencia.
        // Conversión de char a String
        int posicion = cadena.indexOf(String.valueOf(caracter));
        if (posicion != -1) {
            cadena.deleteCharAt(posicion);
        }
        else
        {
            cadena.setLength(0); // borrar
            cadena.append("No se puede eliminar. No está en la cadena original");
        }

    }
}
