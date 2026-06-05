import java.util.ArrayList;

public class TestSecretariaAmbienteP3 {
    public static void main(String[] args) {
        
        // Recreamos el contexto base para que existan las denuncias
        SecretariaAmbiente secramb = new SecretariaAmbiente("Secretaria de Medio Ambiente", new Ubicacion("Rio Negro"), "Sistema de denuncias patagónico.");
        
        Ubicacion ubi1 = new Ubicacion("Av. Franciso de Viedma");
        Ubicacion ubi2 = new Ubicacion("Calle Buenos Aires 912");
        Ubicacion ubi3 = new Ubicacion("Calle Belgrano 236");
        Ubicacion ubi4 = new Ubicacion("Plaza San Martin");
        Ubicacion ubi5 = new Ubicacion("Centro Cultural de Viedma");

        Categoria catAgua = new Categoria("Contaminacion Hídrica", 30);
        Categoria catAtmosferica = new Categoria("Contaminación Atmosférica", 20);
        Categoria catResiduos = new Categoria("Residuos Peligrosos", 25);
        Categoria catSonora = new Categoria("Contaminación Sonora", 10);
        
        Denuncia denunciaUno = new Denuncia(00001, "Vuelco de efluentes extraños en la costa del río", ubi1, catAgua); 
        Denuncia denunciaDos = new Denuncia(00002, "Columna de humo tóxico proveniente de un local", ubi2, catAtmosferica); 
        Denuncia denunciaTres = new Denuncia(00003, "Abandono de bolsas con líquidos sospechosos", ubi3, catResiduos); 
        Denuncia denunciaCuatro = new Denuncia(00004, "Acumulación de residuos no habituales con mal olor", ubi4, catResiduos); 
        Denuncia denunciaCinco = new Denuncia(00005, "Ruidos molestos por vehículos modificados en la vía pública", ubi5, catSonora); 

        secramb.cargarDenuncia(denunciaUno);
        secramb.cargarDenuncia(denunciaDos);
        secramb.cargarDenuncia(denunciaTres);
        secramb.cargarDenuncia(denunciaCuatro);
        secramb.cargarDenuncia(denunciaCinco);

        // ACA EMPIEZA LA P3 

        // Punto 1 P3: Crear inspectores
        InspectorDeCampo inspCampo = new InspectorDeCampo(001, "Lavezzo", "Lucas", 22, "Zona Norte", "Toyota Hilux SW4 Diamond 2026");  
        InspectorDeLaboratorio inspLaboratorio = new InspectorDeLaboratorio(002, "Santiago", "Sarabia", 6, "Calidad de Aire", "Sarabias SA Lab");  
        InspectorJuridico inspJuridico = new InspectorJuridico(003, "Rocca", "Francisco", 12, new String[] {"Ley 25.675", "Ordenanza OM4231", "Decreto 831/93"});  

        // Punto 2 P3: Registrar en la secretaria
        secramb.cargarInspector(inspCampo);  
        secramb.cargarInspector(inspLaboratorio);  
        secramb.cargarInspector(inspJuridico);  

        // Punto 3 P3: Crear eventos con inspectores y asignarlos a las denuncias
        Evento eventoImp1 = new Evento("05/06/2026", "Veo el agua del rio de un color turbio.", inspCampo); 
        Evento eventoImp6 = new Evento("05/06/2026", "El agua del rio esta rara.", inspJuridico); 
        Evento eventoImp2 = new Evento("05/06/2026", "Los plasticos son botellas de gaseosa marca Secco.", inspJuridico); 
        Evento eventoImp3 = new Evento("05/06/2026", "Los liquidos se esparcieron por toda la vereda.", inspJuridico); 
        Evento eventoImp4 = new Evento("05/06/2026", "El olor esta provocando estados raros en las personas que estan alrededor.", inspCampo); 
        Evento eventoImp5 = new Evento("05/06/2026", "Pedi que las personas de los autos bajen el volumen y me respondieron agresivamente que no.", inspLaboratorio); 

        denunciaUno.registrarEvento(eventoImp1);  
        denunciaUno.registrarEvento(eventoImp6); // Agregado el evento 6 a la denuncia 1 para tener 2 inspectores distintos
        denunciaDos.registrarEvento(eventoImp2); 
        denunciaTres.registrarEvento(eventoImp3); 
        denunciaCuatro.registrarEvento(eventoImp4); 
        denunciaCinco.registrarEvento(eventoImp5); 

        // Punto 4 P3: Generar informes individuales
        System.out.println("--- INFORMES INDIVIDUALES (Punto 4) ---");
        System.out.println(inspCampo.generarInforme(denunciaUno)); 
        System.out.println(inspCampo.generarInforme(denunciaCuatro)); 
        System.out.println(inspJuridico.generarInforme(denunciaDos)); 
        System.out.println(inspLaboratorio.generarInforme(denunciaCinco)); 
        System.out.println(inspJuridico.generarInforme(denunciaTres)); 

        System.out.println("\n");

        // Punto 6 P3: Métodos delegados a la Secretaría
        secramb.listarInspectoresYCostos(); 
        secramb.compararInformes(denunciaUno, inspCampo, inspJuridico);
        secramb.informarCostoTotalDenuncia(denunciaUno); // aca debe imprimir el costo de tener ambos inspectores .
    }
}