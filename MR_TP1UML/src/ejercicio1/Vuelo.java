package ejercicio1;

public class Vuelo {
    private String compañia;
    private String origen;
    private String destino;



    public Vuelo(String compañia, String origen, String destino) {
        this.compañia = compañia;
        this.origen=origen;
        this.destino=destino;


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


}
