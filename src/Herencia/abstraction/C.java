package Herencia.abstraction;

public class C extends A implements E {
        public int multiplicavalor (int valor1) {
            return valor1 * 3;
        }

    public int suma(int val1, int val2) {
            return ((val1*2) + val2);
    }

    @Override
    public int multiplica(int val1, int val2) {
        return (val1 * val2);
    }
}
