import javax.swing.*;
public class Ejercicio_Static_instancia {
    static class Estudiante {
        double nota;

        public Estudiante(double nota) {
            this.nota = nota;
        }

        public void mostrarBoletin() {
            System.out.println("La nota del estudiante es: " + this.nota);
        }

        public static double compararNotas(double n1, double n2) {
            return Math.max(n1, n2);
        }
    }

    public class Ejercicio6 {
        public static void main(String[] args) {
            Estudiante e1 = new Estudiante(4.2);
            Estudiante e2 = new Estudiante(3.9);

            // Método de instancia: requiere un objeto
            e1.mostrarBoletin();
            e2.mostrarBoletin();

            // Método estático: se llama directamente desde la clase
            double mayor = Estudiante.compararNotas(e1.nota, e2.nota);
            System.out.println("La mayor nota es: " + mayor);
        }
    }

}
