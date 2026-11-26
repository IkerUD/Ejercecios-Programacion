import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int posicionlista;
        int numerolista;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escribe lo que quieres que ocupe la lista de numeros: ");
        numerolista = sc.nextInt();
        int [] numerosaleatorios = new int[numerolista];

        for (int cont = 0; cont < numerolista ; cont++) {
            numerosaleatorios[cont] = (int) (Math.random() * 10);
        }

        numerolista = numerolista -1;
        System.out.println("Dime una posicion de la lista del 0 al " + numerolista );
        posicionlista = sc.nextInt();
        System.out.println(numerosaleatorios[posicionlista]);

        int suma = Arrays.stream(numerosaleatorios).sum();
        System.out.println("Esta es la suma de toda la lista: " + suma);
    }
}