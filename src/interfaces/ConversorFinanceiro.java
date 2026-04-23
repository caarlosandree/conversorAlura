package interfaces;

import java.math.BigDecimal;

public interface ConversorFinanceiro {
    BigDecimal converterDolarParaReal(BigDecimal valorDolar);
    BigDecimal converterRealParaDolar(BigDecimal valorReal);
}