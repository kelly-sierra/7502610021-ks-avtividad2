/**
 * Ejercicio 3 (Parte 1): Intento de usar 'this' en un método static
 *
 * IMPORTANTE: este archivo NO compila a propósito, para evidenciar el
 * error. Está dejado tal cual para la sustentación en video: se muestra
 * el error del compilador y luego se explica la corrección en el
 * archivo CorregidoEjemplo.java.
 *
 * Error esperado del compilador (javac):
 *   error: non-static variable this cannot be referenced from a static context
 */
public class ErrorStaticEjemplo {

    private String nombre;

    // ERROR: 'this' no puede usarse dentro de un método static,
    // porque 'this' representa una instancia concreta del objeto,
    // y un método static no está asociado a ninguna instancia.
    public static void mostrarNombre() {
        System.out.println(this.nombre); // <-- Línea que genera el error
    }

    public static void main(String[] args) {
        ErrorStaticEjemplo.mostrarNombre();
    }
}