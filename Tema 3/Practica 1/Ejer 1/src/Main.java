import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    float [] numeros = new float[10];
        Scanner sc = new Scanner(System.in);
            System.out.println(" escribe 10 numeros ( los que quieras en el orden que quieras)");
        for (int cont = 0; cont < numeros.length; cont++) {
            numeros[cont] = sc.nextFloat();
        }


        Arrays.sort(numeros);
        float numerominimo = numeros[0];
        float numeromaximo = numeros[numeros.length-1];

        System.out.println("El numero mas Grande es: " + numeromaximo );
        System.out.println(" El numero mas pequeño es: " + numerominimo );
    }
}