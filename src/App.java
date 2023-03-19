import animal.Perro;

public class App {
    public static void main(String[] args) throws Exception {

        Perro perro = new Perro();
        Perro[] perros = perro.crearMascota();
        for (Perro p : perros) {
            if (p.equals(null)) {
                continue;
            }
            p.mostrarInformacion();
            p.ladrar();
        }
    }
}
