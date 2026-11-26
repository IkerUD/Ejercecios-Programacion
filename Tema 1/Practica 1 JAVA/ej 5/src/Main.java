import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int R;
        System.out.println("Introducce el radio");
        Scanner val = new Scanner(System.in);
        R = val.nextInt();
        System.out.println("El Area es " + (3.14 * R * R ));



    }
}