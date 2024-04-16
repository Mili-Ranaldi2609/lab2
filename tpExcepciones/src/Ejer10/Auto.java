package Ejer10;

public class Auto extends Vehiculo{

    public Auto(String nombre) {
        super(nombre);
    }

    public void acelerar(int velocidad) throws miException {
        if (velocidad > 120) {
            throw new miException(nombre + " intentó acelerar a más de 120km/h", "Auto");
        }
    }
}
