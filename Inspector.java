public abstract class Inspector {
    private int matricula; 
    private String nombre; 
    private String apellido; 
    private int aniosExp;

    public Inspector(int matricula, String nombre, String apellido, int aniosExp) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExp = aniosExp;
    }

    // getters para acceder a los atributos privados de la clase Inspector
    public int getMatricula() { 
        return matricula; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getApellido() { 
        return apellido; 
    }
    public int getAniosExp() { 
        return aniosExp; 
    }

    // aca estan los metodos abstractos que van a ser implementador por las clases hijas.
    public abstract String generarInforme(Denuncia denuncia);
    public abstract int calcularCostoIntervencion();
    public abstract String getTipoInspector(); // agrego este metodo abstracto para que cada tipo de inspector pueda devolver su tipo (campo, laboratorio o juridico).
}