package L_Optimizaciones;

import java.util.Random;

public class QuicksortOptimizado {

    private static final int UMBRAL = 10;
    private static void quicksort(int[] array, int izq, int der) {
        if (der - izq > UMBRAL) {
            int indicePivote = particionar(array, izq, der);
            quicksort(array, izq, indicePivote);
            quicksort(array, indicePivote + 1, der);
        } else {

            insercionDirecta(array, izq, der);
        }
    }

    private static int particionar(int[] array, int izq, int der) {
        int pivote = seleccionarPivote(array, izq, der);
        int i = izq - 1;
        int j = der + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivote);
            do {
                j--;
            } while (array[j] > pivote);
            if (i >= j) {
                return j;
            }
            intercambiar(array, i, j);
        }
    }

    private static int seleccionarPivote(int[] array, int izq, int der) {
        int medio = izq + (der - izq) / 2;
        int a = array[izq];
        int b = array[medio];
        int c = array[der];
        int mediana = a < b ? (b < c ? medio : (a < c ? der : izq)) : (a < c ? izq : (b < c ? der : medio));
        return array[mediana];
    }

    private static void insercionDirecta(int[] array, int izq, int der) {
        for (int i = izq + 1; i <= der; i++) {
            int tmp = array[i];
            int j;
            for (j = i; j > izq && tmp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }

    private static void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
