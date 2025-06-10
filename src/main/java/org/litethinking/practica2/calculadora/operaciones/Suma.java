package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Suma implements OperacionMatematica {
    public BigDecimal calcular(ValoresOperacion valores) {
        return valores.getValor1().add(valores.getValor2());
    }
}