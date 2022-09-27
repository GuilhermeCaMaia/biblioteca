package br.edu.femass.model.dao;

import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoExemplar {

    private static List<Exemplar> exemplar = new ArrayList<>();

    public void registrarData(Exemplar exemplar) throws Exception {
        exemplar.add(Exemplar);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(exemplar);

        FileOutputStream out = new FileOutputStream("data.json");
        out.write(json.getBytes());
        out.close();
    }

    public List<Livro> getLivros(){

        //1o) Ler o arquivo
        FileInputStream in = new FileInputStream("Livros.json");
        String json = new String(in.readAllBytes());

        //2o) Converter o conteudo do arquivo em ojeto
        ObjectMapper objectMapper = new ObjectMapper();
        exemplar = objectMapper.readValue(json, new TypeReference<List<Livro>>);

        //3o) Devolver a lista de objetos
        return exemplar;

    }



}
