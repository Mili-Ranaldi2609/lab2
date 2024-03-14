import java.util.Scanner;
class Persona{
    private String nombre;
    private int dni;
    private int edad;
    private double altura;
    private String comer;
    public Persona(String nombre, int dni, int edad, double altura, String comer){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        this.altura=altura;
        this.comer=comer;
    }
    public String getComer(){
        return this.comer;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }
    public double getAltura(){
        return altura;
    }
}
class Clase{
    private String nombreC;
    private int capacidad;
    private boolean matricular;
    public Clase(String nombreC, int capacidad){
        this.nombreC=nombreC;
        this.capacidad=capacidad;
        this.matricular = false;

    }
    public String getNombreC(){
        return nombreC;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public boolean getMatricular(){
        if(matricular){
            System.out.println("Has sido matriculado con exito");
            return  true;
        }else{
            System.out.println("No has sido matriculado");
            return false;
        }

    }
    public void setMatricular(boolean matricular) {
        this.matricular = matricular;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        Persona persona1= new Persona("Milagros Ranaldi",44437603,21, 1.51, "Alfajor");
        System.out.println("Nombre: "+persona1.getNombre()+", DNI: "+persona1.getDni()+", edad: "+persona1.getEdad()+", altura: "+persona1.getAltura());
        System.out.println("Estas comiendo: "+ persona1.getComer());
        Clase clase1 = new Clase("Laboratorio de Computacion 2", 50);
        System.out.println("El curso se llama: "+clase1.getNombreC()+" y tiene una capacidad de "+ clase1.getCapacidad());
        System.out.println("Quieres ser matriculado al curso?");
        String opcion= scr.next();
        if (opcion.equalsIgnoreCase("si")) {
            clase1.setMatricular(true);
            clase1.getMatricular();
        }else{
            clase1.setMatricular(false);
            clase1.getMatricular();
        }
        }

    }
