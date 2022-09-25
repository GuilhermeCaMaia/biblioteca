package br.edu.femass.model.dao;

import br.edu.femass.model.Livro;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoLivro {

    private static List<Livro> livros = new ArrayList<>();

    public void gravar(Livro livros) throws Exception {

        livros.add(livros);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(livros);

        FileOutputStream out = new FileOutputStream("Livros.json");
        out.write(json.getBytes());
        out.close();
    }
}
