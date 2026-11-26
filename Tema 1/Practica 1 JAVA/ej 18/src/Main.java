import javax.swing.*;
import java.util.Random;

public class Main {

    private static int nroGenerado;

    public static void main(String[] args) {
        nroGenerado = (int) (Math.random()*100);
        System.out.println(nroGenerado);

        // Otra forma de generar un número aleatorio.
        Random random = new Random();
        nroGenerado = random.nextInt(101);
        System.out.println(nroGenerado);

        int nro;
        String nroString = JOptionPane.showInputDialog(null,"Teclea un número");
        // == false -- No es fin
        while (!nroString.equalsIgnoreCase("Fin"))
        {
            nro = Integer.parseInt(nroString); // Convierto en número
            boolean acertado = comprobar(nro);
            if (acertado) {
                JOptionPane.showMessageDialog(null, "Enhorabuena");
                nroString = "fin";
            }
            else
                nroString = JOptionPane.showInputDialog(null,"Teclea otro número");
        }

    }
    public static boolean comprobar(int nro)
    {
        if (nro != nroGenerado)
        {
            if (nro < nroGenerado)
                JOptionPane.showMessageDialog(null,"Inténtalo con un número más grande o teclea fin si te has cansado");
            else
                JOptionPane.showMessageDialog(null,"Inténtalo con un número más pequeño o teclea fin si te has cansado");

            return false;
        }
        else
        {
            return true;
        }
    }

}