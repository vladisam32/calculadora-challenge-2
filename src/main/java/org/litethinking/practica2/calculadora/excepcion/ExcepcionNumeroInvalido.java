package org.litethinking.practica2.calculadora.excepcion;

public class ExcepcionNumeroInvalido extends RuntimeException {
    public ExcepcionNumeroInvalido(String mensaje) {
        super(mensaje);
    }
}