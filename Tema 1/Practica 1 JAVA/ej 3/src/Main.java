import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //EJERCICIO 3

        int numero1,numero2,total;

        System.out.printf("Realiza tu multiplicacion: pon 2 numeros");

        Scanner sc = new Scanner(System.in); // solo hace falta ponerlo una vez
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        total = numero1 * numero2;

        System.out.println("tu resiltado es " +  total);



        {

        }
    }
}