package org.litethinking.practica2.calculadora.servicio;

import org.litethinking.practica2.calculadora.modelo.OperacionEnum;
import org.litethinking.practica2.calculadora.operaciones.OperacionMatematica;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class CalculadoraServicio {
    private OperacionEnum operacion;

    public BigDecimal calcular(final ValoresOperacion valores, final String simboloOperacion) {

        operacion = this.operacion.obtenerPorSimbolo(simboloOperacion)
                .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: " + simboloOperacion));

        OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();

        return instanciaOperacion.calcular(valores);
    }
}



