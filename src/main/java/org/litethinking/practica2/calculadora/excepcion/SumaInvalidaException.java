package org.litethinking.practica2.calculadora.excepcion;

public class SumaInvalidaException extends RuntimeException {
    public SumaInvalidaException(String mensaje) {
        super(mensaje);
    }
}