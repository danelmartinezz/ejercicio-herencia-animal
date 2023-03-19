package animal;

import java.io.Console;
import java.util.Scanner;

import animal.especies.Mamifero;

public class Perro extends Mamifero {
    private String nombre;
    private String raza;
    private String comidaFavorita;

    Scanner in = new Scanner(System.in);

    public Perro() {
    }

    public Perro(String nombre, String raza, String comidaFavorita) {
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String nombre, String raza, String comidaFavorita) {
        super(genero);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String habitat, String nombre, String raza, String comidaFavorita) {
        super(genero, habitat);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String habitat, String tipoAlimentacion, String nombre, String raza,
            String comidaFavorita) {
        super(genero, habitat, tipoAlimentacion);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String habitat, String tipoAlimentacion, double altura, String nombre, String raza,
            String comidaFavorita) {
        super(genero, habitat, tipoAlimentacion, altura);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String habitat, String tipoAlimentacion, double altura, double peso, String nombre,
            String raza, String comidaFavorita) {
        super(genero, habitat, tipoAlimentacion, altura, peso);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public Perro(String genero, String habitat, String tipoAlimentacion, double altura, double peso, int edad,
            String nombre, String raza, String comidaFavorita) {
        super(genero, habitat, tipoAlimentacion, altura, peso, edad);
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public Perro[] crearMascota() {
        System.out.print("Cuantos perros quieres obtener?: ");
        int cantidad = obtenerCantidad();
        Perro[] perros = new Perro[cantidad];

        for (int i = 0; i < cantidad; i++) {
            obtenerInformacionAnimal();
            obtenerInformacionPerro();

            perros[i] = new Perro(this.genero, this.habitat, this.tipoAlimentacion, this.altura, this.peso, this.edad,
                    this.nombre, this.raza, this.comidaFavorita);

            System.out.println();
            Console c = System.console();
            c.flush();
        }

        return perros;

    }

    private int obtenerCantidad() {
        int cantidad = 0;
        try {
            cantidad = Integer.parseInt(in.nextLine());
            return cantidad;
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un número por favor: ");
            obtenerCantidad();
        }
        return cantidad;
    }

    @Override
    public void obtenerInformacionAnimal() {
        System.out.print("Seleccione el sexo del perro: \n1 - Macho \n2 - Hembra \n");
        int sel = Integer.parseInt(in.nextLine());
        switch (sel) {
            case 1:
                this.genero = "Macho";
                break;
            case 2:
                this.genero = "Hembra";
                break;
            default:
                System.out.println("Ingrese un número por favor.");
                obtenerInformacionAnimal();
                break;
        }

        System.out.print("Ingrese su habitat: ");
        this.habitat = in.nextLine();
        System.out.print("Ingrese su tipo de alimento: \n1 - Carnívoro \n2 - Herbívoro \n3 - Omnívoro \n4 - 1 y 3 \n");
        sel = Integer.parseInt(in.nextLine());
        switch (sel) {
            case 1:
                this.tipoAlimentacion = "Carnívoro";
                break;
            case 2:
                this.tipoAlimentacion = "Hervíboro";
                break;
            case 3:
                this.tipoAlimentacion = "Omnívoros";
                break;
            case 4:
                this.tipoAlimentacion = "Carnívoro y Omnívoro";
                break;
            default:
                System.out.println("Ingrese correctamente por favor.");
                obtenerInformacionAnimal();
                break;
        }

        System.out.print("Ingrese su altura: ");
        try {
            this.altura = Double.parseDouble(in.nextLine());
            System.out.print("Ingrese su peso: ");
            this.peso = Double.parseDouble(in.nextLine());
            System.out.print("Ingrese su edad: ");
            this.edad = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero correctamente\n");
            crearMascota();
        } catch (NullPointerException e) {
            System.out.println("No ingreso nada... Intentelo de nuevo\n");
            crearMascota();
        }
    }

    public void obtenerInformacionPerro() {
        System.out.print("Ingrese su nombre: ");
        this.nombre = in.nextLine();
        System.out.print("Ingrese su raza: ");
        this.raza = in.nextLine();
        System.out.print("Ingrese su comida favorita: ");
        this.comidaFavorita = in.nextLine();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=====================================");
        System.out.printf(
                "Género: %s \nHabitat: %s \nTipo de Alimentación: %s \nAltura: %f mts \nPeso: %f kgs \nEdad: %d \nNombre: %s \nRaza: %s \nComida Favorita: %s \n",
                this.genero, this.habitat, this.tipoAlimentacion, this.altura, this.peso, this.edad, this.nombre,
                this.raza, this.comidaFavorita);
        System.out.println("=====================================");
    }

    public void ladrar() {
        System.out.println("Wau...");
    }

    public void jugar() {
        System.out.println("Jugando...");
    }

}
