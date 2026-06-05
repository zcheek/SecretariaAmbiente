import java.util.ArrayList;
public class InspectorJuridico extends Inspector{
    private String[] normativas; 
    
    public InspectorJuridico(int matricula, String apellido, String nombre, int aniosExp, String[] normativas){
        super(matricula,  apellido, nombre, aniosExp);
        this.normativas = normativas;
    }
    
    @Override
    public int calcularCostoIntervencion() {  // Punto 5 P3
        return 100000 + (getAniosExp() * 20);
    }
        
    @Override
    public String generarInforme(Denuncia denuncia){  // Punto 4 P3
        return "Informe juridico - Inspector: " + getNombre() + " " + getApellido() +
         ". Matricula: " + getMatricula() + ". Normativas aplicables relevadas: " + normativas.toString() +
          ". Evaluacion legal de hechos denunciados en: " + denuncia.getUbicacion() +
           ". Dictamen en elaboracion.";
    }
}