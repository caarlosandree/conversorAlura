package services;

import interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        return fahrenheit;
    }
    
    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
        return celsius;
    }
}
