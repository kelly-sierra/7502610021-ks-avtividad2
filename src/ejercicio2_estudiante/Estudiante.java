/**
 * Ejercicio 2: Llamada a Constructores con this()
 *
 * Se define la clase Estudiante con los atributos nombre y edad.
 * El constructor por defecto (sin parámetros) llama al constructor
 * de dos parámetros usando this(...), reutilizando la lógica de
 * inicialización y evitando duplicar código.
 */
public class Estudiante {

    private String nombre;
    private int edad;

    // Constructor por defecto: usa this() para invocar al constructor
    // de dos parámetros con valores predeterminados.
    public Estudiante() {
        this("Sin asignar", 0); // Llama al constructor con dos parámetros
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Muestra los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Estudiante: " + this.nombre + " | Edad: " + this.edad + " años");
    }

    public static void main(String[] args) {
        // Usa el constructor de dos parámetros directamente
        Estudiante e1 = new Estudiante("Kelly Sierra", 21);
        e1.mostrarDetalles();

        // Usa el constructor por defecto, que internamente llama a this(...)
        Estudiante e2 = new Estudiante();
        e2.mostrarDetalles();
    }
}
