package br.com.etecia.myapp;

public class Livros {
    private String titulo;
    private String descricao;
    private int imgLivro;
    private double preco;

    public Livros(String titulo, String descricao, int imgLivro, double preco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imgLivro = imgLivro;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImgLivro() {
        return imgLivro;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String categoria) {
        this.descricao = descricao;
    }

    public void setImgLivro(int imgLivro) {
        this.imgLivro = imgLivro;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
