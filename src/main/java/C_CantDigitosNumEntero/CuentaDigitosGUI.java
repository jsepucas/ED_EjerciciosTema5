package C_CantDigitosNumEntero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuentaDigitosGUI {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Contador de Dígitos de un Número Entero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);


        JTextField inputField = new JTextField(10);
        JButton calculateButton = new JButton("Contar Dígitos");
        JLabel resultLabel = new JLabel("El resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese un número:"));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(inputField.getText());
                    int resultado = contarDigitos(numero);
                    resultLabel.setText("El número " + numero + " tiene " + resultado + " dígitos.");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese un número válido.");
                }
            }
        });




    }
