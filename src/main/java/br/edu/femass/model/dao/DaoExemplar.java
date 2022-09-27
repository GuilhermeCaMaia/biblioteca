package br.edu.femass.model.dao;

import br.edu.femass.model.Exemplar;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoExemplar extends Persistencia<Exemplar>{

    private static List<Exemplar> exemplares = new ArrayList<>();

    public void registrarData(Exemplar exemplar) throws Exception {
        exemplares.add(exemplar);


        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(exemplar);

        FileOutputStream out = new FileOutputStream("data.json");
        out.write(json.getBytes());
        out.close();
    }

    public List<Exemplar> getLivros() throws Exception{

        //1o) Ler o arquivo
        FileInputStream in = new FileInputStream("Exemplares.json");
        String json = new String(in.readAllBytes());

        //2o) Converter o conteudo do arquivo em ojeto

        List<Exemplar> exemplares = getObjectmapper().readValue(json, new TypeReference<List<Exemplar>>(){});

        //3o) Devolver a lista de objetos
        return exemplares;

    }



}
