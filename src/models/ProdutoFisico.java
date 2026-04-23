package models;

import interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double preco;
    private double taxaEnvio;
    private double imposto;

    public ProdutoFisico(String nome, double preco, double taxaEnvio, double imposto) {
        this.nome = nome;
        this.preco = preco;
        this.taxaEnvio = taxaEnvio;
        this.imposto = imposto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComImposto = preco + (preco * (imposto / 100));
        return precoComImposto + taxaEnvio;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getTaxaEnvio() {
        return taxaEnvio;
    }

    public double getImposto() {
        return imposto;
    }
}
