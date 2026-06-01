import java.util.ArrayList;

public class SecretariaAmbiente{
	private String nombre;
	private String ubicacion;
	private String descripcion;
	private int Denunciantes;
	private int denuncias;
    private ArrayList<Denunciante> denunciantes = new ArrayList<>();

	public SecretariaAmbiente(String nombre, String ubicacion, String descripcion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
	}

	public void cargarDenunciante(Denunciante d){
        this.denunciantes.add(d);
    }

    public void imprimirDenunciantes(){
        System.out.println(denunciantes);
        System.out.println();
    }
}