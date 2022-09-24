package br.edu.femass.model.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenu {
    private JButton cadastrarAutorButton;
    private JButton alugarLivroButton;
    private JPanel Menu;
    private JLabel menuDaBibliotecaLabel;

    public GuiMenu() {
        cadastrarAutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        alugarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        GuiMenu guiMenu = new GuiMenu();

        JFrame frame = new JFrame("Menu");
        frame.setContentPane(guiMenu.Menu);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }
}
