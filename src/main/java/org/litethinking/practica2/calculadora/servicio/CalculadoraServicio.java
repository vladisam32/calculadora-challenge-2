package org.litethinking.practica2.calculadora.servicio;

import org.litethinking.practica2.calculadora.operaciones.OperacionMatematica;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class CalculadoraServicio {
    private final OperacionMatematica operacion;

    public CalculadoraServicio(OperacionMatematica operacion) {
        this.operacion = operacion;
    }

    public BigDecimal calcular(ValoresOperacion valores) {

        return operacion.calcular(valores);
    }
}