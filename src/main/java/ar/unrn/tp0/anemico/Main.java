package ar.unrn.tp0.anemico;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var fecha = new FechaNoAnemica();
        System.out.println("Clase no anemica: ");
        fecha.fechaCorta();
        fecha.fechaLarga();

        var otraFecha = new FechaAnemica();
        System.out.println("\nClase anemica:");
        System.out.println(otraFecha.getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(otraFecha.getFecha().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
}