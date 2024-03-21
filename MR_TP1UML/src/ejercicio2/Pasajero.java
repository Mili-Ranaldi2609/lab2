package ejercicio2;

public class Pasajero extends Persona{
    private int nroPasaje;
    private String asiento;

    public Pasajero(String nombre, int dni, int edad,int nroPasaje, String asiento) {
        super(nombre, dni, edad);
        this.nroPasaje=nroPasaje;
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getNroPasaje() {
        return nroPasaje;
    }

    public void setNroPasaje(int nroPasaje) {
        this.nroPasaje = nroPasaje;
    }

}
