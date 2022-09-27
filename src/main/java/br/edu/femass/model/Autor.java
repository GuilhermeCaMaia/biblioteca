package br.edu.femass.model;


public class Autor{
    String nome;
    String sobreNome;
    String nacionalidade;
    public Autor(String nome, String sobreNome, String nacionalidade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    void cadastrarAutor(String nome, String sobreNome, String nacionalidade){
        System.out.println("Informe o nome do autor:");
        this.nome = getNome();
        System.out.println("Informe o sobre nome do autor:");
        this.sobreNome = getSobreNome();
        System.out.println("Informe sua nacionalidade:");
        this.nacionalidade = getNacionalidade();
    }

}