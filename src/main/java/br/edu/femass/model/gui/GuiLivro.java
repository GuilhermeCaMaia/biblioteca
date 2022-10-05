package br.edu.femass.model.gui;

import br.edu.femass.model.Livro;
import br.edu.femass.model.dao.DaoLivro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLivro {
    private JPanel CadastrarLivros;
    private JTextField textCodigoDoLivro;
    private JButton CadastraOutroLIvro;
    private JButton TerminarCadastro;
    private JLabel nomeDoLivro;
    private JTextField textNomeLivro;
    private JLabel CodigoDoLivro;

    public GuiLivro() {
        CadastraOutroLIvro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Livro livro = new Livro(textNomeLivro.getText(),Long.parseLong(textCodigoDoLivro.getText()));
                try {
                    new DaoLivro().gravar(livro);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        TerminarCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Quero que fexe o dastrar livro e cadastrar cliente
            }
        });
    }

    public JPanel getCadastrarLivros() {
        return CadastrarLivros;
    }

    public static void main(String[] args) {

        GuiLivro guiLivro = new GuiLivro();

        JFrame frame = new JFrame("Livro");
        frame.setContentPane(guiLivro.CadastrarLivros);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }
}
