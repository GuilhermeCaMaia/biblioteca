package br.edu.femass.model;

public class Livro {
    Long codigo;
    String titulo;

    public Livro(Long codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    void CadastrarLivro(String titulo ,Long codigo){
        System.out.println("Digite o nome do livro:");
        this.titulo = getTitulo();
        System.out.println("Digite o codigo do livro:");
        this.codigo = getCodigo();
    }


}