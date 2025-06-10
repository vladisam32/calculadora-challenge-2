package org.litethinking.practica2.calculadora.excepcion;

public class DivisionPorCeroException extends RuntimeException {
    public DivisionPorCeroException() {
        super("No se puede dividir por cero.");
    }
}