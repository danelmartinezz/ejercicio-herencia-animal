package animal;

public abstract class Peces extends Animal {
    protected String color;
    protected int numeroAletas;
    protected int numeroBranquias;

    public Peces(String color, int numeroAletas, int numeroBranquias) {
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String color, int numeroAletas, int numeroBranquias) {
        super(genero);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String habitat, String color, int numeroAletas, int numeroBranquias) {
        super(genero, habitat);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String habitat, String tipoAlimentacion, String color, int numeroAletas,
            int numeroBranquias) {
        super(genero, habitat, tipoAlimentacion);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String habitat, String tipoAlimentacion, double altura, String color, int numeroAletas,
            int numeroBranquias) {
        super(genero, habitat, tipoAlimentacion, altura);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String habitat, String tipoAlimentacion, double altura, double peso, String color,
            int numeroAletas, int numeroBranquias) {
        super(genero, habitat, tipoAlimentacion, altura, peso);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public Peces(String genero, String habitat, String tipoAlimentacion, double altura, double peso, int edad,
            String color, int numeroAletas, int numeroBranquias) {
        super(genero, habitat, tipoAlimentacion, altura, peso, edad);
        this.color = color;
        this.numeroAletas = numeroAletas;
        this.numeroBranquias = numeroBranquias;
        this.especie = "Paces";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroBranquias() {
        return numeroBranquias;
    }

    public void setNumeroBranquias(int numeroBranquias) {
        this.numeroBranquias = numeroBranquias;
    }

    public abstract void mostrarInformacion();

}
