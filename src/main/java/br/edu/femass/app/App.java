package br.edu.femass.app;

import br.edu.femass.model.gui.GuiMenu;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        GuiMenu guiMenu = new GuiMenu();

        JFrame frame = new JFrame("Menu da Biblioteca");
        frame.setContentPane(guiMenu.getMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
