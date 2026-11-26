import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // he puesto las comillas para que el bucle DO-WHILE no me diera error
        String opcion = "";
        do {

        Scanner cs = new Scanner(System.in);

        try {
            // Menu
            System.out.println(" -- MENU --");
            System.out.println("a) Calcular la edad de una persona");
            System.out.println("b) Numeros pares y primos:");
            System.out.print("c) Polindromo");
            System.out.println(" d) Salir");
            System.out.println("---------------");
            System.out.println("Elige una opcion: entre (a-d) ");
            opcion = cs.nextLine();
            if (opcion.length() > 1)
                throw new Exception("las opciones solo tienen una letra elige de la (a-d) gracias!");

            switch (opcion) {
                case "a" -> {
                    calcularedad();
                    break;
                }
                case "b" -> {
                    numeroprimo();
                    numeropar();
                    break;
                }
                case "c" -> {
                    examinarpolindromo();
                    break;
                }
                case "d" -> {
                    System.out.println("Saliendo del programa...Espera");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        } while (!opcion.equals("d"));
    }


    // Variable donde calcularemos la edad de esta persona
    public static int calcularedad() {

        try {
            String ano;
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el año en la que naciste (SOLO NUMEROS):");
            ano = sc.nextLine();
            if (ano.length() > 4)
                throw new Exception("el año no tiene mas de 4 numeros! ejemplo: 2007");
            int Ano = Integer.parseInt(ano);


            String mes;
            System.out.println("Dime el mes en la que naciste (SOLO NUMEROS):");
            mes = sc.nextLine();
            if (mes.length() > 2)
                throw new Exception("el mes no tiene mas de 2 numeros! ejemplo: (05) ");
            int Mes = Integer.parseInt(mes);

            String dia;
            System.out.println("Dime el dia en la que naciste (SOLO NUMEROS):");
            dia = sc.nextLine();
            if (dia.length() > 2)
                throw new Exception("el dia no tiene mas de 2 numeros! ejemplo: (31) ");
            int Dia = Integer.parseInt(dia);


            LocalDate nacimiento = LocalDate.of(Ano, Mes, Dia);
            LocalDate hoy = LocalDate.now();
            int edad = Period.between(nacimiento, hoy).getYears();
            System.out.println("tu edad es la siguiente: " + edad + " años.");


            return edad;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } ;
        return 0;
    };
        // Variable donde calcularemos los numeros primos y pares
    public static int numeroprimo () {

        try {
            int primo;
            Scanner sc = new Scanner(System.in);
            System.out.println("Dinos un numero cualquiera: ");
            primo = sc.nextInt();
            if (primo < 0)
                throw new Exception("No se permiten numeros negativos SIEMPRE positivos");

            // calcular numero primo
            if (primo < 3) {
                if (primo == 1) {
                    System.out.println("El numero " + primo + " NO es primo");
                } else if (primo == 2)
                    System.out.println("El numero " + primo + " ES primo");
            } else {
                // Divisiones para ver si es primo o no.
                int divisor = primo;
                int resto;
                do {
                    divisor = divisor - 1;
                    resto = primo % divisor;
                }
                while (resto != 0 && divisor > 2);
                if (resto == 0)
                    System.out.println("El número " + primo + " NO es un número primo");
                else
                    System.out.println("El número " + primo + " SI es un número primo");

            }

            return primo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

            // calcular numero par
    public static int numeropar() {
        try {
            int par;
            Scanner sc = new Scanner(System.in);
            System.out.println("Dinos otro numero cualquiera: ");
            par = sc.nextInt();
            if (par < 0)
                throw new Exception("No se permiten numeros negativos SIEMPRE positivos");


            if (par == 0) {
                System.out.println("tu numero " + par + " es par");
            } else if (par == 1) {
                System.out.println("Tu numero " + par + " es impar");
            } else if (par > 1) {
                while (par > 0) {
                    par = par / 2;
                }

                if (par == 0) {
                    System.out.println("tu numero " + par + " es par");
                } else if (par == 1) {
                    System.out.println("Tu numero " + par + " es impar");
                }
            }
            return par;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void examinarpolindromo() {
        System.out.println("------------------------");
        System.out.println("--- EN MANTENIMIENTO ---");
        System.out.println("------------------------");
    }
} 