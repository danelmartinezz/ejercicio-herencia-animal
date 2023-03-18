package animal;

public abstract class Mamifero extends Animal {

    public Mamifero() {
    }

    public Mamifero(String genero) {
        super(genero);
        this.especie = "Mamifero";
    }

    public Mamifero(String genero, String habitat) {
        super(genero, habitat);
        this.especie = "Mamifero";
    }

    public Mamifero(String genero, String habitat, String tipoAlimentacion) {
        super(genero, habitat, tipoAlimentacion);
        this.especie = "Mamifero";
    }

    public Mamifero(String genero, String habitat, String tipoAlimentacion, double altura) {
        super(genero, habitat, tipoAlimentacion, altura);
        this.especie = "Mamifero";
    }

    public Mamifero(String genero, String habitat, String tipoAlimentacion, double altura, double peso) {
        super(genero, habitat, tipoAlimentacion, altura, peso);
        this.especie = "Mamifero";
    }

    public Mamifero(String genero, String habitat, String tipoAlimentacion, double altura, double peso, int edad) {
        super(genero, habitat, tipoAlimentacion, altura, peso, edad);
        this.especie = "Mamifero";
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

    public abstract void mostrarInformacion();
}
