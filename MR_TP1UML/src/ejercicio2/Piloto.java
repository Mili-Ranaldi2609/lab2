package ejercicio2;

public class Piloto extends Persona{
    private int nroLegajo;
    private int licencia;

    public Piloto(String nombre, int dni, int edad,int nroLegajo, int licencia) {
        super(nombre, dni, edad);
        this.nroLegajo=nroLegajo;
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }


}
