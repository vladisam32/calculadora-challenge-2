package org.litethinking.practica2.calculadora.operaciones;

import org.litethinking.practica2.calculadora.excepcion.MultiplicacionInvalidaException;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

public class Multiplicacion implements OperacionMatematica {

    public BigDecimal calcular(final ValoresOperacion valores) {
       BigDecimal result = null;
       try {
           result =  valores.getValor1().multiply(valores.getValor2());
       }catch(Exception e){
           System.out.println("Error Multi exception is "+e.getMessage());
           throw new MultiplicacionInvalidaException("Error Multi exception is "+e.getMessage(), e);

       }

       return result;
    }

}