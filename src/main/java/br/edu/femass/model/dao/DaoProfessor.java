package br.edu.femass.model.dao;

import br.edu.femass.model.Professor;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoProfessor extends Persistencia<Professor>{

    public static List<Professor> professores = new ArrayList<>();

    public void registrarProfesor(Professor professor) throws Exception {
        professores.add(professor);

        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(professor);

        FileOutputStream out = new FileOutputStream("Professor.json");
        out.write(json.getBytes());
        out.close();
    }
}
