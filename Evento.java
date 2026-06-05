
public class Evento{
    private String fecha; // cambiar en uml
    private String descripcion;
    private Inspector inspectorInterviniente;

    // el de aca es pa eventos sin inspector, el otro es para eventos con inspector.
    public Evento(String fecha, String descripcion){
        this.fecha = fecha; 
        this.descripcion = descripcion;
        this.inspectorInterviniente = null;
    }
    //  Constructor para eventos CON inspector 
    public Evento(String fecha, String descripcion, Inspector inspector) {
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