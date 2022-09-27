package br.edu.femass.model.dao;

import br.edu.femass.model.Livro;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoLivro {

    private static List<Livro> livros = new ArrayList<Livro>();

    public void gravar(Livro livro) throws Exception {

        livros.add(livro);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(livros);

        FileOutputStream out = new FileOutputStream("Livros.json");
        out.write(json.getBytes());
        out.close();
    }
}
