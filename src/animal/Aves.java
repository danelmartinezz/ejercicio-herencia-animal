package animal;

public class Aves extends Animal {
    protected String colorPlumaje;
    protected double longitudAlas;
    protected double alturaVuelo;

    public Aves(String colorPlumaje, double longitudAlas, double alturaVuelo) {
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String colorPlumaje, double longitudAlas, double alturaVuelo) {
        super(genero);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String habitat, String colorPlumaje, double longitudAlas, double alturaVuelo) {
        super(genero, habitat);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String habitat, String tipoAlimentacion, String colorPlumaje, double longitudAlas,
            double alturaVuelo) {
        super(genero, habitat, tipoAlimentacion);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String habitat, String tipoAlimentacion, double altura, String colorPlumaje,
            double longitudAlas, double alturaVuelo) {
        super(genero, habitat, tipoAlimentacion, altura);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String habitat, String tipoAlimentacion, double altura, double peso, String colorPlumaje,
            double longitudAlas, double alturaVuelo) {
        super(genero, habitat, tipoAlimentacion, altura, peso);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public Aves(String genero, String habitat, String tipoAlimentacion, double altura, double peso, int edad,
            String colorPlumaje, double longitudAlas, double alturaVuelo) {
        super(genero, habitat, tipoAlimentacion, altura, peso, edad);
        this.colorPlumaje = colorPlumaje;
        this.longitudAlas = longitudAlas;
        this.alturaVuelo = alturaVuelo;
        this.especie = "Aves";
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public double getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(double longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public double getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=============================");
        System.out.printf(
                "Especie: %s \nGénero: %s \nHabitat: %s \nPeso: %d \nAltura: %d \nEdad: %d \nAlimentacion: %s \nColor Plumaje: %s \nLongitud Alas: %d Mts \nAltura de Vuelo: %d Mts \n",
                this.especie,
                this.genero,
                this.habitat,
                this.peso,
                this.altura,
                this.edad,
                this.tipoAlimentacion,
                this.colorPlumaje,
                this.longitudAlas,
                this.alturaVuelo);
        System.out.println("=============================");
    }

}
