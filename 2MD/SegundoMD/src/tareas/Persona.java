package tareas;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.genero = "No especificado";
    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = "No especificado";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
        else System.out.println("La edad no puede ser negativa");
    }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Género: " + genero);
    }

    public boolean esMayorDeEdad() { return edad >= 18; }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + "!");
    }

    public void presentarse() {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}