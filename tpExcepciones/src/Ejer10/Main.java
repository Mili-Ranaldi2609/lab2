package Ejer10;

public class Main {
    public static void main(String[] args) {
        try {
            Chofer chofer = new Chofer("ab234");
            System.out.println("Chofer creado con matrícula: " + chofer.getMatricula());

            Auto auto = new Auto("Auto1");
            auto.acelerar(100);
            System.out.println("Auto acelerando a 100 km/h");

            Camion camion = new Camion("Camion1");
            camion.acelerar(130);
            System.out.println("Camión acelerando a 130 km/h");

        } catch (matriculaVencidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (miException e) {
            System.out.println("Error: " + e.getMessage() + " en " + e.getObjetoQueLaProduce());
        }
    }
}
