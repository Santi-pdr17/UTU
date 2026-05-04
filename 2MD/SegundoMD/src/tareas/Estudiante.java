package tareas;

public class Estudiante extends Persona {
    private String carrera;
    private int matricula;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad, "No especificado");
        this.carrera = carrera;
        this.matricula = 0;
    }

    public Estudiante(String nombre, int edad, String genero, String carrera, int matricula) {
        super(nombre, edad, genero);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public void estudiar() {
        System.out.println(getNombre() + " está estudiando " + carrera + ".");
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Soy estudiante de " + carrera);
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Estudio " + carrera + " y mi matrícula es: " + matricula);
    }

    @Override
    public String toString() {
        return "| " + String.format("%-20s", getNombre())
             + "| " + String.format("%-5s", getEdad())
             + "| " + String.format("%-20s", carrera)
             + "| " + String.format("%-8s", matricula) + "|";
    }
}