public class InspectorDeCampo extends Inspector {
    private String zonaCobertura; 
    private String Vehiculo; // esta es opcional

    public InspectorDeCampo(int matricula, String nombre, String apellido, int aniosExp, String zonaCobertura, String vehiculo) {
        super(matricula, nombre, apellido, aniosExp);
        this.zonaCobertura = zonaCobertura;
        this.Vehiculo = vehiculo;
    }

    @Override
    public String generarInforme(Denuncia denuncia) {
        String VehiculoUsado;
        if (this.Vehiculo != null) {
            VehiculoUsado = this.vehiculo;
        } else {
            VehiculoUsado = "Ninguno";
        }

        return "Informe de Campo - Inspector: " + getNombre() + " " + getApellido() + ". Sitio relevado: " + denuncia.ubicacion + ". Zona de cobertura: " + zonaCobertura + ". Vehiculo utilizado: " + VehiculoUsado + ".";


    }
    @Override 
    public int calcularCostoIntervencion() {
        int costoBase = 100000 + (getAniosExp() * 15);
        if (this.Vehiculo != null) {
            costoBase = costoBase + (costoBase * 0.10); // aumento del 10% si se uso un vehiculo.
        } 
        return costoBase;
    }
    
}
