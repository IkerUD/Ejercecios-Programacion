import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double nota;
        System.out.println("Escribe la nota:");
        Scanner val = new Scanner(System.in);
        nota = val.nextDouble();
        if (nota >= 5)
            System.out.println("Has aprobado");
        else
            System.out.println("Has suspendido");
    }
}