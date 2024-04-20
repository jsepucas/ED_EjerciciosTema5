package H_CadenasDeADN;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ContadorDeGenesGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Contador de Genes en ADN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JTextField inputField = new JTextField(5);
        JButton generateButton = new JButton("Generar y Contar Genes");
        JTextArea resultArea = new JTextArea(5, 40);
        resultArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese longitud de la cadena de ADN:"));
        panel.add(inputField);
        panel.add(generateButton);
        panel.add(new JScrollPane(resultArea));
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int longitud = Integer.parseInt(inputField.getText());
                    String cadenaADN = generarCadenaADN(longitud);
                    int numGenes = contarGenes(cadenaADN);
                    resultArea.setText("Cadena de ADN: " + cadenaADN + "\nNúmero de genes (tripletas ATG): " + numGenes);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Por favor, ingrese un número válido.");
                }
            }
        });




    }
