import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int alumnos = 0;
        int niños = 0;
        int Sumaedades = 0 ;
        int edad;
        float promedio;

        Scanner val = new Scanner(System.in);

        System.out.println("Di tu numero de alumnos");
        alumnos = val.nextInt();

        while (niños < alumnos) {

            System.out.println("Introduce tu edad");
            edad = val.nextInt();

            Sumaedades = Sumaedades + edad;

            niños = niños + 1;
        }

        promedio = Sumaedades / alumnos;
        System.out.println("La edad media es " + promedio );




    }
}