import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    // VARIABLES GLOBALES
    public static int unidadesMayor=0;
    public static LocalDate fechaMayor= LocalDate.of (9999,01,01);


    public static void main(String[] args) throws Exception {

        int unidades;
        boolean i = true, error=false;
        String nombre, caducidadTexto= "" ,nombremax="", nombreumax="", nombrefechmax="";
        do{
            try {
                do {

                    nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del producto");
                    unidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce las unidades existentes"));
                    caducidadTexto = JOptionPane.showInputDialog(null, "Introducce la fecha de caducidad del producto   dia/mes/año");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate caducidadFecha = LocalDate.parse(caducidadTexto, formato);

                    nombremax = ComprobarNombres(nombre, nombremax);

                    nombreumax = ComprobarCantidad(unidades,nombre, nombreumax);

                    nombrefechmax = ComprobarFechaDeCaducidad(caducidadFecha, nombrefechmax, nombre);

                    int a = JOptionPane.showConfirmDialog(null, "Deseas seguir?");
                    if (a == 0) {
                        i = true;
                    } else {
                        i = false;
                    }
                    error=false;
                } while (i);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage() + " " + e.getClass());
                error=true;
            }
        }while(error);
        JOptionPane.showMessageDialog(null, "El producto con el nombre mas largo es " + nombremax + "\n" +
                "El producto del que mas cantidad hay es " + nombreumax + " con " + unidadesMayor + " unidades\n" +
                "El producto que tiene la fecha de consumicion mas proxima es " + nombrefechmax + " que es el " + fechaMayor);

    }



    // comprobacion de la logitud de la cadena
    public static String ComprobarNombres(String nombre,String NombreMayor) throws Exception{
        if (nombre.length()>NombreMayor.length())
            NombreMayor=nombre;
        return NombreMayor;
    }


    // comprobacion de la fecha de la caducidad
    public static String ComprobarFechaDeCaducidad (LocalDate caducidadFecha, String NombreFechaMayor,String nombre){
        if (caducidadFecha.isBefore(fechaMayor)) {
            fechaMayor=caducidadFecha;
            NombreFechaMayor=nombre;
        }
        return NombreFechaMayor;
    }

    // conprobacion de la cantidad de producto
    public static String ComprobarCantidad(int unidades,String nombre,String NombreunidadesMayor) throws  Exception{
        if (unidades>unidadesMayor)
        {
            unidadesMayor=unidades;
            NombreunidadesMayor=nombre;
        }
        return NombreunidadesMayor;
    }





}