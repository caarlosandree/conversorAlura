package services;

import interfaces.ConversorFinanceiro;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorMoedaService implements ConversorFinanceiro {
    private final BigDecimal cotacaoDolar;

    public ConversorMoedaService(BigDecimal cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    @Override
    public BigDecimal converterDolarParaReal(BigDecimal valorDolar) {
        return valorDolar.multiply(cotacaoDolar).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal converterRealParaDolar(BigDecimal valorReal) {
        return valorReal.divide(cotacaoDolar, 2, RoundingMode.HALF_UP);
    }
}