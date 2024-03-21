package ejercicio2;


public class Reserva {
    private String codR;
    private int nroR;
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Reserva(String codR, int nroR,String nombre,int dni,int edad ,int nroPasaje, String asiento) {
        this.codR = codR;
        this.nroR= nroR;
        this.pasajero= new Pasajero(nombre,dni,edad, nroPasaje,asiento);

    }

    public String getCodR() {
        return codR;
    }

    public void setCodR(String codR) {
        this.codR = codR;
    }

    public int getNroR() {
        return nroR;
    }

    public void setNroR(int nroR) {
        this.nroR = nroR;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public String mostrarDatosReserva() {
        return "Reserva para " +pasajero.getNombre() +
                "\nNro reserva: " + nroR +
                "\nNro pasaje: " + pasajero.getNroPasaje() +
                "\nNro asiento: " + pasajero.getAsiento() +
                "\nVuelo: " + vuelo.getCompañia()+
                "\nOrigen: " + vuelo.getOrigen() + ", Destino: "+vuelo.getDestino();

    }
}
