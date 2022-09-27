package br.edu.femass.model.dao;

import br.edu.femass.model.Emprestimo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoEmprestimo extends Persistencia<Emprestimo>{

    private static List<Emprestimo> emprestimos = new ArrayList<>();

    public void registrarEmprestimo(Emprestimo emprestimo) throws Exception {
        emprestimos.add(emprestimo);

        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(emprestimo);

        FileOutputStream out = new FileOutputStream("emprestimo.json");
        out.write(json.getBytes());
        out.close();
    }

    public List<Emprestimo> getEmprestimos() throws Exception {

        FileInputStream in = new FileInputStream("emprestimo.json");
        String json = new String(in.readAllBytes());

        List<Emprestimo> emprestimos = getObjectmapper().readValue(json, new TypeReference<List<Emprestimo>>() {});

        return emprestimos;
    }
}
