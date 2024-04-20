package G_CalculoDeC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static G_CalculoDeC.CalculoDeCombinaciones.calcularC;

public class CalculoDeCombinacionesGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cálculo de Combinaciones C(n, k)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JTextField inputFieldN = new JTextField(5);
        JTextField inputFieldK = new JTextField(5);
        JButton calculateButton = new JButton("Calcular C(n, k)");
        JLabel resultLabel = new JLabel("El resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese n:"));
        panel.add(inputFieldN);
        panel.add(new JLabel("Ingrese k:"));
        panel.add(inputFieldK);
        panel.add(calculateButton);
        panel.add(resultLabel);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputFieldN.getText());
                    int k = Integer.parseInt(inputFieldK.getText());
                    int resultado = calcularC(n, k);
                    resultLabel.setText("C(" + n + ", " + k + ") es: " + resultado);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese valores enteros válidos.");
                }
            }
        });


        frame.getContentPane().add(panel);


        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }
    }

