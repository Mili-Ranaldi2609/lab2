package Polimorfismo.Parametrico;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros=new ArrayList<>();
        ArrayList<Integer> numeros=new ArrayList<>();
        Libro l1=new Libro("100 años de soledad");
        Libro l2=new Libro("El codigo Da Vinci");
        libros.add(l1);
        libros.add(l2);
        numeros.add(23);
        for(Libro l: libros){
            System.out.println("Libro del arraylist: "+l.getNombre());
        }
        for(int i:numeros){
            System.out.println("Numero del arraylist: "+i);
        }
    }

}
