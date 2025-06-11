package org.litethinking.practica2.calculadora.servicio;

import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public interface ICalculoServicio {

     BigDecimal calcular(final ValoresOperacion valores, final String simboloOperacion);
}
