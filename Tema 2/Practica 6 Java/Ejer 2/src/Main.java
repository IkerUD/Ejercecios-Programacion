import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static int cantidad;
    public static double p_unitario;
    public static int iva;
    public static String respuesta1;
    public static String respuesta2;
    public static String nombre;
    public static StringBuilder lineas;
    public static double subtotal = cantidadpunidad(cantidad, p_unitario);// Calculo del subtotal


    public static void main(String[] args) {

        // variables para guardar datos del bucle
        StringBuilder lineasDetalle;
        double totalSinIva = 0;
        double totalIva4 = 0;
        double totalIva10 = 0;
        double totalIva21 = 0;


        Scanner sc = new Scanner(System.in);

        StringBuilder lineasdetalladas = null;
        while (!respuesta1.equalsIgnoreCase("fin")) {

            // Pedir nombre del cliente
            System.out.println("Nombre: ");
            nombre = sc.nextLine();

            while (!respuesta2.equalsIgnoreCase("no")) {
                // Pedir los datos de la compra mediantes un bucle que hasta que la respuesta NO sea "no" no pare
                System.out.println("-- DIME LOS DATOS DE TU COMPRA --");

                cantidadproducto(); // Pedir la cantidad del producto

                preciounidad(); // Pedir el precio de la unidad del producto

                cantidadiva(); // Pedir el IVA del producto

                lineasdetalladas = lineasdetalle(cantidad, p_unitario, subtotal); // Va añadiendo cada vuelta del bucle

                // Acumula el total sin IVA
                totalSinIva = totalSinIva + subtotal;

                // Acumula el IVA dependiendo del que hayas dicho
                if (iva == 4) {
                    totalIva4 = totalIva4 + subtotal * 0.04;
                } else if (iva == 10) {
                    totalIva10 = totalIva10 + subtotal * 0.10;
                } else if (iva == 21) {
                    totalIva21 = totalIva21 + subtotal * 0.21;
                }

                // Variable conectada al bucle para que sigas metiendo datos o no dependiendo de la respuesta

                System.out.println("¿Quieres seguir metiendo más datos? Responde si o no:");
                respuesta2 = sc.nextLine();
            }
            System.out.println("Has terminado si es asi escribe Fin o No");
            respuesta1 = sc.nextLine();
        }

        //  Calcula el total de los IVAs
        double totalIva = totalIva4 + totalIva10 + totalIva21;
        double totalConIva = totalSinIva + totalIva;

        // Fecha Actual mediante un LocalDate

        String Fecha = LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // El texto que aparece despue de meter todos los Datos
        System.out.println(" -- FACTURA --");
        System.out.println("Nombre: " + nombre + " Fecha: " + Fecha);
        System.out.println("Lines De Detalle:");
        System.out.print(lineasdetalladas);
        System.out.println("Total Sin Iva: " + totalSinIva);

        // El texto que tiene que aparecer dependiendo del IVA
        if (totalIva4 > 0)
            System.out.println("4 % de IVA = " + totalIva4);
        else if (totalIva10 > 0)
            System.out.println("10 % de IVA = " + totalIva10);
        else if (totalIva21 > 0)
            System.out.println("21 % de IVA = " + totalIva21);

        System.out.println("Total IVA: " + totalIva);
        System.out.println("Total Con IVA: " + totalConIva);
        System.out.println("--------------------");

    }

// FUNCIONES PARA PEDIR LOS DATOS DEL BUCLE


    public static void cantidadproducto() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad del producto que tiene: ");
        cantidad = sc.nextInt();

    }

    public static void preciounidad() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Precio por unidad: ");
        p_unitario = sc.nextDouble();
    }

    public static void cantidadiva() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Precio por unidad: ");
        p_unitario = sc.nextDouble();
    }

    public static double cantidadpunidad(int cantidad, double p_unitario) {
        double subtotal = cantidad * p_unitario;


        return subtotal;
    }

    public static StringBuilder lineasdetalle(int cantidad, double p_unitario, double subtotal) {
        Scanner sc = new Scanner(System.in);

        lineas.append(cantidad + " x " + p_unitario + " = " + Main.subtotal + "\n");


        return null;
    }
}

