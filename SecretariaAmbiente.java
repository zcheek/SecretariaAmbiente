import java.util.ArrayList;

public class SecretariaAmbiente{
	private String nombre;
	private Ubicacion ubicacion;
	private String descripcion;
	private int Denunciantes;
	private int Denuncias;
    private ArrayList<Denunciante> denunciantes = new ArrayList<>();
    private ArrayList<Denuncia> denun = new ArrayList<>();
    private ArrayList<Inspector> inspectores = new ArrayList<>(); 

	public SecretariaAmbiente(String nombre, Ubicacion ubicacion, String descripcion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
	}

	public void cargarDenunciante(Denunciante d){
        this.denunciantes.add(d);
    }
    public void cargarDenuncia(Denuncia d){
        this.denun.add(d);
    }

    public void cargarInspector (Inspector i){
        this.inspectores.add(i);
    }

    public ArrayList<Denunciante> getDenunciantes(){
        return this.denunciantes;
    }

    public ArrayList<Denuncia> getDenuncias() {
        return this.denun;
    }

    public int getCantDenuncias(){// Punto 9 P2
        Denuncias = 0;
        for (Denuncia denuncia : denun){
            Denuncias++;
        }
        return Denuncias;
    }

    public int getCantDenunciantes(){// Punto 10 P2
        Denunciantes = 0;
        for (Denunciante denunciante : denunciantes){
            Denunciantes++;
        }
        return Denunciantes;
    }

    public void listarInspectoresYCostos(){
        for (Inspector inspector : inspectores){
            String tipo = inspector.getTipoInspector();
            System.out.println("Inspector: " + inspector.getNombre());
            System.out.println("Tipo: " + tipo);
            System.out.println("Costo de Intervencion: $" + inspector.calcularCostoIntervencion());
        }
    }
    public void compararInformes(Denuncia denuncia, Inspector insp1, Inspector insp2) {
        System.out.println("\nCOMPARACION DE INFORMES (Expediente " + denuncia.getNumeroExpediente() + ") ");
        System.out.println(insp1.generarInforme(denuncia));
        System.out.println(insp2.generarInforme(denuncia));
    }
    public void informarCostoTotalDenuncia(Denuncia denuncia) {
        int costoTotal = 0;
        // Recorremos los eventos de esa denuncia para ver la guita de los inspectores
        for (Evento e : denuncia.getEventos()) {
            if (e.getInspector() != null) {
                costoTotal += e.getInspector().calcularCostoIntervencion();
            }
        }
        System.out.println("\n--- COSTO TOTAL DE INTERVENCIONES ---");
        System.out.println("Denuncia Expediente " + denuncia.getNumeroExpediente() + " | Total a pagar: $" + costoTotal);
    }
}

    