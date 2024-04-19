package B_ListaNumNaturales;

public class ListaNumNaturales {


    public static void imprimirNumeros(int a, int d) {
        if (a <= d) {
            System.out.print(a + " ");
            imprimirNumeros(a + 1, d); // Llamada recursiva con incremento de 'a'
        }
    }


}
