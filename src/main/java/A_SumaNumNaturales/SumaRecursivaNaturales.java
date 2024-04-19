package A_SumaNumNaturales;

public class SumaRecursivaNaturales {

    public static int sumaRecursiva(int n) {
        if (n <= 0) {
            return 0; // Caso base: si n es 0 o negativo, la suma es 0
        } else {
            return n + sumaRecursiva(n - 1); // Paso recursivo
        }
    }


}
