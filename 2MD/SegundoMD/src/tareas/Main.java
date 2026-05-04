package tareas;

public class Main {

    public static void main(String[] args) {


        Persona persona1 = new Persona();                              
        Persona persona2 = new Persona("María", 25, "Femenino");     
        Persona persona3 = new Persona("Carlos", 17, "Masculino");


        persona1.setNombre("Ana");
        persona1.setEdad(30);
        persona1.setGenero("Femenino");


        System.out.println("=== PERSONA 1 ===");
        persona1.mostrarInfo();
        persona1.saludar();
        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());

        System.out.println("\n=== PERSONA 2 ===");
        persona2.mostrarInfo();
        System.out.println("¿Es mayor de edad? " + persona2.esMayorDeEdad());

        System.out.println("\n=== PERSONA 3 ===");
        persona3.mostrarInfo();
        System.out.println("¿Es mayor de edad? " + persona3.esMayorDeEdad());


        System.out.println("\n=== USANDO GETTERS ===");
        System.out.println("El nombre de persona 2 es: " + persona2.getNombre());
        System.out.println("La edad de persona 3 es: " + persona3.getEdad());
 
    }
}