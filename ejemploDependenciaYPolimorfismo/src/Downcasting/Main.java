package Downcasting;

public class Main {
    public static void main(String[] args) {
        Persona p1= new MayorEdad();
        p1.nombre="Manuel";
        //downcasting implicito
        //MayorEdad m=new Persona();//larga error
        //downcasting explicito
        MayorEdad m=(MayorEdad)p1;
        m.edad=18;
        System.out.println(m.nombre);
        System.out.println(m.edad);
        m.esMayor(m.edad);
    }

    }
