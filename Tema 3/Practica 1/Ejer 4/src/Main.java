import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String messolicitado;
        boolean mesencontrado = true;

        do {
        System.out.println("Escribe un mes: ");
        messolicitado = sc.nextLine().toLowerCase();


            if (Arrays.asList(meses).contains(messolicitado)) {
                System.out.println("Tu mes (" + messolicitado + ") esta en la lista");
                mesencontrado = false;
            } else {
                System.out.println("Tu mes no se encuentra en la lista");

            }
        } while (mesencontrado);
    }
}