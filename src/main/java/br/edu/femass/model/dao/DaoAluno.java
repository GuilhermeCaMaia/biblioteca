package br.edu.femass.model.dao;

import br.edu.femass.model.Aluno;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAluno extends Persistencia<Aluno>{

    public static List<Aluno> alunos = new ArrayList<>();

    public void registrarAluno(Aluno aluno) throws Exception{
        alunos.add(aluno);

        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(aluno);

        FileOutputStream out = new FileOutputStream("Aluno.json");
        out.write(json.getBytes());
        out.close();
    }
}
