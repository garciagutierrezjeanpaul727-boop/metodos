import javax.swing.*;

public class Ejercicio_con_parametros {
        public static void main(String[] args) {

            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
            salu(nombre, edad);
        }


        public static void salu(String nombre, int edad) {
            JOptionPane.showMessageDialog(null,
                    "Hola " + nombre + ", bienvenido al instituto.\n" +
                            "Tienes " + edad + " años, ¡qué bueno que estés estudiando programación!");
        }
    }

