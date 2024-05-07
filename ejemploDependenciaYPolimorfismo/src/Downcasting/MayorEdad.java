package Downcasting;

public class MayorEdad<Persons> extends Persona{
     int edad;

    public void esMayor(int edad){
        if(edad>=18){
            System.out.println("Es un adulto");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
