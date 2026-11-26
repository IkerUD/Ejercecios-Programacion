import java.util.Scanner;

public class Main {

    public static String texto;
    public static int n1;
    public static int n2;

    public static void main(String[] args) {

        String mensaje = fragmento(texto,n1,n2);
        System.out.println("tu frase con las posiciones que has dicho es " + mensaje.toUpperCase() );
    }

    public static String fragmento (String texto, int n1, int n2) {
        Scanner val = new Scanner(System.in);
        System.out.println ("Dime una palabra o frase");
        texto = val.nextLine();
        System.out.println("Dime entre que 2 posiciones quieres que te enseñemos la frase:");
        n1 = val.nextInt();
        n2 = val.nextInt();
        texto = texto.substring(n1,n2);

        return texto;
    }
}