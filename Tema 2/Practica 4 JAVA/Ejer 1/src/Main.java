import java.util.Scanner;


public class Main {
    public static double dividendo, divisor, resultado, raiz1, raiz2;

    public static void main(String[] args) {


        try {
            System.out.println("porfavor escriba un dividendo");
            Scanner sc = new Scanner(System.in);
            dividendo = sc.nextInt();
            System.out.println("porfavor escriba un divisor");
            divisor = sc.nextInt();
            if (dividendo < 0 || divisor < 0) {
                throw new Exception(" ni el dividendo ni el divisor pueden ser negativos");

            } else {
                resultado = dividendo / divisor;
                System.out.println(" el resultado de su division es: " + resultado);

            }


        } catch (Exception e) {
            System.out.println(" ha ocurrido un error, recuerda que ninguno de los numeros nunca puede puede ser '0' o < '0' ");
        }

        raiz1 = raizdedividendo(dividendo);
        System.out.println("La raiz cuadrada de dividendo es: " + raiz1);
        raiz2 = raizdedivisor(divisor);
        System.out.println("La raiz cuadrada de dividendo es: " + raiz2);


    }


    public static double raizdedividendo(double dividendo) {
        if (dividendo <= 0) {
            System.out.println(" ha ocurrido un error, recuerda que ninguno de los numeros nunca puede puede ser '0' o < '0' ");
        } else {
             raiz1 = Math.sqrt(dividendo);
        }

        return raiz1;
    }

    public static double raizdedivisor(double divisor) {
        if (divisor <= 0) {
            System.out.println(" ha ocurrido un error, recuerda que ninguno de los numeros nunca puede puede ser '0' o < '0' ");
        } else {
             raiz2 = Math.sqrt(divisor);
        }

        return raiz2;
    }
}