public class Ubicacion {
    private String zona;

    public Ubicacion(String zona){
        this.zona = zona;
    }

    public String getZona(){
        return this.zona;
    }
    @Override
    public String toString() {
        return this.zona;
    }
}