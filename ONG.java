public class ONG extends Denunciante{
    public ONG(String nombreOrganizacion, String nombreRepresentante, String cuit, String email){
        super(nombreOrganizacion, nombreRepresentante, cuit, email);
    }
    @Override
    public String getTipoDenunciante(){
        return "Organizacion No Gubernamental";
    }
}