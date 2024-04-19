package B_ListaNumNaturales;

public class ListaNumNaturales {

    public static void imprimirNumeros(int a, int d) {
        if (a <= d) {
            System.out.print(a + " ");
            imprimirNumeros(a + 1, d);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int d = 15;
        System.out.println("Números naturales entre " + a + " y " + d + ":");
        imprimirNumeros(a, d);
    }
}



