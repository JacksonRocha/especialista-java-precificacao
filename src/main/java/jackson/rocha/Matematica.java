package jackson.rocha;

public class Matematica {

    static double calcularAcrescimo(double valor, double porcentual) {
        return valor + ((valor * porcentual / 100) + 1);
    }
}
