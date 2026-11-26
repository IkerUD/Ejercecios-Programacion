import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static int nro;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea un número");
        nro = sc.nextInt();
        do
        {
            funcionPrimo();
            nro = nro - 1;
        }
        while(nro > 2);
        // Para el dos
        System.out.println("El número " + nro + " SI es un número primo");
        nro--;
        // Para el uno
        System.out.println("El número " + nro + " NO es un número primo");
    }

    public static void funcionPrimo(){
        int divisor = nro;
        int resto;
        do
        {
            divisor = divisor - 1;
            resto = nro % divisor;
        }
        while (resto != 0 && divisor > 2);
        visualizar(resto);

    }
    public static void visualizar(int resto){
        if (resto == 0)
            System.out.println("El número " + nro + " NO es un número primo");
        else
            System.out.println("El número " + nro + " SI es un número primo");
    }
}