package services;

import interfaces.CalculoArea;

public class CalcularQuadrado implements CalculoArea {

    @Override
    public double calcularArea(double lado1, double lado2) {
        double lado = lado1; // Para quadrado, usa apenas um lado
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2) {
        double lado = lado1; // Para quadrado, usa apenas um lado
        return 4 * lado;
    }
}
