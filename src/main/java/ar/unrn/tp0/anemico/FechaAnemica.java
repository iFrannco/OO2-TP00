package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;

public class FechaAnemica {
    private LocalDateTime fecha;

    public FechaAnemica(){
        this.fecha = LocalDateTime.now();
    }

    public LocalDateTime getFecha(){
        return this.fecha;
    }

    public void setFecha(LocalDateTime nuevaFecha){
        this.fecha = nuevaFecha;
    }
}
