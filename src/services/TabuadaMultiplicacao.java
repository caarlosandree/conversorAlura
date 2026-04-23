package services;

import interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private final int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
