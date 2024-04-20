package J_BuscadorPalabras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static J_BuscadorPalabras.BuscadorDePalabras.buscarPalabraConBinaria;
import static J_BuscadorPalabras.BuscadorDePalabras.prepararArchivoParaBusqueda;

public class BuscadorDePalabrasGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Buscador de Palabras con Búsqueda Binaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JButton selectButton = new JButton("Seleccionar Archivo ");
        JLabel fileLabel = new JLabel("No se ha seleccionado ningún archivo.");
        JLabel tempFileLabel = new JLabel("");
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Buscar Palabra");
        JLabel resultLabel = new JLabel("");

        JPanel panel = new JPanel();
        panel.add(selectButton);
        panel.add(fileLabel);
        panel.add(tempFileLabel);
        panel.add(new JLabel("Palabra a buscar:"));
        panel.add(searchField);
        panel.add(searchButton);
        panel.add(resultLabel);

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileLabel.setText("Original: " + selectedFile.getAbsolutePath());
                    try {
                        File preparedFile = prepararArchivoParaBusqueda(selectedFile.getAbsolutePath());
                        tempFileLabel.setText("Ordenado: " + preparedFile.getAbsolutePath());
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error al preparar el archivo para búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String archivo = tempFileLabel.getText().replace("Ordenado: ", "");
                String palabraBuscada = searchField.getText();
                if (!archivo.isEmpty() && !palabraBuscada.isEmpty()) {
                    try {
                        boolean encontrada = buscarPalabraConBinaria(new File(archivo), palabraBuscada);
                        resultLabel.setText("La palabra '" + palabraBuscada + "' fue " + (encontrada ? "encontrada." : "no encontrada."));
                    } catch (IOException ex) {
                        resultLabel.setText("Error durante la búsqueda.");
                    }
                } else {
                    resultLabel.setText("Seleccione un archivo y escriba una palabra.");
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}