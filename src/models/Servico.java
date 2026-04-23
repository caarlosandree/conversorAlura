package models;

import interfaces.Vendavel;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;
    private int horas;
    private double descontoAtual;

    public Servico(String descricao, double precoHora, int horas) {
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.horas = horas;
        this.descontoAtual = 0.0;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        double precoBase = precoHora * horas;
        double precoComDesconto = precoBase - (precoBase * (descontoAtual / 100));
        return precoComDesconto * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 50) {
            this.descontoAtual = percentual;
        } else {
            throw new IllegalArgumentException("Desconto para serviços deve estar entre 0 e 50");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public int getHoras() {
        return horas;
    }

    public double getDescontoAtual() {
        return descontoAtual;
    }
}
