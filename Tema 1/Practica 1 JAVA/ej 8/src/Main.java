import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        long dia;
        System.out.println("Escribe el numero del 1 al 7:");
        Scanner val = new Scanner(System.in);
        dia = val.nextLong();
        if ( dia > 7 || dia < 1 )
            System.out.println("ERROR, la semana no tiene menos ni mas de 7 dias ");
        else if (dia == 1)
            System.out.println("Lunes");
        else if ( dia == 2) {
            System.out.println("Martes");
        }
        else if ( dia == 3) {
            System.out.println("Miercoles");
        }
        else if ( dia == 4) {
            System.out.println("Jueves");
        }
        else if (dia == 5) {
            System.out.println("Viernes");
        }
        else if (dia == 6) {
            System.out.println("Sabado");
        }
        else if (dia == 7) {
            System.out.println("Domindo");
        }
    }
}