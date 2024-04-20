package E_ValorMaxVector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValorMaximoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Valor Máximo en un Vector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JTextField inputField = new JTextField(20);
        JButton findMaxButton = new JButton("Encontrar Máximo");
        JLabel resultLabel = new JLabel("El resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese los números del vector separados por comas:"));
        panel.add(inputField);
        panel.add(findMaxButton);
        panel.add(resultLabel);

        findMaxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] parts = inputField.getText().split(",");
                    int[] vector = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        vector[i] = Integer.parseInt(parts[i].trim());
                    }
                    int maximo = encontrarMaximo(vector, 0, Integer.MIN_VALUE);
                    resultLabel.setText("El valor máximo en el vector es: " + maximo);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese números válidos separados por comas.");
                }
            }
        });

        frame.getContentPane().add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }


    private static int encontrarMaximo(int[] vector, int indice, int maximo) {
        if (indice == vector.length) {
            return maximo;
        } else {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
            return encontrarMaximo(vector, indice + 1, maximo);
        }
    }
}
