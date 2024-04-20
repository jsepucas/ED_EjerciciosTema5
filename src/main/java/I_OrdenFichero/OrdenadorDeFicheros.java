package I_OrdenFichero;

import java.io.*;
import java.util.*;

public class OrdenadorDeFicheros {


    public static void ordenarFichero(String archivoEntrada, String archivoSalida) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            Collections.sort(lineas);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";
        ordenarFichero(archivoEntrada, archivoSalida);
        System.out.println("Archivo ordenado y guardado como '" + archivoSalida + "'");
    }
}