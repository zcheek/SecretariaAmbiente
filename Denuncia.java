import java.util.ArrayList;
import java.time.LocalDate;

public class Denuncia{
    private int numeroExpediente;
    private LocalDate fechaIngreso;
    private String descripcion;
    private String ubicacion;
    private String estado;
    private Categoria categoria;
    private ArrayList<Evento> eventos;
    private ArrayList<Denunciante> denunciantes;

    public Denuncia(int numeroExpediente, String descripcion, String ubicacion, Categoria categoria){
        this.numeroExpediente = numeroExpediente;
        this.fechaIngreso = LocalDate.now();
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
        this.estado = "RECIBIDA";
        this.eventos = new ArrayList<>();
        this.denunciantes = new ArrayList<>();
    }

    public void cargarDenunciante(Denunciante d){
        this.denunciantes.add(d);
        d.agregarDenuncia(this);
        d.sumarPuntos(categoria.getPuntosBase());
    }
    
    public void registrarEvento(String Evento){
        Evento nuevoEvento = new Evento(LocalDate.now(), Evento);
        this.eventos.add(nuevoEvento);
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public int getNumeroExpediente(){
        return this.numeroExpediente;
    }
    
    public ArrayList<Evento> getEventos(){
        return this.eventos;
    }

    public void resolverFavorablemente() {
        this.estado = "CERRADA_ACEPTADA";
        this.registrarEvento("Denuncia resuelta favorablemente");
        
        // recorro la lsita y le doy 10 puntos a cada denunciante.
        for (Denunciante d : denunciantes) {
            d.sumarPuntos(10); 
        }
    }
    @Override
    public String toString() {
        return "Expediente: " + numeroExpediente + ", Fecha Ingreso: " + fechaIngreso + ", Descripcion: " + descripcion + ", Ubicacion: " + ubicacion + ", Estado: " + estado + ", Categoria: " + categoria.getNombre();
    }
}