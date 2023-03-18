package animal;

public class Mamifero extends Animal {
    protected double altura;
    protected int edad;
    protected String tipoAlimentacion;

    public Mamifero(double altura, int edad, String tipoAlimentacion) {
        this.altura = altura;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Mamifero(String especie, double altura, int edad, String tipoAlimentacion) {
        super(especie);
        this.altura = altura;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Mamifero(String especie, String genero, double altura, int edad, String tipoAlimentacion) {
        super(especie, genero);
        this.altura = altura;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Mamifero(String especie, String genero, String habitat, double altura, int edad, String tipoAlimentacion) {
        super(especie, genero, habitat);
        this.altura = altura;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Mamifero(String especie, String genero, String habitat, double peso, double altura, int edad,
            String tipoAlimentacion) {
        super(especie, genero, habitat, peso);
        this.altura = altura;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void alimentarse() {
        System.out.println("Me alimento con " + this.tipoAlimentacion);
    }

    public void dormir() {
        System.out.println("Duermiendo...");
    }

    public void moverse() {
        System.out.println("Me desplazo...");
    }

}
