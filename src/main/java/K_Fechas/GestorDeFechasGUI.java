package K_Fechas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GestorDeFechasGUI {

    private static GestorDeFechas gestor = new GestorDeFechas();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        JFrame frame = new JFrame("Gestor de Fechas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JTextField inputField = new JTextField(10);
        JButton addButton = new JButton("Agregar Fecha");
        JTextArea datesArea = new JTextArea(10, 25);
        datesArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(datesArea);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Introduzca fecha (dd/mm/yyyy):"));
        panel.add(inputField);
        panel.add(addButton);
        panel.add(scrollPane);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    gestor.agregarFecha(inputField.getText());
                    inputField.setText("");
                    List<Date> fechasOrdenadas = gestor.obtenerFechasOrdenadas();
                    datesArea.setText("");
                    for (Date fecha : fechasOrdenadas) {
                        datesArea.append(sdf.format(fecha) + "\n");
                    }
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(frame, "Formato de fecha inválido. Use dd/mm/yyyy.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
