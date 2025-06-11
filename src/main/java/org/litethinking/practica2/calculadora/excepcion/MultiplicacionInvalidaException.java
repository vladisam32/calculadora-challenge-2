package org.litethinking.practica2.calculadora.excepcion;

public class MultiplicacionInvalidaException extends RuntimeException {
    public MultiplicacionInvalidaException(String mensaje) {
        super(mensaje);
    }

    public MultiplicacionInvalidaException(String mensaje, Throwable cause) {
        super(mensaje, cause);
    }
}