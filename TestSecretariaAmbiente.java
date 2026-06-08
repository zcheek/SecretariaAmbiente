import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalTime;

public class TestSecretariaAmbiente {
    public static void main(String[] args){
        SecretariaAmbiente secramb = new SecretariaAmbiente("Secretaria de Medio Ambiente", new Ubicacion("Rio Negro"), "Sistema de denuncias para la protección del entorno natural patagónico."); // P2 Punto 1
        
        Ubicacion ubi1 = new Ubicacion("Av. Franciso de Viedma");
        Ubicacion ubi2 = new Ubicacion("Calle Buenos Aires 912");
        Ubicacion ubi3 = new Ubicacion("Calle Belgrano 236");
        Ubicacion ubi4 = new Ubicacion("Plaza San Martin");
        Ubicacion ubi5 = new Ubicacion("Centro Cultural de Viedma");

        Denunciante d1 = new Ciudadano("Santiago", "Silva", "12062011", "tanquevelezX100PRE@gmail.com"); // Punto 2 P2
        Denunciante d2 = new Ciudadano("Pipita", "Higuaín", "05072014", "pipanapoles@gmail.com"); // Punto 2 P2
        Denunciante d3 = new ONG("ANTIDISTURBIOS ONG", "Claudio Tapia", "30201120253", "claudiotapia@gmail.com"); // Punto 2 P2
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
        
        Denuncia denunciaUno = new Denuncia("RECIBIDA", 00001, "Vuelco de efluentes extraños en la costa del río", ubi1, catAgua ); // Punto 4 A P2
        Denuncia denunciaDos = new Denuncia("RECIBIDA",00002, "Columna de humo tóxico proveniente de un local", ubi2, catAtmosferica); // Punto 4 A P2
        Denuncia denunciaTres = new Denuncia("RECIBIDA", 00003, "Abandono de bolsas con líquidos sospechosos", ubi3, catResiduos); // Punto 4 A P2
        Denuncia denunciaCuatro = new Denuncia("RECIBIDA", 00004, "Acumulación de residuos no habituales con mal olor", ubi4, catResiduos); // Punto 4 A P2
        Denuncia denunciaCinco = new Denuncia("RECIBIDA", 00005, "Ruidos molestos por vehículos modificados en la vía pública", ubi5, catSonora); // Punto 4 A P2

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

        // Denuncia 1
        Evento evento1 = new Evento("04/06/2026", "Denuncia recibida y registrada en el sistema. Se asignó expediente 00001."); // Punto 5 P2
        Evento evento2 = new Evento("06/06/2026", "Se envio personal para relevamiento inicial de la zona afectada."); // Punto 5 P2
        Evento evento11 = new Evento("08/06/2026", "Se tomaron muestras de agua. Resultados confirmaron contaminacion."); // Punto 5 P2
        Evento evento12 = new Evento("15/06/2026", "Denuncia resuelta. Los niveles de contaminacion volvieron a parametros aceptables."); // Punto 5 P2
    
        // Denuncia 2
        Evento evento3 = new Evento("04/02/2026", "Denuncia recibida y registrada en el sistema. Se asigno expediente 00002."); 
        Evento evento4 = new Evento("07/02/2026", "Se envio inspector. Confirma humo negro por quema de plásticos en la parte trasera del local."); 
        Evento evento5 = new Evento("09/02/2026", "Se hizo acta de infracción al dueño del local y se apago el foco. Denuncia resuelta.");
        
        // Denuncia 3
        Evento evento6 = new Evento("10/02/2026", "Denuncia recibida y registrada en el sistema. Se asignó expediente 00003."); 
        Evento evento7 = new Evento("11/02/2026", "Inspector confirma bolsas con líquidos químicos. Se llama a equipo especializado de recolección."); 
        Evento evento8 = new Evento("13/02/2026", "Material peligroso retirado de la vía pública con éxito. Denuncia resuelta.");

        // Denuncia 4
        Evento evento15 = new Evento("15/02/2026", "Denuncia recibida y registrada en el sistema. Se asignó expediente 00004."); 
        Evento evento16 = new Evento("16/02/2026", "Inspector acude a la plaza pero no encuentra la acumulación de basura (ya había pasado el recolector municipal)."); 
        Evento evento17 = new Evento("16/02/2026", "Se cierra la denuncia por falta de pruebas comprobables en el lugar.");
        
        // Denuncia 5
        Evento evento9 = new Evento("04/06/2026", "Denuncia recibida y registrada en el sistema. Se asignó expediente 00005."); // Punto 5 P2
        Evento evento10 = new Evento("04/06/2026", "Personal de transito acude al Centro Cultural, confirma ruidos molestos y retiene los vehiculos modificados. Denuncia resuelta."); // Punto 5 P2
        
        
        // Registro de la historia de la denuncia 1
        denunciaUno.registrarEvento(evento1);
        denunciaUno.registrarEvento(evento2);
        denunciaUno.registrarEvento(evento11);
        denunciaUno.registrarEvento(evento12);

		// dentro de la denuncia uno, como ya concluye el ciclo de vida completo, vamos a cambiar el estado a "CERRADA_ACEPTADA".
		denunciaUno.resolverFavorablemente(); // con este metodo asignamos el estado a cerrada_aceptada y sumamos los puntos correspondientes.
        
        // Registro de la denuncia 2
        denunciaDos.registrarEvento(evento3);
        denunciaDos.registrarEvento(evento4);
        denunciaDos.registrarEvento(evento5);
        denunciaDos.resolverFavorablemente();

        // registro de la denuncia 3
        denunciaTres.registrarEvento(evento6);
        denunciaTres.registrarEvento(evento7);
        denunciaTres.registrarEvento(evento8);
        denunciaTres.resolverFavorablemente();
        

        //registro de la denuncia 4

        denunciaCuatro.registrarEvento(evento15);
        denunciaCuatro.registrarEvento(evento16);
        denunciaCuatro.registrarEvento(evento17);
        denunciaCuatro.setEstado("CERRADA_CANCELADO");

        //registro de la denuncia 5
        denunciaCinco.registrarEvento(evento9);
        denunciaCinco.registrarEvento(evento10);
        denunciaCinco.resolverFavorablemente();
        

        Recompensa canjeUno = new Recompensa (1, "Kit de Compostaje", 20); // Punto 6 P2
        d1.canjearRecompensa(canjeUno); // Punto 6 P2
        
        for (Denunciante d : secramb.getDenunciantes()){ // Punto 7 P2
            System.out.println("Denunciante: " + d.getNombre() + " (" + d.getTipoDenunciante() + ")");
            for (Canje c : d.getHistorialCanjes()){
                System.out.println("Canje: " + c.getDescripcion());
            }
        }
        
        System.out.println("\n");

        for (Denunciante d: secramb.getDenunciantes()){ // Punto 8 P2
            System.out.println("Denunciante: " + d.getNombre());
            for(Denuncia denuncia : d.getDenunciasRealizadas()){
                // Imprimimos la cabecera con formato
                System.out.println(" " + denuncia.toString());
                System.out.println("\n Eventos:\n");
                
                // Contador para emular la lista numerada del PDF
                int contadorEventos = 1; 
                for (Evento e : denuncia.getEventos()){
                    System.out.println("   " + contadorEventos + ". " + e.toString());
                    contadorEventos++;
                }
                System.out.println("\n --------------------------------------------------\n");
            }
        }

        System.out.println("Total denuncias registradas: " + secramb.getCantDenuncias()); // Punto 9 P2
        System.out.println("Total denunciantes registrados: " + secramb.getCantDenunciantes()); // Punto 10 P2
        System.out.println("LOS PUNTOS TOTALES DE LOS PIBES SON: " + d2.getPuntajeTotal());
    }   
}