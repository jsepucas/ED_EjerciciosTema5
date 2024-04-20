package D_FunCalculoXY;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculoPotenciaGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cálculo de Potencia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JTextField inputFieldX = new JTextField(5);
        JTextField inputFieldY = new JTextField(5);
        JButton calculateButton = new JButton("Calcular Potencia");
        JLabel resultLabel = new JLabel("El resultado aparecerá aquí");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese base (x):"));
        panel.add(inputFieldX);
        panel.add(new JLabel("Ingrese exponente (y):"));
        panel.add(inputFieldY);
        panel.add(calculateButton);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int x = Integer.parseInt(inputFieldX.getText());
                    int y = Integer.parseInt(inputFieldY.getText());
                    int resultado = calcularPotencia(x, y);
                    resultLabel.setText(x + " elevado a " + y + " es " + resultado);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, ingrese números enteros válidos.");
                }
            }
        });



    }
