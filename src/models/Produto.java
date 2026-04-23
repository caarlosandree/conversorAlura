package models;

import interfaces.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double preco;
    private double descontoAtual;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.descontoAtual = 0.0;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        double precoComDesconto = preco - (preco * (descontoAtual / 100));
        return precoComDesconto * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            this.descontoAtual = percentual;
        } else {
            throw new IllegalArgumentException("Desconto deve estar entre 0 e 100");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDescontoAtual() {
        return descontoAtual;
    }
}
