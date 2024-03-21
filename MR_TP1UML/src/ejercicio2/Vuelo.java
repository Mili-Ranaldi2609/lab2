package ejercicio2;

public class Vuelo {
    private String compañia;
    private String origen;
    private String destino;
    private Avion avion;

    public Vuelo(String compañia, String origen, String destino) {
        this.compañia=compañia;
        this.destino=destino;
        this.origen=origen;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
