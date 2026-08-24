
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Ejercicio_Lógica_condicional {
public static void main(String[] args) {

   String n = JOptionPane.showInputDialog(null," porfabor ingrese su nota ");
    String res = clas(Double.parseDouble(n));
    JOptionPane.showMessageDialog(null,"tu estas " + res );
}
public static String clas(double n) {
    String res;
    

    if (n < 3.0) {
        res = "Reprobado";
    } else if (n >= 3.0 && n < 4.5) {
        res = "Aprobado";
    } else if (n >= 4.5 && n <= 5.0) {
        res = "Excelente";
    } else {
        res = "Nota inválida";
    }

    return res;
}
}