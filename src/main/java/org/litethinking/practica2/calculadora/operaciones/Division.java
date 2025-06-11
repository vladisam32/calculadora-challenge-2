package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.excepcion.DivisionPorCeroException;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Division implements OperacionMatematica {
    public BigDecimal calcular(ValoresOperacion valores) {
        if (valores.getValor2().equals(BigDecimal.ZERO)) {
            throw new DivisionPorCeroException();
        }
        try {
            BigDecimal valor1 = valores.getValor1();
            BigDecimal valor2 = valores.getValor2();
            return valor1.divide(valor2);
        } catch (Exception e) {
            throw new RuntimeException("Error during division: " + e.getMessage(), e);
        }
    }
}

