package J_BuscadorPalabras;

import java.io.*;

public class BuscadorDePalabras {


    public static boolean buscarPalabra(String archivo, String palabraBuscada) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {

                String[] palabras = linea.split("\\W+");
                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        String archivo = "ejemplo.txt";
        String palabraBuscada = "ejemplo";
        boolean encontrada = buscarPalabra(archivo, palabraBuscada);
        System.out.println("La palabra '" + palabraBuscada + "' fue " + (encontrada ? "encontrada." : "no encontrada."));
    }
}