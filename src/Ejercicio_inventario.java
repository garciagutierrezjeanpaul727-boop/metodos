import javax.swing.*;
import java.util.ArrayList;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

public class Ejercicio_inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {
        double total = 0;
        for (Producto p : productos) {
            total += p.precio * p.cantidad;
        }
        return total;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {
        String resultado = "=== Inventario ===\n";
        for (Producto p : productos) {
            resultado += "Producto: " + p.nombre +
                    " | Precio: $" + p.precio +
                    " | Cantidad: " + p.cantidad + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        Ejercicio_inventario inv = new Ejercicio_inventario();

        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea ingresar?"));

        for (int i = 0; i < cantidadProductos; i++) {

            String nombre = JOptionPane.showInputDialog("Nombre del producto " + (i + 1));

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto " + (i + 1)));

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto " + (i + 1)));

            inv.agregarProducto(new Producto(nombre, precio, cantidad));

        }

        mostrarInventario(inv.productos);

        double total = calcularValorTotalInventario(inv.productos);
        JOptionPane.showMessageDialog(null, "Valor total del inventario: $" + total);
    }
}

