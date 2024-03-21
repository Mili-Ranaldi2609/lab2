package ejercicio1;

public class Piloto extends Persona implements Volador {
    private int nroLegajo;

    public Piloto(int nroLegajo,String nombre,int dni,int edad) {
        super(nombre,dni,edad);
        this.nroLegajo = nroLegajo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    public void datosPiloto(){
        System.out.println("Los datos del piloto son: ");
        System.out.println("Nro de Legajo: "+nroLegajo);
        System.out.println("Dni: "+getDni());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
    }
    @Override
    public void volar(){
        System.out.println("Yo vuelo piloteando un avion");
    }

}
