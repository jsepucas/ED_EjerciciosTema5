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


}
