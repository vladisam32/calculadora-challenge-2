package org.litethinking.practica2.calculadora.modelo;

import java.math.BigDecimal;

public class ValoresOperacion {
    private final BigDecimal valor1;
    private final BigDecimal valor2;

    public ValoresOperacion(String entrada1, String entrada2) {
        this.valor1 = new BigDecimal(entrada1);
        this.valor2 = new BigDecimal(entrada2);
    }

    public BigDecimal getValor1() {
        return valor1;
    }
    public BigDecimal getValor2() {
        return valor2;
    }
}