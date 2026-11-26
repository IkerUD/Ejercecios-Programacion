import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        int minutos;
        double total;
        int resto;
        double importeInicial;
        double descuento;
        System.out.println("Introducce los minutos consumidos");
        Scanner val = new Scanner(System.in);

        minutos = val.nextInt();

        if (minutos < 300) {
            System.out.println("Total a pagar: ");
            importeInicial = (minutos * 0.04);
            System.out.println(importeInicial);

        } else if (minutos > 300 && minutos <= 500) {
            importeInicial = (300 * 0.03);
            System.out.println("Total a pagar: ");
            System.out.println(importeInicial);

        } else if (minutos > 500 && minutos <= 800) {
            resto = (minutos - 300);
            total = ((300 * 0.03) + (resto * 0.02));
            System.out.println("Total a pagar: ");
            System.out.println(total);
        } else if (minutos > 800) {
            resto = (minutos - 300);
            importeInicial = (300 * 0.03) + (resto * 0.02);
            descuento = (importeInicial * 1.25 / 100);
            total = (importeInicial - descuento);
            System.out.println("total a pagar ");
            System.out.println(total);

        }
    }
}