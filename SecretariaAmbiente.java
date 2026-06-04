import java.util.ArrayList;

public class SecretariaAmbiente{
	private String nombre;
	private Ubicacion ubicacion;
	private String descripcion;
	private int Denunciantes;
	private int Denuncias;
    private ArrayList<Denunciante> denunciantes = new ArrayList<>();
    private ArrayList<Denuncia> denun = new ArrayList<>();

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

    public ArrayList<Denunciante> getDenunciantes(){
        return this.denunciantes;
    }

    public ArrayList<Denuncia> getDenuncias() {
        return this.denun;
    }

    public int getCantDenuncias(){// Punto 9
        Denuncias = 0;
        for (Denuncia denuncia : denun){
            Denuncias++;
        }
        return Denuncias;
    }

    public int getCantDenunciantes(){// Punto 10
        Denunciantes = 0;
        for (Denunciante denunciante : denunciantes){
            Denunciantes++;
        }
        return Denunciantes;
    }
}

    