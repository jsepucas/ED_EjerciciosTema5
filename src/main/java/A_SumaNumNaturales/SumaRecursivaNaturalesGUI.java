package A_SumaNumNaturales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaRecursivaNaturalesGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Suma Recursiva de Números Naturales");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);


        JTextField inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calcular Suma");
        JLabel resultLabel = new JLabel("Resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese el n:"));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    int resultado = SumaRecursivaNaturales.sumaRecursiva(n);
                    resultLabel.setText("Suma de los primeros " + n + " números: " + resultado);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese un número válido.");
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
