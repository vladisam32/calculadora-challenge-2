package org.litethinking.practica2.calculadora.excepcion;

public class MultiplicacionInvalidaException extends RuntimeException {
    public MultiplicacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}