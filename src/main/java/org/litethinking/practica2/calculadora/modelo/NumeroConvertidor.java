package org.litethinking.practica2.calculadora.modelo;

import org.litethinking.practica2.calculadora.operaciones.OperacionMatematica;

import java.math.BigDecimal;

public class NumeroConvertidor {
    private final BigDecimal valor1;
    private final BigDecimal valor2;

    public NumeroConvertidor(String entrada1, String entrada2) {
        this.valor1 = new BigDecimal(entrada1);
        this.valor2 = new BigDecimal(entrada2);
    }

   /* public BigDecimal calcular(OperacionMatematica operacion) {
        return operacion.calcular(valor1, valor2);
    }*/
}


