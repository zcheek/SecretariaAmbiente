import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalTime;

public class TestSecretariaAmbiente {

    public static void main(String[] args){
        SecretariaAmbiente secramb = new SecretariaAmbiente("Secretaria de Medio Ambiente", "Rio Negro", "Sistema de denuncias para la protección del entorno natural patagónico."); // P2 Punto 1
        
		Denunciante d1 = new Ciudadano("Santiago", "Silva", "12062011", "tanquevelezX100PRE@gmail.com"); // Punto 2 P2
		Denunciante d2 = new Ciudadano("Pipita", "Higuaín", "05072014", "pipanapoles@gmail.com"); // Punto 2 P2
		Denunciante d3 = new Ciudadano("Leonardo", "Ponzio", "05082015", "leoponzio23@gmail.com"); // Punto 2 P2
		Denunciante d4 = new Ciudadano("Gonzalo", "Martínez", "09122018", "pitymartineztercero@gmail.com"); // Punto 2 P2
		Denunciante d5 = new Ciudadano("Marcelo", "Barovero", "27112014", "trapito1@gmail.com"); // Punto 2 P2
		
		secramb.cargarDenunciante(d1); // Punto 3 P2
		secramb.cargarDenunciante(d2); // Punto 3 P2
		secramb.cargarDenunciante(d3); // Punto 3 P2
		secramb.cargarDenunciante(d4); // Punto 3 P2
		secramb.cargarDenunciante(d5); // Punto 3 P2

        Categoria catAgua = new Categoria("Contaminacion Hídrica", 30);
        Categoria catAtmosferica = new Categoria("Contaminación Atmosférica", 20);
        Categoria catResiduos = new Categoria("Residuos Peligrosos", 25);
        Categoria catSonora = new Categoria("Contaminación Sonora", 10);
        
		Denuncia denunciaUno = new Denuncia(00001, "Vuelco de efluentes extraños en la costa del río", "Av. Franciso de Viedma", catAgua); // Punto 4 A P2
		Denuncia denunciaDos = new Denuncia(00002, "Columna de humo tóxico proveniente de un local", "Calle Buenos Aires 912", catAtmosferica); // Punto 4 A P2
		Denuncia denunciaTres = new Denuncia(00003, "Abandono de bolsas con líquidos sospechosos", "Calle Belgrano 236", catResiduos); // Punto 4 A P2
		Denuncia denunciaCuatro = new Denuncia(00004, "Acumulación de residuos no habituales con mal olor", "Plaza San Martin", catResiduos); // Punto 4 A P2
		Denuncia denunciaCinco = new Denuncia(00005, "Ruidos molestos por vehículos modificados en la vía pública", "Centro Cultural de Viedma", catSonora); // Punto 4 A P2

		secramb.cargarDenuncia(denunciaUno); // Punto 4 A P2
		secramb.cargarDenuncia(denunciaDos); // Punto 4 A P2
		secramb.cargarDenuncia(denunciaTres); // Punto 4 A P2
		secramb.cargarDenuncia(denunciaCuatro); // Punto 4 A P2
		secramb.cargarDenuncia(denunciaCinco); // Punto 4 A P2
        
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

		

		denunciaUno.registrarEvento("Contaminacion de agua en el rio"); // Punto 5
		denunciaUno.registrarEvento("Veo residuos plasticos en el rio"); // Punto 5
		denunciaDos.registrarEvento("Humo en un local en el centro de Viedma "); // Punto 5
		denunciaDos.registrarEvento("El humo es negro"); // Punto 5
		denunciaDos.registrarEvento("El humo es negro porque vi que lo que estan quemando es plastico"); // Punto 5
		denunciaTres.registrarEvento("Una persona dejo una bolsa de basura con liquidos extraños"); // Punto 5
		denunciaCuatro.registrarEvento("Vi una cantidad excesiva de residuos no comunes en el suelo"); // Punto 5
		denunciaCuatro.registrarEvento("Los residuos tienen un olor insano"); // Punto 5
		denunciaCinco.registrarEvento("Escucho ruidos a gran volumen provenientes de la zona del centro cultural viedmense"); // Punto 5
		denunciaCinco.registrarEvento("Los ruidos vienen de autos modificados en la vereda del centro cultural."); // Punto 5


        Recompensa canjeUno = new Recompensa (1, "Kit de Compostaje", 15); // Punto 6
        d1.canjearRecompensa(canjeUno); // Punto 6
        
        for (Denunciante d : secramb.getDenunciantes()){ // Punto 7
            System.out.println("Denunciante: " + d.getNombre());
            for (Canje c : d.getHistorialCanjes()){
                System.out.println("Canje: " + c.getDescripcion());
            }
        }
		
		
		for (Denunciante d: secramb.getDenunciantes()){ // Punto 8
            System.out.println("Denunciante: " + d.getNombre());
            for(Denuncia denuncia : d.getDenunciasRealizadas()){
                System.out.println(" " + denuncia.toString());
                for (Evento e : denuncia.getEventos()){
                    System.out.println(" Evento: " + e.toString());
                }
            }
        }
        
    	System.out.println("Total denuncias registradas: " + secramb.getCantDenuncias()); // Punto 9
    	System.out.println("Total denunciantes registrados: " + secramb.getCantDenunciantes()); // Punto 10
    }
}