package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Avion avion = new Avion("B01O", 45, 100,"Andesmar","Mendoza","Bs As","Jose Lopez",44437603,34,12345,123456789);
        // Crear una reserva con el pasajero y el vuelo
        Reserva reserva = new Reserva("12ajj", 12765, "Ana Gonzalez",31747179,25,12,"a01");
        reserva.setVuelo(new Vuelo("Andesmar", "Mendoza", "Bs As"));
        System.out.println( reserva.mostrarDatosReserva());
        System.out.println(avion.mostrarDatosAVION());
    }

}
