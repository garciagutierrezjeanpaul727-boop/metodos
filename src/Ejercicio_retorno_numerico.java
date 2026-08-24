import javax.swing.*;
public class Ejercicio_retorno_numerico {
public static void main (String[] args){

double bas = Double.parseDouble(JOptionPane.showInputDialog(null," ingrese la base "));

    double alt = Double.parseDouble(JOptionPane.showInputDialog(null," ingrese la altura  "));
   ret( bas, alt);
}

public static double ret(double bas,double alt) {

    double re = bas * alt;

    JOptionPane.showMessageDialog(null, "el area es " + re);

    return re;
}
}
