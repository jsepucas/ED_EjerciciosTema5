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

    }
