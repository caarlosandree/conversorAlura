package services;

import interfaces.CalculoArea;

public class CalcularRetangulo implements CalculoArea {
    @Override
    public double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }
}
