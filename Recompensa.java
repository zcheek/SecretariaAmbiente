public class Recompensa{
    private int codigo;
    private String nombre;
    private int puntosRequeridos;

    public Recompensa(int codigo, String nombre, int puntosRequeridos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.puntosRequeridos = puntosRequeridos;
    }
    public String getNombre(){ 
        return nombre; 
    }
    public int getPuntosRequeridos(){ 
        return puntosRequeridos; 
    }
}