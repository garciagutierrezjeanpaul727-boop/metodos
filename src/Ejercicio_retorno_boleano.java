import javax.swing.*;
public class Ejercicio_retorno_boleano {
public static void main (String[] args){

    String input = JOptionPane.showInputDialog("ingresa un número:");
    int nu = Integer.parseInt(input);


    boolean resultado = re(nu);

    if (resultado) {
        JOptionPane.showMessageDialog(null, "el número " + nu + " es par");
    } else {
        JOptionPane.showMessageDialog(null, "el número " + nu + " es impar");
    }

}

public static boolean re(int nu){
    return nu % 2 == 0;

}
}
