package br.edu.femass.model;

public class Leitor {
    Long codigo;
    String nome;
    String endereco;
    String telefone;
    int prazoMaximoDevolucao;

    public Leitor(Long codigo, String nome, String endereco, String telefone, int prazoMaximoDevolucao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.prazoMaximoDevolucao = prazoMaximoDevolucao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getPrazoMaximoDevolucao() {
        return prazoMaximoDevolucao;
    }

    void cadastrarLeitor(){
        System.out.println("informe o nome do leitor:");
        this.getNome();
        System.out.println("Informe o enderço:");
        this.getEndereco();
        System.out.println("Informe seu numero de telefone:");
        this.getTelefone();
        System.out.println("Seu prasomaximo é de:");
        this.getPrazoMaximoDevolucao();
    }

}