package tareas;

public class Docente extends Persona {
    private String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    public void dictarClase() {
        System.out.println("El profesor " + getNombre() + " está dictando la clase de " + materia + ".");
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy docente y dicto la materia: " + materia);
    }

    @Override
    public String toString() {
        return "Docente{ nombre='" + getNombre() + "', edad=" + getEdad() + ", materia='" + materia + "' }";
    }
}