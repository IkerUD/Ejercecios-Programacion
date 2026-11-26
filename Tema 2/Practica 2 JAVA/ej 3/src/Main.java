import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Dime una palabra o frase");
        char caracter = JOptionPane.showInputDialog("Dime el caracter").charAt(0);

        int veces = buscar(cadena, caracter);

        System.out.println("El caracter " + caracter + " aparece " + veces + " en el texto " + cadena);
    }

    public static int buscar(String cadena, char caracter){

        int contador = 0;
        for (int y = 0; y < cadena.length(); y++)

            if ( cadena.charAt(y) == caracter)
                contador++;

        return contador;
    }
}


