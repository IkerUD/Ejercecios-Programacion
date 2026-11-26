import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    // Variable global que se usa en todas las funciones.
    private static String cadena;

    public static void main(String[] args) {
        /*
        Escribe un programa que muestre un pequeño menú con las siguientes
        opciones:
            a) Solicitar una cadena de caracteres.
            b) Visualizar el carácter de la posición x de una cadena de caracteres.
            c) Convertir la cadena de caracteres en un número entero.
            d) Convertir la cadena de caracteres en una fecha.
            e) Finalizar 
         */
        try {
            char opcion;
            // En vez de repetitiva, se puede llamar a mostarMenu desde las distintas opciones del menú.
            do {
                opcion = mostrarMenu();
                switch (opcion) {
                    case 'a':
                        solicitarCadena();
                        // mostrarMenu();
                        break;
                    case 'b':
                        visualizarCaracter();
                        break;
                    case 'c':
                        convertirNumero();
                        break;
                    case 'd':
                        convertirFecha();
                        break;
                }
            }
            while (opcion != 'e');
        } catch (Exception e)
        {
            // Problemas desconocidos
            JOptionPane.showMessageDialog(null,"Problemas desconocidos " + e.getClass());
        }
    }

    public static char mostrarMenu() {
        char opcion=' ';
        boolean error;
        do {
            try{
                String respuesta=JOptionPane.showInputDialog("Elige una opción: \n " +
                        "a) Teclea una cadena de caracteres\n" +
                        " b) Visualizar un carácter" +
                        "\n c) Convertir cadena en un número" +
                        " \n d) Convertir cadena en una fecha" +
                        " \n e) Salir");

                // Han escrito más de un carácter
                if (respuesta.length() > 1)
                    throw new Exception("Hay que elegir una opción del menú.");

                // Pasar a carácter
                opcion = respuesta.toLowerCase().charAt(0);

                // Valor correcto?
                if (opcion != 'a' && opcion != 'b' && opcion != 'c' && opcion != 'd' && opcion != 'e')
                    throw new Exception("La opción elegida no existe.");

                error = false;
            }
            catch (IndexOutOfBoundsException e) {
                // No han escrito ningún carácter. charAt(0)
                // if (respuesta.length() == 0)
                error = true;
                JOptionPane.showMessageDialog(null,"Hay que indicar una opción");
            }
            catch (NullPointerException e) {
                // x o cancel en el cuadro de diálogo de entrada
                error = true;
                JOptionPane.showMessageDialog(null,"Si quieres terminar elige la opción e");
            }
            catch(Exception e){
                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        while (error);
        return opcion;
    }

    public static void solicitarCadena(){
        boolean error;
        do {
            try{
                // Entrada de dato
                cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
                // Validación
                if (cadena.isEmpty())
                    throw new Exception("La cadena no puede estar vacía. Teclea cualquier conjunto de caracteres");
                error = false;
            }
            catch (NullPointerException e) {
                // x o cancel en el cuadro de diálogo de entrada
                error = true;
                JOptionPane.showMessageDialog(null,"Tienes que teclear una cadena.");
            }
            catch(Exception e){
                // no relanzo
                JOptionPane.showMessageDialog(null,e.getMessage());
                error = true;
            }
        }
        while (error);
    }

    public static void visualizarCaracter() throws Exception{
        boolean error=true;
        try {
            do {
                try {
                    // Entrada de dato
                    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea la posición del carácter que quieres visualizar"));
                    // No compruebo si la posición existe, dejo que salte la excepción
                    JOptionPane.showMessageDialog(null,"El carácter de la posición " + posicion + " en la cadena " +
                            cadena + " es " + cadena.charAt(posicion));
                    error = false;
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"La posición es un dato numérico");
                }
                catch (IndexOutOfBoundsException e)
                {
                    JOptionPane.showMessageDialog(null,"La posición tecleada no existe. Debe ser un número de 0 a " +
                            (cadena.length() - 1));
                }
                // no hay genérico --- Va al main
            }
            while (error);
        }

        // Fuera de la repetitiva para que pueda teclear la cadena.
        catch(NullPointerException e){
            // Pulsa la x
            JOptionPane.showMessageDialog(null,"¿ Has tecleado la cadena con la opción a?");
        }
    }

    public static void convertirNumero() throws Exception{
        try
        {
            if (cadena == null)
                throw new NullPointerException("¿ Has tecleado la cadena con la opción a?");
            // Conversión
            int numero = Integer.parseInt(cadena);
            JOptionPane.showMessageDialog(null,"La cadena tecleada ha sido convertida en el número " + numero);
        }
        catch(NullPointerException e){
            // Personalizo el mensaje
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"La cadena tecleada no se puede convertir en un número");
        }
        // Cualquier otra excepción se relanza.
    }

    public static void convertirFecha() throws Exception{
        try
        {
            // Conversión
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(cadena,formato);
            JOptionPane.showMessageDialog(null,"La cadena tecleada ha sido convertida en la fecha " + fecha);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"¿ Has tecleado la cadena con la opción a?");
        }
        catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null,"La cadena tecleada no se puede convertir en una fecha");
        }
        // Cualquier otra excepción se relanza.
    }
}
