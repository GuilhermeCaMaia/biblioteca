package br.edu.femass.model;

public class Professor extends Leitor{
    String disciplina;

    public Professor(Long codigo, String nome, String endereco, String telefone, int prazoMaximoDevolucao, String disciplina) {
        super(codigo, nome, endereco, telefone, prazoMaximoDevolucao);
        this.disciplina = disciplina;
    }
}