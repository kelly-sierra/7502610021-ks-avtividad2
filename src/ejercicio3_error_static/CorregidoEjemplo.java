/**
 * Ejercicio 3 (Parte 2): Corrección del error de uso de 'this' en static
 *
 * Hay dos formas válidas de corregir el ejemplo anterior:
 *   Opción A: quitar 'static' del método, para que pertenezca a una
 *             instancia y 'this' sí sea válido.
 *   Opción B: si el método debe seguir siendo static, eliminar el uso
 *             de 'this' y trabajar solo con parámetros o datos static.
 *
 * Aquí se muestran ambas opciones.
 */
public class CorregidoEjemplo {

    private String nombre;

    public CorregidoEjemplo(String nombre) {
        this.nombre = nombre;
    }

    // OPCIÓN A: método de instancia (no static), 'this' es válido aquí
    public void mostrarNombreInstancia() {
        System.out.println("Instancia -> Nombre: " + this.nombre);
    }

    // OPCIÓN B: método static que NO usa this, recibe el dato por parámetro
    public static void mostrarNombreStatic(String nombre) {
        System.out.println("Static -> Nombre: " + nombre);
    }

    public static void main(String[] args) {
        // Opción A: se necesita una instancia para usar this
        CorregidoEjemplo persona = new CorregidoEjemplo("Kelly Sierra");
        persona.mostrarNombreInstancia();

        // Opción B: se usa sin crear una instancia, pasando el dato directamente
        CorregidoEjemplo.mostrarNombreStatic("Kelly Sierra");
    }
}