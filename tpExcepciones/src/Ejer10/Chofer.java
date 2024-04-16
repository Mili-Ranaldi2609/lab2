package Ejer10;

public class Chofer {
    private String matricula;

    public Chofer(String matricula) throws matriculaVencidaException {
        if (matriculaEstaVencida(matricula)) {
            throw new matriculaVencidaException("Matrícula vencida para el chofer con matrícula: " + matricula);
        }
        this.matricula = matricula;
    }

    private boolean matriculaEstaVencida(String matricula) {
        return matricula.endsWith("VENCIDA");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
