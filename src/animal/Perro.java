package animal;

import java.util.Scanner;

import animal.especies.Mamifero;

public class Perro extends Mamifero {
    private String nombre;
    private String raza;
    private String comidaFavorita;

    Scanner in = new Scanner(System.in);

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

    public void crearMascota() {
        System.out.print("Cuantos perros quieres obtener?: ");
        int cantidad = obtenerCantidad();
        Perro[] perros = new Perro[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el sexo del perro: ");
            this.genero = in.nextLine();
            System.out.print("\nIngrese su habitat: ");
            this.habitat = in.nextLine();
            System.out.print("\nIngrese su tipo de alimento: ");
            this.tipoAlimentacion = in.nextLine();

            System.out.print("\nIngrese su altura: ");
            try {
                this.altura = Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero correctamente\n");
                crearMascota();
            } catch (NullPointerException e) {
                System.out.println("No ingreso nada... Intentelo de nuevo\n");
                crearMascota();
            }

            System.out.print("\nIngrese su peso: ");
            try {
                this.peso = Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero correctamente\n");
                crearMascota();
            } catch (NullPointerException e) {
                System.out.println("No ingreso nada... Intentelo de nuevo\n");
                crearMascota();
            }

            System.out.print("Ingrese su edad: ");
            try {
                this.edad = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero correctamente\n");
                crearMascota();
            } catch (NullPointerException e) {
                System.out.println("No ingreso nada... Intentelo de nuevo\n");
                crearMascota();
            }

            System.out.print("\nIngrese su nombre: ");
            this.nombre = in.nextLine();
            System.out.print("\nIngrese su raza: ");
            this.raza = in.nextLine();
            System.out.print("\nIngrese su comida favorita: ");
            this.comidaFavorita = in.nextLine();

            perros[i] = new Perro(this.genero, this.habitat, this.tipoAlimentacion, this.altura, this.peso, this.edad,
                    this.nombre, this.raza, this.comidaFavorita);
        }

        for (Perro p : perros) {
            if (p.equals(null)) {
                continue;
            }
            mostrarInformacion();
        }
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

    public void ladrar() {
        System.out.println("Wau...");
    }

    public void jugar() {
        System.out.println("Jugando...");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=====================================");
        System.out.printf(
                "Género: %s \nHabitat: %s \nTipo de Alimentación: %s \nAltura: %d \nPeso: %d \nEdad: %d \nNombre: %s \nRaza: %s \nComida Favorita: %s \n",
                this.genero, this.habitat, this.tipoAlimentacion, this.altura, this.peso, this.edad, this.nombre,
                this.raza, this.comidaFavorita);
        System.out.println("=====================================");
    }

}
