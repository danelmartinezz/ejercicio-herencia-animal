package animal.especies;

public abstract class Animal {
    protected String especie;
    protected String genero;
    protected String habitat;
    protected String tipoAlimentacion;
    protected double altura;
    protected double peso;
    protected int edad;

    public Animal() {
    }

    public Animal(String genero) {
        this.genero = genero;
    }

    public Animal(String genero, String habitat) {
        this.genero = genero;
        this.habitat = habitat;
    }

    public Animal(String genero, String habitat, String tipoAlimentacion) {
        this.genero = genero;
        this.habitat = habitat;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Animal(String genero, String habitat, String tipoAlimentacion, double altura) {
        this.genero = genero;
        this.habitat = habitat;
        this.tipoAlimentacion = tipoAlimentacion;
        this.altura = altura;
    }

    public Animal(String genero, String habitat, String tipoAlimentacion, double altura, double peso) {
        this.genero = genero;
        this.habitat = habitat;
        this.tipoAlimentacion = tipoAlimentacion;
        this.altura = altura;
        this.peso = peso;
    }

    public Animal(String genero, String habitat, String tipoAlimentacion, double altura, double peso, int edad) {
        this.genero = genero;
        this.habitat = habitat;
        this.tipoAlimentacion = tipoAlimentacion;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void mostrarInformacion();

}
