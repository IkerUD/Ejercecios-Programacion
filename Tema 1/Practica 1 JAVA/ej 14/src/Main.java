import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x= 0;
        int nota;
        int mayor = 0;
        int menor = 10;
        String nombre;


        while ( x <= 5 ){
            System.out.println("Introduce tu nombre");
            Scanner ay = new Scanner (System.in);
            nombre = ay.nextLine ();


            System.out.println("Introduce tu nota");
            Scanner sc = new Scanner (System.in);
            nota = sc.nextInt ();




            if (nota >= 5){
                System.out.println (nombre +  " ha aprobado");
            } else {
                System.out.println ( nombre + " ha suspendido");
            }
            if (nota > mayor){
                mayor = nota ;
            }


            if(nota < menor){
                menor = nota ;
            }


            x++;


        }


        System.out.println( "La nota mayor es " + mayor );
        System.out.println( "La nota menor es " + menor );


    }
}