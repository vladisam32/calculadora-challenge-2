package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.excepcion.SumaInvalidaException;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Suma implements OperacionMatematica {
    public BigDecimal calcular(final ValoresOperacion valores) {
        BigDecimal result = null;
        try {
          result =  valores.getValor1().add(valores.getValor2());
        }catch(Exception e){
            throw new SumaInvalidaException(" Error SUMA, error:: "+e.getMessage(), e);
        }
         return result;
    }
}