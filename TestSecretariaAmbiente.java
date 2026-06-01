import java.time.LocalDate;

public class TestSecretariaAmbiente {
    public static void main(String[] args){
        SecretariaAmbiente secramb = new SecretariaAmbiente("Secretaria de Medio Ambiente", "Rio Negro", "Sistema de denuncias para la protección del entorno natural patagónico."); // P2 Punto 1
        
		Denunciante d1 = new Ciudadano("Lionel", "Messi", "18122022", "messi10fulbo@gmail.com"); // Punto 2 P2
		Denunciante d2 = new Ciudadano("Gonzalo", "Higuaín", "05072014", "pipafulbonapoles@gmaail.com"); // Punto 2 P2
		Denunciante d3 = new Ciudadano("Leonardo", "Ponzio", "05082015", "leoponzio@gmail.com"); // Punto 2 P2
		Denunciante d4 = new Ciudadano("Gonzalo", "Martínez", "09122018", "pitymartinez@gmail.com"); // Punto 2 P2
		Denunciante d5 = new Ciudadano("Marcelo", "Barovero", "27112014", "trapito1@gmail.com"); // Punto 2 P2
		
		secramb.cargarDenunciante(d1); // Punto 3 P2
		secramb.cargarDenunciante(d2); // Punto 3 P2
		secramb.cargarDenunciante(d3); // Punto 3 P2
		secramb.cargarDenunciante(d4); // Punto 3 P2
		secramb.cargarDenunciante(d5); // Punto 3 P2
        
		Denuncia denunciaUno = new Denuncia(00001, "", "Av. Franciso de Viedma",  "Contaminacion Hídrica"); // Punto 4 A P2
		Denuncia denunciaDos = new Denuncia(00002, "", "Calle Buenos Aires 912", "Contaminación Atmosférica"); // Punto 4 A P2
		Denuncia denunciaTres = new Denuncia(00003, "", "Calle Belgrano 236", "Contaminación Atmosférica"); // Punto 4 A P2
		Denuncia denunciaCuatro = new Denuncia(00004, "", "Plaza San Martin", "Residuos Peligrosos"); // Punto 4 A P2
		Denuncia denunciaCinco = new Denuncia(00005, "", "Centro Cultural de Viedma", "Contaminación Sonora"); // Punto 4 A P2
        
        denunciaUno.cargarDenunciante(d1); // Punto 4 B P2 
		denunciaDos.cargarDenunciante(d1); // Punto 4 B P2

		denunciaTres.cargarDenunciante(d2); // Punto 4 B P2
		denunciaCuatro.cargarDenunciante(d2); // Punto 4 B P2
		
		denunciaCinco.cargarDenunciante(d3); // Punto 4 B P2
		denunciaUno.cargarDenunciante(d3); // Punto 4 B P2

		denunciaDos.cargarDenunciante(d4); // Punto 4 B P2
		denunciaTres.cargarDenunciante(d4); // Punto 4 B P2

		denunciaCuatro.cargarDenunciante(d5); // Punto 4 B P2
		denunciaCinco.cargarDenunciante(d5); // Punto 4 B P2

		
    }
}