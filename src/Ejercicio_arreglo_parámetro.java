import javax.swing.*;
public class Ejercicio_arreglo_parámetro {
public static void main(String[] args){
    int nu = Integer.parseInt(JOptionPane.showInputDialog(null,"di la cantidad de notas que quieres ingresar "));
    double[] notas = new double[nu];
    for ( int i = 0 ; i < nu; i++) {
        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota #" + (i + 1)));
    }
    double proms = pro(notas);
    JOptionPane.showMessageDialog(null,"su promedio es " + proms);
}

public static double pro(double[] notas){
    double sum = 0;
    for (double n : notas) {
        sum += n;
    }
    return sum / notas.length;


}












}
