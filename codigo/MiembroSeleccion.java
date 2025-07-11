public class MiembroSeleccion {

    // Atributos comunes
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    // Constructor
    public MiembroSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos comunes
    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " está concentrándose.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando.");
    }
}

