import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean error;
    public static void main(String[] args) {

        String respuesta;


        try {
            do {
                System.out.println("Quieres introducir un cliente?(si/no)");
                Scanner sc = new Scanner(System.in);
                respuesta = sc.nextLine();
                respuesta.toLowerCase();
            if (respuesta.equalsIgnoreCase("si"))
                datoscliente();
                movimientoscuenta();

            } while (!respuesta.equalsIgnoreCase("no"));
        } catch (Exception e) {

        }
    }

    public static void datoscliente() {

        LocalDateTime fechaoperacion;
        String numerocuenta;
        String nombre;
        String saldoinicial;
        int numdemovimientos; // ingresos y retiradas
        StringBuilder datosentrada = new StringBuilder();
        Scanner sc = new Scanner(System.in);


        // nombre cliente
        error = true;
        do {
            try {
                System.out.println("Nombre del Cliente: ");
                nombre = sc.nextLine();
                Pattern pat = Pattern.compile("^[A-Z][a-z]{4,25}");
                Matcher mat = pat.matcher(nombre);
                if (mat.matches()){
                    datosentrada.append("Nombre cliente: " + nombre + "\n");
                    error = false;
                } else {
                    throw new Exception("El nombre solo contiene letras y sin espacios");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (error);

        // numero de cuenta
        error = true;
        do {
            try {
                System.out.println("Numero de cuenta: ");
                numerocuenta = sc.nextLine();
                Pattern pat = Pattern.compile("^[A-Z][a-z]{2}/[0-9]{22}");
                Matcher mat = pat.matcher(numerocuenta);
                if (mat.matches()){
                     int numerobanco = Integer.parseInt(numerocuenta);
                    datosentrada.append("Numero Cuenta: " + numerobanco + "\n");
                    error = false;
                } else {
                    throw new Exception("Numero de cuenta invalido");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (error);

        // saldo inicial
        error = true;
        do {
            try {
                System.out.println("Introduce el saldo incial: ");
                saldoinicial = sc.nextLine();
                Pattern pat = Pattern.compile("^[0-9]");
                Matcher mat = pat.matcher(saldoinicial);
                if (mat.matches()){
                    int saldo = Integer.parseInt(saldoinicial);
                    datosentrada.append("Saldo inicial: " + saldo + "\n");
                    error = false;
                } else {
                    throw new Exception("Numero de saldo invalido");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (error);

    }

    public static void movimientoscuenta() {
        String respuestamovimiento;
        String tipomovimiento;
        String cantidadmovimiento;
        StringBuilder movimientos = new StringBuilder();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quieres meter un movimiento?(si/no)");
            respuestamovimiento = sc.nextLine();

            error = true;
            do {
                try {
                    System.out.println("Añade el tipo de movimiento y importe que has echo: ");
                    Scanner sd = new Scanner(System.in);
                    tipomovimiento = sd.nextLine();
                    Pattern pat = Pattern.compile("^[A-Z][a-z]");
                    Matcher mat = pat.matcher(tipomovimiento);
                    if (!mat.matches()) {
                        throw new Exception("Movimiento invalido");
                    } else {
                        movimientos.append(tipomovimiento);
                        error = false;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (error);

            error = true;
            do {
                try {
                    System.out.println("Cantidad del tipo de movimiento: ");
                    Scanner sd = new Scanner(System.in);
                    cantidadmovimiento = sd.nextLine();
                    Pattern pat = Pattern.compile("^[0-9]");
                    Matcher mat = pat.matcher(cantidadmovimiento);
                    if (!mat.matches()) {
                        throw new Exception("Cantidad invalido");
                    } else {
                        int mcantidad = Integer.parseInt(cantidadmovimiento);
                        movimientos.append(mcantidad);
                        error = false;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (error);

        } while (respuestamovimiento.equalsIgnoreCase("no"));
    }
}