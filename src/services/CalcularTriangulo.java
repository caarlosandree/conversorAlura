package services;

import interfaces.CalculoArea;

public class CalcularTriangulo implements CalculoArea {

    @Override
    public double calcularArea(double lado1, double lado2) {
        return (lado1 * lado2) / 2;
    }

    @Override
    public double calcularPerimetro(double lado1, double lado2) {
        // Assumindo triângulo equilátero para simplificar
        return 3 * lado1;
    }
}
