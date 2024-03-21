package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Vuelo v1= new Vuelo("Andesmar","Mendoza","Buenos Aires");
        Avion a1= new Avion("ee123uu",45,100,v1);
        Flota flota = new Flota(a1);
        Reserva reserva = new Reserva("WAfy123", 0001);
        reserva.agregarVuelo(v1);
        reserva.mostrarDatos();
        Piloto pilot1= new Piloto(124,"Daniel Medina",44437603,31);
        pilot1.datosPiloto();
        flota.datosAvion();
        System.out.println("-------------------------------------------");
        pilot1.volar();
        pilot1.caminar();


    }
}
