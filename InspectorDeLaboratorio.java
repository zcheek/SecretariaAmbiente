public class InspectorDeLaboratorio extends Inspector {
    
    private String especialidad;
    private String nombreLaboratorio;

    public InspectorDeLaboratorio (String especialidad, String nombreLaboratorio, int matricula, String nombre, String apellido, int aniosExp){
        super (matricula, nombre, apellido, aniosExp);
        this.especialidad = especialidad;
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public String getNombreLaboratorio(){
        return nombreLaboratorio;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    @Override
    public int calcularCostoIntervencion(){
        return 200000;
    }

    @Override
    public String generarInforme(Denuncia denuncia) {
        return "Informe de laboratorio - Inspector:" + getNombre() + ". Laboratorio:" + getNombreLaboratorio()
         + ". Especialidad:" + getEspecialidad() + ". Análisis de muestras correspondientes a denuncia en:" + denuncia.getUbicacion() + ". Resultados pendientes de validacion.";
    }
}
