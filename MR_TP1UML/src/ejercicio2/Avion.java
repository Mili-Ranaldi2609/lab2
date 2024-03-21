package ejercicio2;

public class Avion {
    private String nombreA;
    private int cantPasajeros;
    private int capMaletas;
    private Vuelo vuelo;
    private Piloto piloto;

    public Avion(String nombreA, int cantPasajeros, int capMaletas, String compañia, String origen, String destino, String nombreP,int dni,int edad,int nroLegajo,int licencia) {
        this.nombreA=nombreA;
        this.cantPasajeros = cantPasajeros;
        this.capMaletas=capMaletas;
        this.vuelo=new Vuelo(compañia, origen, destino);/*composicion*/
        this.piloto=new Piloto(nombreP,dni,edad,nroLegajo,licencia);/*composicion*/
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

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public String mostrarDatosAVION() {
        return "Datos viaje: "  +
                "\nAvion: " + getNombreA() +
                "\nPiloto: " + piloto.getNombre() +
                "\nCompañia: " + vuelo.getCompañia()+
                "\nOrigen: " + vuelo.getOrigen()+", Destino: "+vuelo.getDestino();
    }}

