package ejer12;

public class Main extends Exception{
    public static void main(String[] args) {
        try {
            metodoUno();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main: " + e.getMessage());
        }
    }

    public static void metodoUno() {
        System.out.println("Inicio del método uno");
        metodoDos();
        System.out.println("Fin del método uno");
    }

    public static void metodoDos() {
        System.out.println("Inicio del método dos");
        metodoTres();
        System.out.println("Fin del método dos");
    }

    public static void metodoTres() {
        System.out.println("Inicio del método tres");
        metodoCuatro();
        System.out.println("Fin del método tres");
    }

    public static void metodoCuatro() {
        System.out.println("Inicio del método cuatro - lanzando excepción");
        throw new RuntimeException("Excepción lanzada desde el método cuatro");
    }//el método metodoCuatro lanza una excepción RuntimeException. Esta excepción
    // se propaga hacia arriba a través de la pila de llamadas
    // de métodos metodoTres, metodoDos y metodoUno
}
