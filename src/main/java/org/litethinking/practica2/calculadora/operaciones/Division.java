package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.excepcion.DivisionPorCeroException;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Division implements OperacionMatematica {
    public BigDecimal calcular(ValoresOperacion valores) {
        if (valores.getValor2().equals(BigDecimal.ZERO)) {
            throw new DivisionPorCeroException();
        }
        return valores.getValor1().divide(valores.getValor2());
    }
}