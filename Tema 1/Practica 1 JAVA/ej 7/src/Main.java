import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        long nota;
        System.out.println("Escribe la nota:");
        Scanner val = new Scanner(System.in);
        nota = val.nextLong();
        if ( nota > 10 || nota < 0 )
            System.out.println("ERROR, Tiene que ser un numero del 1 al 10 ");

        else if (nota < 5)
            System.out.println("Insuficiente");
        else if ( nota == 5) {
            System.out.println("Suficiente");
        }
        else if ( nota == 6) {
            System.out.println("Bien");
            }
        else if ( nota == 7) {
            System.out.println("Muy bien");
        }
        else if (nota == 8) {
            System.out.println("Bien");
        }
        else if (nota >= 9) {
            System.out.println("Sobresaliente");
        }
    }
}