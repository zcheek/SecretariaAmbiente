import java.time.LocalDate;

public class Canje{
    private LocalDate fecha;
    private Recompensa recompensa;

    public Canje(Recompensa recompensa){
        this.fecha = LocalDate.now();
        this.recompensa = recompensa;
    }
    public Recompensa getRecompensa(){
        return this.recompensa;
    }

    public String getDescripcion(){
        return "Canje de recompensa: " + recompensa.getNombre() + " por " + recompensa.getPuntosRequeridos() + " puntos.";
    }
}