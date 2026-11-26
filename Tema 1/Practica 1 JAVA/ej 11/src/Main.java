import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int contador = 0;
    int contadorniños = 0;
    int contadorniñas = 0;
    int edad;
    double peso;
    float estatura;
    String nombre;
    String sexo;

    while ( contador <= 3) {
        System.out.println("Dime tus datos (nombre, sexo, edad, estatura, peso)");

        Scanner val = new Scanner(System.in);

        nombre = val.nextLine();
        sexo = val.nextLine();
        edad = val.nextInt();
        estatura = val.nextFloat();
        peso = val.nextDouble();


        if (sexo.equals("masculino")) {
            if (peso >= 70 && estatura >= 1.70) {
                contadorniños = contadorniños + 1;
            }
        } else if (sexo.equals("femenino")) {
            if (peso >= 60 && estatura >= 1.60) {
                contadorniñas = contadorniñas + 1;
            }
        }
        contador = contador + 1;

    }
        System.out.println("hay " + contadorniños + " chicos aptos y hay " + contadorniñas + " chicas aptas");

    }
}