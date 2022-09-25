package br.edu.femass.model;

import java.time.LocalDate;

public class Exemplar {
    Long codigo;
    LocalDate dataAquisicao;

    public Exemplar(Long codigo, LocalDate dataAquisicao) {
        this.codigo = codigo;
        this.dataAquisicao = dataAquisicao;
    }
}