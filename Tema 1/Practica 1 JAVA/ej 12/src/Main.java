import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int alumnos;
        int niños = 0;
        int nota;
        int aprobado = 0;

        Scanner val = new Scanner(System.in);

        System.out.println("Di tu numero de alumnos");
        alumnos = val.nextInt();

        while (niños < alumnos) {

            System.out.println("Introduce tu nota");
            nota = val.nextInt();

            if (nota >= 5) {
                System.out.println("Ha aprobado");
                aprobado = aprobado + 1;
            } else if(nota < 5 ) {
                System.out.println("Ha suspendido");
            }

            niños = niños + 1;
        }

        System.out.println("Han aprobado " + aprobado + " alummnos" );


    }
}