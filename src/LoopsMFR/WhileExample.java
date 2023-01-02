package LoopsMFR;

public class WhileExample {

    public static void main(String[] args) {

        int check;

        check = 5;

        while(check >= 0) {
            System.out.println("Hola" + check);
            check --;
        }

        do {
            System.out.println(" Adios" + check);
            check ++;
        } while (check <= 10);

    }
}
