package J_BuscadorPalabras;

public class BuscadorDePalabrasGUI {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Buscador de Palabras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);


        JButton selectButton = new JButton("Seleccionar Archivo");
        JLabel fileLabel = new JLabel("No se ha seleccionado ningún archivo.");
        JTextField searchField = new JTextField(10);
        JButton searchButton = new JButton("Buscar Palabra");
        JLabel resultLabel = new JLabel("");


        JPanel panel = new JPanel();
        panel.add(selectButton);
        panel.add(fileLabel);
        panel.add(new JLabel("Palabra a buscar:"));
        panel.add(searchField);
        panel.add(searchButton);
        panel.add(resultLabel);


        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileLabel.setText(selectedFile.getAbsolutePath());
                }
            }
        });


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String archivo = fileLabel.getText();
                String palabraBuscada = searchField.getText();
                if (!archivo.equals("No se ha seleccionado ningún archivo.") && !palabraBuscada.isEmpty()) {
                    boolean encontrada = buscarPalabra(archivo, palabraBuscada);
                    resultLabel.setText("La palabra '" + palabraBuscada + "' fue " + (encontrada ? "encontrada." : "no encontrada."));
                } else {
                    resultLabel.setText("Seleccione un archivo y escriba una palabra.");
                }
            }
        });


        frame.getContentPane().add(panel);


        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }
}
