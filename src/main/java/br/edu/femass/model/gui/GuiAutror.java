package br.edu.femass.model.gui;

import br.edu.femass.model.Autor;
import br.edu.femass.model.dao.DaoAutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAutror {
    private JTextField textNome;
    private JTextField textSobrenome;
    private JTextField textNacionalidade;
    private JLabel nomeDoAutorLabel;
    private JLabel Nacionalidade;
    private JButton proximoButton;
    private JPanel CadastroDoAutror;
    private JLabel SobrenomeDoAutor;

    public GuiAutror() {
        proximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Autor autor = new Autor(textNome.getText(),textSobrenome.getText(),textNacionalidade.getText());
                try {
                    new DaoAutor().gravar(autor);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                GuiLivro guiLivro = new GuiLivro();
                JDialog jFrame = new JDialog(new Frame(), true);
                //JFrame jFrame = new JFrame("Livro");
                jFrame.setContentPane(guiLivro.getCadastrarLivros());

                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }

    public JPanel getCadastroDoAutror() {
        return CadastroDoAutror;
    }

    public static void main(String[] args){

        GuiAutror guiAutror = new GuiAutror();

        JFrame frame = new JFrame("Autor");
        frame.setContentPane(guiAutror.CadastroDoAutror);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }
}
