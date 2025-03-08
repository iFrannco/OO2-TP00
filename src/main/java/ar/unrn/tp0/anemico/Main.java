package ar.unrn.tp0.anemico;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        // Esta clase es no anémica porque puede hacer las cosas por su cuenta
        // no tiene getters y setters para que otros realicen una operación
        // sobre sus datos, sino que ella misma realiza esas operaciones
        var fecha = new FechaNoAnemica();
        System.out.println("Clase no anemica: ");
        fecha.fechaCorta();
        fecha.fechaLarga();

        // En cámbio esta clase si es anémica porque no hace nada por sí sola
        // simplemente retorna los atributos y además expone sus implementaciones
        var otraFecha = new FechaAnemica();
        System.out.println("\nClase anemica:");
        System.out.println(otraFecha.getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(otraFecha.getFecha().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
}