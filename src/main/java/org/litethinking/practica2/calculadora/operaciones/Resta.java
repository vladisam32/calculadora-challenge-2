package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.excepcion.RestaInvalidaException;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Resta implements OperacionMatematica {
    public BigDecimal calcular(final ValoresOperacion valores) {
        BigDecimal result = null;
        try {
            result = valores.getValor1().subtract(valores.getValor2());
        }catch(Exception e){
            System.out.println("Error Rest:: "+e.getMessage());
            throw new RestaInvalidaException(e.getMessage(), e);
        }

        return result;
    }
}