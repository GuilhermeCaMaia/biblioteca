package br.edu.femass.model.dao;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public interface Dao <T>{

    public void save(T objeto) throws Exception;
    public List<T> getAll() throws Exception;
}
