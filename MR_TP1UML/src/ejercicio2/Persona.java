package ejercicio2;

public abstract class Persona {
    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre,int dni, int edad) {
        this.nombre=nombre;
        this.dni = dni;
        this.edad= edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
