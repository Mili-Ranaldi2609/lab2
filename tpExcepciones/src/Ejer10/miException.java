package Ejer10;

public class miException extends Exception{
    private String objetoQueLaProduce;

    public miException(String mensaje, String objetoQueLaProduce) {
        super(mensaje);
        this.objetoQueLaProduce = objetoQueLaProduce;
    }

    public String getObjetoQueLaProduce() {
        return objetoQueLaProduce;
    }

}
