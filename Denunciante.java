import java.util.ArrayList;

public abstract class Denunciante{
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private int puntajeTotal;
    private ArrayList<Denuncia> denunciasRealizadas;
    private ArrayList<Canje> historialCanjes;

    public Denunciante(String nombre, String apellido, String dni, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.puntajeTotal = 0;
        this.historialCanjes = new ArrayList<>();
        this.denunciasRealizadas = new ArrayList<>();
    }

    public void sumarPuntos(int puntos){
        this.puntajeTotal += puntos;
    }

    public void agregarDenuncia(Denuncia d){
        this.denunciasRealizadas.add(d);
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPuntajeTotal(){
        return this.puntajeTotal;
    }

    public ArrayList<Denuncia> getDenunciasRealizadas(){
        return this.denunciasRealizadas;
    }

    public ArrayList<Canje> getHistorialCanjes(){
        return this.historialCanjes;
    }
    
    public void asignarCanje(Canje c){ // Punto 6
        this.historialCanjes.add(c);
    }
    
    public void canjearRecompensa(Recompensa r){ // Punto 6
        if (this.puntajeTotal >= r.getPuntosRequeridos()) {
            Canje nuevoCanje = new Canje(r);
            this.asignarCanje(nuevoCanje);
            this.puntajeTotal -= r.getPuntosRequeridos();
        } else {
            System.out.println("No tenes puntos suficientes");
        }
    }
}