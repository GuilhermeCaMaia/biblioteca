package br.edu.femass.model.gui;

import br.edu.femass.model.dao.DaoAutor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GuiExemplar {
    private JPanel ExemplarDeLivro;
    private JList listDeLivros;
    private JButton Alugar;
    private JLabel aviso;
    private JComboBox cbAutor;

    public GuiExemplar() {
        listDeLivros.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        cbAutor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //Autor autor = (Autor) cbAutor.getSelectedItem();
                DaoAutor daoAutor = new DaoAutor();
                daoAutor = (DaoAutor) cbAutor.getSelectedItem();
                if (daoAutor==null) return;


            }
        });
    }

//    private void PrencherListaLivro(){
//        listDeLivros.setListData(
//                new DaoLivro().getAll().toArray()
//        );
//    }

    public static void main(String[] args) {

        GuiExemplar guiExemplar = new GuiExemplar();

        //guiExemplar.PrencherListaLivro();

        JFrame frame = new JFrame("Exemplar");
        frame.setContentPane(guiExemplar.ExemplarDeLivro);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
    }
}
