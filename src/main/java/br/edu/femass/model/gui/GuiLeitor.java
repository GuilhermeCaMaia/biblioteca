package br.edu.femass.model.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLeitor {
    private JPanel InformacaoDoLeitro;
    private JTextField textCodigo;
    private JTextField textNome;
    private JTextField textEndereso;
    private JTextField textTelefone;
    private JLabel Codigo;
    private JLabel nome;
    private JLabel enderco;
    private JLabel telefone;
    private JButton cadastrarAlunoButton;
    private JButton cadastrarProfessorButton;
    private JList listaDeCliente;

    public GuiLeitor() {
        cadastrarProfessorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cadastrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

        GuiLeitor guiLeitor = new GuiLeitor();

        JFrame frame = new JFrame("Leitor");
        frame.setContentPane(guiLeitor.InformacaoDoLeitro);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }
}
