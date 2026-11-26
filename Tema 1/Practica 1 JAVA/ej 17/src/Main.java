import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        int base = solicitarDatoEntradaInt("Teclea la base",sc);
        int exponente = solicitarDatoEntradaInt("Teclea el exponente",sc);
        sc.close();

        int resultado = 1; // Variable para la salida.
        // Proceso
        for (int contador = 0; contador < exponente; contador++) {
            resultado *= base;
        }

        // Salida
        System.out.println(resultado);
    }
    public static int solicitarDatoEntradaInt(String mensaje,Scanner sc)
    {
        System.out.println(mensaje);
        int dato = sc.nextInt();
        return dato;
    }
}