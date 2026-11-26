import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder listaletrasseleccionadas = new StringBuilder();
        char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int posicionabecedario = 0;

        while (posicionabecedario != -1) {
            System.out.println("Dime una posicion del 0 al 26 (o -1 para terminar):");
            posicionabecedario = sc.nextInt();

            // Comprobamos que esté entre 0 y 26 antes de guardarla
            if (posicionabecedario >= 0 && posicionabecedario < abecedario.length) {
                listaletrasseleccionadas.append(abecedario[posicionabecedario]);
            } else if (posicionabecedario != -1) {
                System.out.println("Saliendo...");
            }

            System.out.println("Tu cadena es la siguiente: " + listaletrasseleccionadas);
        }
    }
} 