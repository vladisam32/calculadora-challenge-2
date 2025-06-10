package org.litethinking.practica2.calculadora.excepcion;

public class RestaInvalidaException extends RuntimeException {
    public RestaInvalidaException(String mensaje) {
        super(mensaje);
    }
}