package B_ListaNumNaturales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaNumNaturalesGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lista de Números Naturales entre dos Valores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JTextField inputFieldA = new JTextField(5);
        JTextField inputFieldD = new JTextField(5);
        JButton showListButton = new JButton("Mostrar Lista");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
    }


    }
