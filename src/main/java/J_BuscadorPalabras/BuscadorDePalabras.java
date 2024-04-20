package J_BuscadorPalabras;

import java.io.*;
import java.util.*;

public class BuscadorDePalabras {


    public static File prepararArchivoParaBusqueda(String archivo) throws IOException {
        File archivoOrdenado = new File("ordenado_" + new File(archivo).getName());
        List<String> palabras = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {

                String[] partes = linea.split("\\W+");
                palabras.addAll(Arrays.asList(partes));
            }
        }
        Collections.sort(palabras);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoOrdenado))) {
            for (String palabra : palabras) {
                writer.write(palabra);
                writer.newLine();
            }
        }
        return archivoOrdenado;
    }


    public static boolean buscarPalabraConBinaria(File archivo, String palabraBuscada) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            List<String> palabras = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                palabras.add(linea);
            }
            int resultado = Collections.binarySearch(palabras, palabraBuscada, String.CASE_INSENSITIVE_ORDER);
            return resultado >= 0;
        }
    }
}
