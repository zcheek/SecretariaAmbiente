import java.time.LocalDate;
public class Evento{
    private LocalDate fecha;
    private String descripcion;

    public Evento(LocalDate fecha, String descripcion){
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    @Override 
    public String toString() {
        return "Fecha: " + fecha + ", Descripcion: " + descripcion;
    }
}