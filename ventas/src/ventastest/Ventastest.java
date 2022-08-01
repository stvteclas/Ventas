package ventastest;
import ventas.Producto;
import ventas.Orden;

public class Ventastest {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        System.out.println("Se han agregado productos");

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }

}
