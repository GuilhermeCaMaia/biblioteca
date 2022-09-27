package br.edu.femass.model.gui;

import javax.swing.*;

public class GuiAutror {
    private JTextField textNome;
    private JTextField textSobrenome;
    private JTextField textNacionalidade;
    private JLabel nomeDoAutorLabel;
    private JLabel Nacionalidade;
    private JButton proximoButton;
    private JPanel CadastroDoAutror;

    public static void main(String[] args){

        GuiAutror guiAutror = new GuiAutror();

        JFrame frame = new JFrame("Autor");
        frame.setContentPane(guiAutror.CadastroDoAutror);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }
}
