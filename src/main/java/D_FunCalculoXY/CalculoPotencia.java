package D_FunCalculoXY;

public class CalculoPotencia {


    public static int calcularPotencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y < 0) {
            return 1 / calcularPotencia(x, -y);
        } else {
            return x * calcularPotencia(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x + " elevado a " + y + " es " + calcularPotencia(x, y));
    }
}

