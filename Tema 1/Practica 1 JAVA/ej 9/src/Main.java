import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long n1;
        long n2;
        long n3;

        System.out.println("Escribe 3 numeros");
        Scanner val = new Scanner(System.in);

        n1 = val.nextLong();
        n2 = val.nextLong();
        n3 = val.nextLong();

        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + " Es mayor que " + n2 + " y " + n3);
        else
            if (n2 > n1 && n2 > n3)
                System.out.println(n2 + " Es mayor que " + n2 + " y " + n3);
            else if (n3 > n1 && n3 > n2)
                System.out.println(n3 + " Es mayor que " + n2 + " y " + n3);

        if (n1 < n2 && n1 < n3)
            System.out.println(n1 + " Es menor que " + n2 + " y " + n3);
        else
            if (n2 < n1 && n2 < n3)
                System.out.println(n2 + " Es menor que " + n2 + " y " + n3);
            else if(n3 < n1 && n3 < n2)
                System.out.println(n3 + " Es menor que " + n2 + " y " + n3);
    }
}