import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String frase;

        System.out.println("Escribre una frase con espacios y solo letras: ");
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();

        Pattern pat = Pattern.compile("^[a-zA-Z\s]*");
        Matcher mat = pat.matcher(frase);
        if (mat.matches()) {
            System.out.println("la frase " + frase + " cumple las caracteristicas");
        } else {
            System.out.println("la frase " + frase + " no cumple las caracteristicas");


        }


    }
}