package br.edu.femass.model;

public class Aluno extends Leitor{
    String matricula;

    public Aluno(Long codigo, String nome, String endereco, String telefone, int prazoMaximoDevolucao, String matricula) {
        super(codigo, nome, endereco, telefone, prazoMaximoDevolucao);
        this.matricula = matricula;
    }
}