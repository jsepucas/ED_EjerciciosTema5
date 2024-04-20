package E_ValorMaxVector;

public class ValorMaximoVector {

    public static int encontrarMaximo(int[] vector, int indice, int maximo) {
        if (indice == vector.length) {
            return maximo;
        } else {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
            return encontrarMaximo(vector, indice + 1, maximo);
        }
    }

    public static void main(String[] args) {
        int[] vector = {3, 5, 1, 2, 9, 8};
        int maximo = encontrarMaximo(vector, 0, Integer.MIN_VALUE);
        System.out.println("El valor máximo en el vector es: " + maximo);
    }
}

