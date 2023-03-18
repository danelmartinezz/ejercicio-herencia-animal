package animal;

public class Animal {
    protected String especie;
    protected String genero;
    protected String habitat;
    protected double peso;

    public Animal() {
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    public Animal(String especie, String genero) {
        this.especie = especie;
        this.genero = genero;
    }

    public Animal(String especie, String genero, String habitat) {
        this.especie = especie;
        this.genero = genero;
        this.habitat = habitat;
    }

    public Animal(String especie, String genero, String habitat, double peso) {
        this.especie = especie;
        this.genero = genero;
        this.habitat = habitat;
        this.peso = peso;
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

    public void mostrarInformacion() {
        System.out.println("=============================");
        System.out.printf("Especie: %s \nGénero: %s \nHabitat: %s \nPeso: %d \n", this.especie, this.genero,
                this.habitat, this.peso);
        System.out.println("=============================");
    }

}
