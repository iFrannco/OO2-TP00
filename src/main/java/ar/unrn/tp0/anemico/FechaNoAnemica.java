package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FechaNoAnemica {
    private LocalDateTime fecha;

    public FechaNoAnemica(){
        this.fecha = LocalDateTime.now();
    }

    public void fechaCorta(){
        System.out.println(fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    public void fechaLarga() {
        System.out.println(fecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
}
