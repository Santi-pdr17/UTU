package tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionInstituto {

    private static List<Estudiante> listaEstudiantes = new ArrayList<>();
    private static List<Docente>    listaDocentes    = new ArrayList<>();
    private static Scanner          scanner          = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        // Bucle while
        while (opcion != 5) {

            mostrarMenu();
            opcion = leerEntero("Ingrese una opcion: ");

            switch (opcion) {
                case 1:  agregarAlumno();       pausa(); break;
                case 2:  agregarDocente();      pausa(); break;
                case 3:  mostrarDocentes();     pausa(); break;
                case 4:  mostrarAlumnosTabla(); pausa(); break;
                case 5:  System.out.println("\nSaliendo..."); break;
                default: System.out.println("\n[!] Opcion invalida. Ingrese un numero del 1 al 5."); pausa(); break;
            }
        }

        scanner.close();
    }

    // ───AGREGAR ALUMNO ────────────────────────────────────────────

    private static void agregarAlumno() {
        System.out.println("\n=== AGREGAR ALUMNO ===");

        System.out.print("  Nombre   : ");
        String nombre = scanner.nextLine().trim();

        System.out.print("  Edad     : ");
        int edad = leerEntero("");

        System.out.print("  Carrera  : ");
        String carrera = scanner.nextLine().trim();

        System.out.print("  Matricula: ");
        int matricula = leerEntero("");


        Estudiante alumno = new Estudiante(nombre, edad, "No especificado", carrera, matricula);
        listaEstudiantes.add(alumno);

        System.out.println("[OK] Alumno '" + nombre + "' agregado correctamente.");
    }

    // ───AGREGAR DOCENTE ─────────────────────────────────────────
    private static void agregarDocente() {
        System.out.println("\n=== AGREGAR DOCENTE ===");

        System.out.print("  Nombre  : ");
        String nombre = scanner.nextLine().trim();

        System.out.print("  Edad    : ");
        int edad = leerEntero("");

        System.out.print("  Materia : ");
        String materia = scanner.nextLine().trim();


        Docente docente = new Docente(nombre, edad, materia);
        listaDocentes.add(docente);

        System.out.println("[OK] Docente '" + nombre + "' agregado correctamente.");
    }

    // ───MOSTRAR DOCENTES ────────────────────────────────────────
    private static void mostrarDocentes() {
        System.out.println("\n=== LISTA DE DOCENTES ===");

        if (listaDocentes.isEmpty()) {
            System.out.println("  No hay docentes registrados.");
        } else {
            int i = 1;
            for (Docente d : listaDocentes) {
                System.out.println("  " + i + ". " + d.toString());
                i++;
            }
        }
    }

    // ───MOSTRAR ALUMNOS (TABLA) ───────────────────────────────────
    private static void mostrarAlumnosTabla() {
        System.out.println("\n=== TABLA DE ALUMNOS REGISTRADOS ===");

        if (listaEstudiantes.isEmpty()) {
            System.out.println("  No hay alumnos registrados.");
        } else {
            String sep = "+----------------------+-------+----------------------+----------+";
            String enc = "| " + String.format("%-20s", "NOMBRE")
                       + "| " + String.format("%-5s",  "EDAD")
                       + "| " + String.format("%-20s", "CARRERA")
                       + "| " + String.format("%-8s",  "MATRICUL") + "|";

            System.out.println(sep);
            System.out.println(enc);
            System.out.println(sep);

            for (Estudiante e : listaEstudiantes) {
                System.out.println(e.toString());
            }

            System.out.println(sep);
            System.out.println("  Total de alumnos: " + listaEstudiantes.size());
        }
    }

    // ─── Auxiliares ─────────────────────────────────────────────────
    private static void mostrarMenu() {
        System.out.println("\n========================================");
        System.out.println("         GESTION DEL INSTITUTO          ");
        System.out.println("========================================");
        System.out.println("  1. Agregar Alumno");
        System.out.println("  2. Agregar Docente");
        System.out.println("  3. Mostrar Docentes");
        System.out.println("  4. Mostrar Alumnos (Tabla)");
        System.out.println("  5. Salir");
        System.out.println("========================================");
    }


    private static void pausa() {
        System.out.println("\n(Volviendo al menu en 2 segundos...)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int leerEntero(String mensaje) {
        if (!mensaje.isEmpty()) System.out.print(mensaje);
        try {
            String linea = scanner.nextLine().trim();
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}