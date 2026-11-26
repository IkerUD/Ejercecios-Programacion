import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Verificar si una cadena empieza o termina con un prefijo/sufijo.
        StringBuilder cadena = new StringBuilder(JOptionPane.showInputDialog("Teclea la cadena"));
        String tipo = JOptionPane.showInputDialog("Teclea la tipo (prefijo o sufijo)");
        String dato = JOptionPane.showInputDialog("Teclea el dato a buscar");
        buscar(cadena,tipo,dato);
    }
    public static void buscar(StringBuilder cadena, String tipo, String dato) {
        switch (tipo)
        {
            case "prefijo":
                if (cadena.toString().startsWith(dato))
                    JOptionPane.showMessageDialog(null, "Si tiene ese prefijo");
                else
                    JOptionPane.showMessageDialog(null, "No tiene ese prefijo");
                break;
            case "sufijo":
                if (cadena.toString().endsWith(dato))
                    JOptionPane.showMessageDialog(null, "Si tiene ese sufijo");
                else
                    JOptionPane.showMessageDialog(null, "No tiene ese sufijo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El tipo es erroneo");
        }
    }

}