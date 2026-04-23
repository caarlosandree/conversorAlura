package services;

import interfaces.CalculoArea;

public class CalcularCirculo implements CalculoArea {

    @Override
    public double calcularArea(double lado1, double lado2) {
        double raio = lado1;
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2) {
        double raio = lado1;
        return 2 * Math.PI * raio;
    }
}
