package EjerciciosWhileManuelFdez;

public class Ejercicio1 {

    /*
        1 - Incrementar una variable entera de valor 1 mientas sea menor o igual a 100, mostrando el valor actual de esta en cada iteración.
     */
    static int variable1 = 1;

    public static void main (String[] args) {

        while (variable1 <= 100) {
            System.out.println("Valor de la variable en la iteraccion: " + variable1 + " Es: " + variable1);
            variable1 ++;
        }

    }
}
