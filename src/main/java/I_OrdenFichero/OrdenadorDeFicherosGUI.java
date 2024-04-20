package I_OrdenFichero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static I_OrdenFichero.OrdenadorDeFicheros.ordenarFichero;

public class OrdenadorDeFicherosGUI {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Ordenador de Ficheros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JButton selectButton = new JButton("Seleccionar Archivo");
        JLabel fileLabel = new JLabel("No se ha seleccionado ningún archivo.");
        JButton orderButton = new JButton("Ordenar y Guardar");
        orderButton.setEnabled(false);

        JPanel panel = new JPanel();
        panel.add(selectButton);
        panel.add(fileLabel);
        panel.add(orderButton);

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileLabel.setText(selectedFile.getName());
                    orderButton.setEnabled(true);
                }
            }
        });

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Guardar archivo ordenado como...");
                int userSelection = fileChooser.showSaveDialog(frame);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File archivoParaGuardar = fileChooser.getSelectedFile();
                    ordenarFichero(fileLabel.getText(), archivoParaGuardar.getAbsolutePath());
                    JOptionPane.showMessageDialog(frame, "Archivo ordenado y guardado con éxito.");
                }
            }
        });


        frame.getContentPane().add(panel);


        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }

    }
