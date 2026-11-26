import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String codigop;

        System.out.println("Escribre tu codigo postal");
        Scanner sc = new Scanner(System.in);
        codigop = sc.nextLine();

        Pattern pat = Pattern.compile("[0-9]{5}");
        Matcher mat = pat.matcher(codigop);
        if (mat.matches()) {
            System.out.println("el codigo postal " + codigop + " es valido");
        } else {
            System.out.println("el codigo postal " + codigop + " no es valido");


        }


    }
}