package Upcasting;

public class Manzana extends Fruta {
    private String nombre;
    private String tipo;
    public Manzana(String nombre,String tipo) {
        this.tipo=tipo;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void laFrutaEsta(){
        System.out.println("La "+nombre+", esta rica");
    }

}
