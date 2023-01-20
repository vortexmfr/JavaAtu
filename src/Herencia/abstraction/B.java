package Herencia.abstraction;

public class B extends A implements D, E {
        public int multiplicavalor (int valor1) {
            return valor1 * 2;
        }

    //IClase de tipo interface
    @Override
    public int suma(int val1, int val2) {
        return (val1 + val2);
    }

    @Override
    public int multiplica(int val1, int val2) {
        return (val1*val2);
    }
}
