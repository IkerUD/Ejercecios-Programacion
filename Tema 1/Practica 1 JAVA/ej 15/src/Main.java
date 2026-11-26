import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fibonaccitotal = 0;
        int fibonacci = 0;
        int num2 = 1;
        int num1 = 1;

        Scanner val = new Scanner(System.in);

        System.out.println("Di tu numero de de la serie de fibonacci que quieres: ");
        fibonaccitotal = val.nextInt();

        while (fibonacci < fibonaccitotal) {

            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;

            System.out.println(fibonacci);
        }

       System.out.println("Esta ha sido toda la serie hasta el numero que has elegido");


    }
}