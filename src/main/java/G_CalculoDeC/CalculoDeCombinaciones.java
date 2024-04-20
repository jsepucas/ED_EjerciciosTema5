package G_CalculoDeC;

public class CalculoDeCombinaciones {

    public static int calcularC(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return calcularC(n - 1, k) + calcularC(n - 1, k - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println("C(" + n + ", " + k + ") es: " + calcularC(n, k));
    }

}
