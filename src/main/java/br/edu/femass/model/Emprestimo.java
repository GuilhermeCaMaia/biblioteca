package br.edu.femass.model;

import java.time.LocalDate;

public class Emprestimo {
    LocalDate dataEmprestimo;
    LocalDate dataPrevistaDevolucao;
    LocalDate dataDevolucao;

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    void alocarLivro(){
        this.dataEmprestimo = getDataEmprestimo();
        this.dataPrevistaDevolucao = getDataPrevistaDevolucao();
    }

    void devolverLivro(){
        this.dataDevolucao = getDataDevolucao();
    }
}