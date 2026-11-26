import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int num, numeroimpar = 0, suma = 0, cont = 0;

     System.out.println("Introduce el numero");

        Scanner val = new Scanner(System.in);
        num = val.nextInt();

        while ( cont <= num) {

            suma = suma + numeroimpar;
            numeroimpar = numeroimpar + 2;

            cont = cont + 1;
        }

        System.out.println("El cuadrado de " + num + " es " + suma);
    }
}