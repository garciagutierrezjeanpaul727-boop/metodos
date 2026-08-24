import javax.swing.*;

public class Ejercicio_Sobrecarga_métodos {
    public static void main (String[] args){
double not1 = Double.parseDouble(JOptionPane.showInputDialog(null," ( metodo 1 ) ingrese la nota 1 "));
        double not2 = Double.parseDouble(JOptionPane.showInputDialog(null,"( metodo 1 ) ingrese la nota 2 "));

         double pro = claprom(not1,not2);
JOptionPane.showMessageDialog(null,"el promedio es " + pro);


int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"( metodo 2 ) ingrese su numero de notas "));

 double[] nots = new double[nota];


   for ( int i = 0 ; i < nota; i++) {

               nots[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota #" + (i + 1)));

               double proms = clap(nots);

        JOptionPane.showMessageDialog(null,"su promedio es " + proms);

   }

    }

public static double claprom(double not1,double not2){

    return  (not1 + not2) / 2;
}


 public static double clap(double[] nots) {
     double sum = 0;
     for (double n : nots) {
         sum += n;
     }
     return sum / nots.length;

 }
}
