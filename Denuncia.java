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

    public Denuncia(int numeroExpediente, String descripcion, Ubicacion ubicacion, Categoria categoria){
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

    public void registrarEvento(Evento evento){
        this.eventos.add(evento);
    }
    /// aca agregamos un setter para el estado, para que la secretaria pueda cambiarlo a medida que avanza el proceso de investigacion.
    public void setEstado(String nuevoEstado){ 
        this.estado = nuevoEstado;
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
        System.out.println("Denuncia resuelta favorablemente");
        
        for (Denunciante d : denunciantes) {
            d.sumarPuntos(10); 
        }
    }



    // ///////////////////// NUEVO: Metodo para registrar evento con inspector
    public void registrarEventoConInspector(String descripcion, Inspector inspector){
        Evento nuevoEvento = new Evento("04/06/2026", descripcion, inspector);
        this.eventos.add(nuevoEvento);
    }


    @Override
    public String toString() {
        return "Expediente: " + numeroExpediente + ", Fecha Ingreso: " + fechaIngreso + ", Descripcion: " + descripcion + ", Ubicacion: " + this.ubicacion.getZona() + ", Estado: " + estado + ", Categoria: " + categoria.getNombre();
    }
}