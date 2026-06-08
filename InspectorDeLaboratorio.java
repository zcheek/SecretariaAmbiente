public class InspectorDeLaboratorio extends Inspector {
    
    private String especialidad;
    private String nombreLaboratorio;

    public InspectorDeLaboratorio (int matricula, String nombre, String apellido, int aniosExp, String especialidad, String nombreLaboratorio){
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
    public int calcularCostoIntervencion(){ // Punto 5 P3
        return 200000;
    }

    @Override
    public String generarInforme(Denuncia denuncia) {  // Punto 4 P3
        return "Informe de laboratorio - Inspector:" + getNombre() + ". Laboratorio:" + getNombreLaboratorio()
         + ". Especialidad:" + getEspecialidad() + ". Análisis de muestras correspondientes a denuncia en:" + denuncia.getUbicacion() + ". Resultados pendientes de validacion.";
    }

    @Override
    public String getTipoInspector() {
        return "Inspector de Laboratorio";
    }
}
