package models;

import interfaces.Calculavel;

public class Livro implements Calculavel {
    private String titulo;
    private String autor;
    private double preco;
    private double desconto;

    public Livro(String titulo, String autor, double preco, double desconto) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * (desconto / 100));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}
