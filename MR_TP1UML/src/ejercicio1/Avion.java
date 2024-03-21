package ejercicio1;

public class Avion {
    private String nombreA;
    private int cantPasajeros;
    private int capMaletas;
    private Vuelo vuelo;
    public Avion() {
    }

    public Avion(String nombreA,int cantPasajeros, int capMaletas, Vuelo v1) {
        this.nombreA=nombreA;
        this.cantPasajeros=cantPasajeros;
        this.capMaletas = capMaletas;
        this.vuelo= v1;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getCapMaletas() {
        return capMaletas;
    }

    public void setCapMaletas(int capMaletas) {
        this.capMaletas = capMaletas;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
