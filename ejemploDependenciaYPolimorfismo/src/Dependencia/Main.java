package Dependencia;

public class Main {
        public static void main(String[] args) {
            //Dependencia sobrecarga
            System.out.println("Dependencia sobrecarga: ");

            Sobrecarga sob = new Sobrecarga();
            double res;

            // Llama a todas las versiones del metodo.

            sob.recibeParametros();
            sob.recibeParametros(10);
            sob.recibeParametros(9, 6,15);
            res = sob.recibeParametros(120.45);
            System.out.println("Resultado con parametro double sob.recibeParametros(120.45): " + res);
            //Dependencia coercion
            System.out.println("Dependencia coercion: ");
            int a,b,c;
            a=3;
            b=5;
            c=9;

            Coercion co= new Coercion();

            System.out.println("La operacion " +a+" "+b+" "+c+" es "+co.operar(a,b,c));
        }
}





