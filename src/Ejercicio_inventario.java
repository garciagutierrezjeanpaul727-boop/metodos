import javax.swing.*;
import java.util.ArrayList;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String n, double p, int c) {
        nombre = n;
        precio = p;
        cantidad = c;
    }
}

public class Ejercicio_inventario {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public static void mostrarInventario(ArrayList<Producto> lista) {
        String texto = "=== Inventario ===\n";
        for (Producto p : lista) {
            texto += "Producto: " + p.nombre +
                    " | Precio: $" + p.precio +
                    " | Cantidad: " + p.cantidad + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public static double calcularValorTotal(ArrayList<Producto> lista) {
        double total = 0;
        for (Producto p : lista) {
            total = total + (p.precio * p.cantidad);
        }
        return total;
    }

    public static void main(String[] args) {
        Ejercicio_inventario inv = new Ejercicio_inventario();

        // Pedir cuántos productos
        int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos quiere ingresar?"));

        for (int i = 0; i < num; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del producto " + (i+1));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto " + (i+1)));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto " + (i+1)));

            Producto p = new Producto(nombre, precio, cantidad);
            inv.agregarProducto(p);
        }
        mostrarInventario(inv.productos);

        double total = calcularValorTotal(inv.productos);
        JOptionPane.showMessageDialog(null, "Valor total del inventario: $" + total);
    }
}

