package br.com.etecia.myapp;

public class Livros {
    private String titulo;
    private String categoria;
    private int imgLivro;
    private double preco;

    public Livros(String titulo, String categoria, int imgLivro, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.imgLivro = imgLivro;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setImgLivro(int imgLivro) {
        this.imgLivro = imgLivro;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
