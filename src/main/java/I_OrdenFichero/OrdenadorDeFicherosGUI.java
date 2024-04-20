package I_OrdenFichero;

import javax.swing.*;

public class OrdenadorDeFicherosGUI {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Ordenador de Ficheros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JButton selectButton = new JButton("Seleccionar Archivo");
        JLabel fileLabel = new JLabel("No se ha seleccionado ningún archivo.");
        JButton orderButton = new JButton("Ordenar y Guardar");
        orderButton.setEnabled(false);
    }
