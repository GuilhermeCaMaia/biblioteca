package br.edu.femass.model.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenu {
    private JButton cadastrarAutorButton;
    private JButton alugarLivroButton;
    private JPanel Menu;
    private JLabel menuDaBibliotecaLabel;

    public JPanel getMenu() {
        return Menu;
    }

    public GuiMenu() {
        alugarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        cadastrarAutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutror guiAutror = new GuiAutror();
                JDialog jFrame = new JDialog(new Frame(), true);
                //JFrame jFrame = new JFrame("Cadastra Autor");
                jFrame.setContentPane(guiAutror.getCadastroDoAutror());

                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
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
