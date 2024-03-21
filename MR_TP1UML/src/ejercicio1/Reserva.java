package ejercicio1;

public class Reserva {
    private String codR;
    private int nroR;
    private Vuelo vuelo;/*asociacion por agregacion*/

    public Reserva(String codR, int nroR) {
        this.codR= codR;
        this.nroR= nroR;

    }

    public String getCodR() {
        return codR;
    }

    public void setCodR(String codR) {
        this.codR = codR;
    }

    public void setNroR(int nroR) {
        this.nroR = nroR;
    }

    public int getNroR() {
        return nroR;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void agregarVuelo(Vuelo vuelo){
        this.vuelo=vuelo;

    };/*asociacion por agregacion*/
    public void mostrarDatos(){
        System.out.println("Datos de reserva de vuelo: ");
        System.out.println("Cod Reserva: "+codR);
        System.out.println("Nro Reserva: "+nroR);
        System.out.println("Compañia: "+vuelo.getCompañia());
        System.out.println("Origen: "+vuelo.getOrigen());
        System.out.println("Destino: "+vuelo.getDestino());



    }

}
