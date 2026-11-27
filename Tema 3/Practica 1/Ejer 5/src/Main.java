
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int [] contadorletras = new int [26];
        int cont;
        String texto;
        StringBuilder cantidadletras = new StringBuilder();

        System.out.println("Escribe el texto que quieras con la logitud que quieras,");
        texto = sc.nextLine().toUpperCase();
        for (int x = 0; x < texto.length(); x++)
        {
            cont = Arrays.binarySearch(abecedario, texto.charAt(x));
            if (cont != -1)
                contadorletras[cont] += 1;
        }

        cantidadletras.append("Tu texto tiene las siguientes letras:\n");


        for (int x = 0; x < abecedario.length; x++) {

            cantidadletras.append(abecedario[x]);
            cantidadletras.append(" --> ").append(contadorletras[x]);
            cantidadletras.append("\n");
        }

        System.out.println(cantidadletras);

    }
}