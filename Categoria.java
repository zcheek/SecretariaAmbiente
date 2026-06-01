public class Categoria{
    private String nombre;
    private int puntosBase;

    public Categoria(String nombre, int puntosBase){
        this.nombre = nombre;
        this.puntosBase = puntosBase;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPuntosBase(){ 
        return puntosBase;
    }
}