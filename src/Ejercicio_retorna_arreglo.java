import javax.swing.*;
import java.util.Arrays;

public class Ejercicio_retorna_arreglo {
public static void main (String[] args) {
    int t = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de la tabla de multiplicar")
    );

    int[] tab = ta(t);

    String resultado = "Tabla del " + t + ":\n";
    for (int i = 0; i < tab.length; i++) {
        resultado += (i + 1) + " x " + t + " = " + tab[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, resultado);
}

    public static int[] ta(int t) {
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = t * (i + 1);
        }
        return tab;
    }
}
