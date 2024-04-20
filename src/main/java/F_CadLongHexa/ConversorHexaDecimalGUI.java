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
}
