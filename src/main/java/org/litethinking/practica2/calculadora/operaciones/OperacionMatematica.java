package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public interface OperacionMatematica {
    BigDecimal calcular(final ValoresOperacion valores) throws RuntimeException;
}