package B_ListaNumNaturales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaNumNaturalesGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lista de Números Naturales entre dos Valores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JTextField inputFieldA = new JTextField(5);
        JTextField inputFieldD = new JTextField(5);
        JButton showListButton = new JButton("Mostrar Lista");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese valor inicial (a):"));
        panel.add(inputFieldA);
        panel.add(new JLabel("Ingrese valor final (d):"));
        panel.add(inputFieldD);
        panel.add(showListButton);
        panel.add(new JScrollPane(resultArea));

        showListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(inputFieldA.getText());
                    int d = Integer.parseInt(inputFieldD.getText());
                    resultArea.setText("Números entre " + a + " y " + d + ":\n");
                    printNumbersRecursively(a, d, resultArea);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Por favor, ingrese números válidos.");
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static void printNumbersRecursively(int a, int d, JTextArea resultArea) {
        if (a <= d) {
            resultArea.append(a + " ");
            printNumbersRecursively(a + 1, d, resultArea);
        }
    }
    }



