import java.time.LocalDate;

public class Canje{
    private LocalDate fecha;
    private Recompensa recompensa;

    public Canje(Recompensa recompensa){
        this.fecha = LocalDate.now();
        this.recompensa = recompensa;
    }
    
}