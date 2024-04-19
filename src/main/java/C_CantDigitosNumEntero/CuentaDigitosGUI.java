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


}
