import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        mostrar(fechaActual, "yyy-MM-dd");
        mostrar(fechaActual, "yyy-MM-dd");
        mostrarString(fechaActual, "yyy-MM-dd");

    public static void mostrar(LocalDate fechaActual, String formato)
    }
}