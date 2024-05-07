package Upcasting;

public class Main {
    public static void main(String[] args) {
        Fruta f=(Fruta)new Manzana("manzana","carnosa");
        f.laFrutaEsta();
    }
}
