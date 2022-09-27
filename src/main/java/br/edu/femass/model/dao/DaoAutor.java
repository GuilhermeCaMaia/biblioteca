package br.edu.femass.model.dao;

import br.edu.femass.model.Autor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAutor {

    private static List<Autor> autores = new ArrayList<Autor>();

    public void gravar(Autor autor) throws Exception {
        //1o) adiciona o objeto a lista
        autores.add(autor);
        //2o) Gera o JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(autores);

        //3o) Gravar o arquivo em disco
        FileOutputStream out = new FileOutputStream("autor.json");
        out.write(json.getBytes());
        out.close();
    }
}
