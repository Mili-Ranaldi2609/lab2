package Dependencia;

public class Sobrecarga {

        void recibeParametros() {
            System.out.println("No recibe parametros");
        }

        // Sobrecarga el método test con un parámetro entero.

        void recibeParametros(int x) {
            System.out.println("Parametro entero : " + x);
        }

        // Sobrecarga el método test con dos parámetros enteros.

        void recibeParametros(int x, int y, int z) {
            System.out.println("Parametros x, y, z: " + x + " _ " + y+" _ "+z);
        }
// Sobrecarga el método test con un parámetro doble.

        double recibeParametros(double x) {
            System.out.println("double de x: " + x);
            return x*x;
        }
    }

