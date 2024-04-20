package F_CadLongHexa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorHexaDecimalGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Conversor de Hexadecimal a Decimal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JTextField inputField = new JTextField(10);
        JButton convertButton = new JButton("Convertir a Decimal");
        JLabel resultLabel = new JLabel("El resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese el número hexadecimal:"));
        panel.add(inputField);
        panel.add(convertButton);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String hex = inputField.getText().toUpperCase();
                    int resultado = hexaADecimal(hex, hex.length());
                    resultLabel.setText("Valor decimal: " + resultado);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese un número hexadecimal válido.");
                }
            }
        });
}
