package br.edu.femass.model.dao;

import br.edu.femass.model.Leitor;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoLeitor extends Persistencia<Leitor>{
    private static List<Leitor> leitores = new ArrayList<>();

    public void registrarLeitor(Leitor leitor) throws Exception {
        leitores.add(leitor);

        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(leitor);

        FileOutputStream out = new FileOutputStream("Leitor.json");
        out.write(json.getBytes());
        out.close();
    }

    public List<Leitor> getLeitores() throws Exception {
        FileInputStream in = new FileInputStream("Leitor.json");
        String json = new String(in.readAllBytes());

        List<Leitor> leitores = getObjectmapper().readValue(json, new TypeReference<List<Leitor>>() {});

        return leitores;
    }
}
