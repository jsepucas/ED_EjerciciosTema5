import A_SumaNumNaturales.SumaRecursivaNaturalesGUI;
import B_ListaNumNaturales.ListaNumNaturalesGUI;
import C_CantDigitosNumEntero.CuentaDigitosGUI;
import D_FunCalculoXY.CalculoPotenciaGUI;
import E_ValorMaxVector.ValorMaximoGUI;
import F_CadLongHexa.ConversorHexaDecimalGUI;
import G_CalculoDeC.CalculoDeCombinacionesGUI;
import H_CadenasDeADN.ContadorDeGenesGUI;
import I_OrdenFichero.OrdenadorDeFicherosGUI;
import J_BuscadorPalabras.BuscadorDePalabrasGUI;
import K_Fechas.GestorDeFechasGUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicación de ejercicios de la UAX \uD83D\uDE03");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout(150, 140));
        mainPanel.setPreferredSize(new Dimension(1000, 800));

        // Declarar e inicializar topPanel, bottomPanel y decoracion
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new GridLayout(5, 5, 20, 20)); // 2 filas, 5 columnas
        //centrar botones
        bottomPanel.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        bottomPanel.setAlignmentY(Component.RIGHT_ALIGNMENT);



        JLabel decoracion = new JLabel(new ImageIcon("src/main/resources/logo2.png"));
        topPanel.add(decoracion, BorderLayout.NORTH);


        mainPanel.setBackground(new Color(0,69,124,255));
        topPanel.setBackground(new Color(0,69,124,255));
        bottomPanel.setBackground(new Color(0,69,124,255));




        JButton sumaButton = new JButton("Suma de Números Naturales  ➕ ");
        JButton listaButton = new JButton("Lista de Números Naturales  \uD83D\uDCC3 ");
        JButton digitosButton = new JButton("Contador de Dígitos  0\uFE0F⃣    1\uFE0F⃣    2\uFE0F⃣    3\uFE0F⃣");
        JButton ValorMaxButton = new JButton("Valor Máximo de un vector  ⬆\uFE0F "); //e
        JButton potenciaButton = new JButton("Cálculo de Potencia \uD83D\uDD8A\uFE0F ");
        JButton ConversorButton = new JButton("Conversor de Bases  \uD83D\uDCDC ");
        JButton CalculoCombinacionesButton = new JButton("Cálculo de Combinaciones \uD83D\uDCC4");
        JButton genesButton = new JButton("Contador de Genes \uD83D\uDC9A");
        JButton ordenarButton = new JButton("Ordenador de Ficheros \uD83D\uDCC3");
        JButton palabrasButton = new JButton("Buscador de Palabras \uD83D\uDD0E");
        JButton fechaButton = new JButton("Gestor de Fechas \uD83D\uDCC6");

        sumaButton.addActionListener(e -> SumaRecursivaNaturalesGUI.main(new String[]{}));
        listaButton.addActionListener(e -> ListaNumNaturalesGUI.main(new String[]{}));
        digitosButton.addActionListener(e -> CuentaDigitosGUI.main(new String[]{}));
        ValorMaxButton.addActionListener(e -> ValorMaximoGUI.main(new String[]{}));
        potenciaButton.addActionListener(e -> CalculoPotenciaGUI.main(new String[]{}));
        ConversorButton.addActionListener(e -> ConversorHexaDecimalGUI.main(new String[]{}));
        CalculoCombinacionesButton.addActionListener(e -> CalculoDeCombinacionesGUI.main(new String[]{}));
        genesButton.addActionListener(e -> ContadorDeGenesGUI.main(new String[]{}));
        ordenarButton.addActionListener(e -> OrdenadorDeFicherosGUI.main(new String[]{}));
        palabrasButton.addActionListener(e -> BuscadorDePalabrasGUI.main(new String[]{}));
        fechaButton.addActionListener(e -> GestorDeFechasGUI.main(new String[]{}));


        bottomPanel.add(sumaButton);
        bottomPanel.add(listaButton);
        bottomPanel.add(digitosButton);
        bottomPanel.add(potenciaButton);
        bottomPanel.add(ValorMaxButton);
        bottomPanel.add(ConversorButton);
        bottomPanel.add(CalculoCombinacionesButton);
         bottomPanel.add(genesButton);
        bottomPanel.add(ordenarButton);
        bottomPanel.add(palabrasButton);
        bottomPanel.add(fechaButton);
        //fondo de botones

        sumaButton.setBackground(new Color(192, 192, 192));
        listaButton.setBackground(new Color(192, 192, 192));
        digitosButton.setBackground(new Color(192, 192, 192));
        ValorMaxButton.setBackground(new Color(192, 192, 192));
        potenciaButton.setBackground(new Color(192, 192, 192));
        ConversorButton.setBackground(new Color(192, 192, 192));
        CalculoCombinacionesButton.setBackground(new Color(192, 192, 192));
        genesButton.setBackground(new Color(192, 192, 192));
        ordenarButton.setBackground(new Color(192, 192, 192));
        palabrasButton.setBackground(new Color(192, 192, 192));
        fechaButton.setBackground(new Color(192, 192, 192));
        //posicion de botones



        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER );

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }
}
