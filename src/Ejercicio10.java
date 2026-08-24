import java.util.ArrayList;

public class Ejercicio10 {

    public static void AgregarProductos(ArrayList<Producto> productos, Producto producido) {

        productos.add(producido);

    }

    public static double CalcularValorTotal(ArrayList<Producto> productos){
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total = total + (productos.get(i).precio * productos.get(i).cantidad);
        }
        return total;
    }
    public static void MostrarInventario(ArrayList<Producto> productos){
        for (int i = 0; i < productos.size(); i++) {
            producto producto = productos.get(i);
            System.out.println("Nombre "+producto.nombre);
            System.out.println("Precio "+producto.precio);
            System.out.println("Cantidad "+producto.cantidad);
        }
    }
}