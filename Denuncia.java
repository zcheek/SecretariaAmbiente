import java.util.ArrayList;
import java.time.LocalDate;

public class Denuncia{
    private int numeroExpediente;
    private LocalDate fechaIngreso;
    private String descripcion;
    private Ubicacion ubicacion;
    private String estado;
    private Categoria categoria;
    private ArrayList<Evento> eventos;
    private ArrayList<Denunciante> denunciantes;

    public Denuncia(String estado, int numeroExpediente, String descripcion, Ubicacion ubicacion, Categoria categoria){
        this.estado = estado;
        this.numeroExpediente = numeroExpediente;
        this.fechaIngreso = LocalDate.now();
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
        this.eventos = new ArrayList<>();
        this.denunciantes = new ArrayList<>();
    }

    public void cargarDenunciante(Denunciante d){
        this.denunciantes.add(d);
        d.agregarDenuncia(this);
        d.sumarPuntos(categoria.getPuntosBase());
    }

    public void registrarEvento(Evento evento){
        this.eventos.add(evento);
    }

    public int getNumeroExpediente(){
        return this.numeroExpediente;
    }
    
    public ArrayList<Evento> getEventos(){
        return this.eventos;
    }

    public Ubicacion getUbicacion(){
        return this.ubicacion;
    }

    

    public void resolverFavorablemente() {
        this.estado = "CERRADA_ACEPTADA";
        int puntosExtra = this.categoria.getPuntosBase(); //////////estos son los puntos extras
        for (Denunciante d : denunciantes) {
            d.sumarPuntos(puntosExtra);
        }
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void registrarEventoConInspector(String descripcion, Inspector inspector){
        Evento nuevoEvento = new Evento("04/06/2026", descripcion, inspector);
        this.eventos.add(nuevoEvento);
    }


    @Override
    public String toString() {
        return "Expediente: " + numeroExpediente + ", Fecha Ingreso: " + fechaIngreso + ", Descripcion: " + descripcion + ", Ubicacion: " + this.ubicacion.getZona() + ", Estado: " + estado + ", Categoria: " + categoria.getNombre();
    }
}