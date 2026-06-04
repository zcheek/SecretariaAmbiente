import java.util.ArrayList;
public class InspectorJuridico extends Inspector{
    private ArrayList<String> normativas; 
    
    public InspectorJuridico(ArrayList<String> normativas, int matricula, String nombre, String apellido, int aniosExp){
        super(matricula, nombre, apellido, aniosExp);
        this.normativas = normativas;
    }
    
    @Override
    public int calcularCostoIntervencion() {
        return 100000 + (getAniosExp() * 20);
    }
        
    @Override
    public String generarInforme(Denuncia denuncia){
        return "Informe juridico - Inspector: " + getNombre() + " " + getApellido() +
         ". Matricula: " + getMatricula() + ". Normativas aplicables relevadas: " + normativas.toString() +
          ". Evaluacion legal de hechos denunciados en: " + denuncia.getUbicacion() +
           ". Dictamen en elaboracion.";
    }
}
