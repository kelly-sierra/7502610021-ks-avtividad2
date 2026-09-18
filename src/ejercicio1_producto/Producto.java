/**
 * Ejercicio 1: Clase Producto con Constructor y Métodos de Acceso
 *
 * Se define la clase Producto con los atributos nombre y precio.
 * El constructor recibe parámetros con el MISMO nombre que los atributos
 * (nombre, precio), por lo que 'this' es necesario para diferenciar
 * el atributo de la clase del parámetro del constructor.
 */
public class Producto {

    private String nombre;
    private double precio;

    // Constructor: this.nombre y this.precio se refieren a los atributos
    // de la clase; nombre y precio (sin this) son los parámetros recibidos.
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método de acceso (getter) para nombre
    public String getNombre() {
        return this.nombre;
    }

    // Método de acceso (getter) para precio
    public double getPrecio() {
        return this.precio;
    }

    // Método para modificar el precio (setter), también usa this
    // porque el parámetro se llama igual que el atributo
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Muestra los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + " | Precio: $" + this.precio);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado mecánico", 150000);
        Producto p2 = new Producto("Mouse inalámbrico", 60000);

        p1.mostrarProducto();
        p2.mostrarProducto();

        // Aplicamos un descuento usando el setter
        p2.setPrecio(45000);
        System.out.println("Precio de " + p2.getNombre() + " actualizado:");
        p2.mostrarProducto();
    }
}