import java.time.LocalDate;
public class Evento{
    private LocalDate fecha;
    private String descripcion;
    private Inspector inspectorInterviniente;

    // el de aca es pa eventos si ninspector, el otro es para eventos con inspector.
    public Evento(LocalDate fecha, String descripcion){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.inspectorInterviniente = null;
    }
    // NUEVO: Constructor para eventos CON inspector en orto
    public Evento(LocalDate fecha, String descripcion, Inspector inspector) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.inspectorInterviniente = inspector;
    }
    // aca le mando un getter para que me devuelva el inspector interviniente, si es que lo tiene, sino devuelve null.
    public Inspector getInspector() {
        return this.inspectorInterviniente;
    }


    // sobre escribir el metodo tostring falta, bien piola con el inspector
    @Override 
    public String toString() {
        return "Fecha: " + fecha + ", Descripcion: " + descripcion;
    }
}