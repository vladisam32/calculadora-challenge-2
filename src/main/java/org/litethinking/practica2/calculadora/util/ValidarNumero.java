package org.litethinking.practica2.calculadora.util;

import org.litethinking.practica2.calculadora.excepcion.ExcepcionNumeroInvalido;

public class ValidarNumero {

    public static final String REGULAR_EXP_VALIDATE_NUMBER = "-?\\d+(\\.\\d+)?([eE][+-]?\\d+)?";

    public static String validar(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            throw new ExcepcionNumeroInvalido("El valor no puede ser nulo o vacío.");
        }
        if (entrada.matches(REGULAR_EXP_VALIDATE_NUMBER)) {
            return entrada;
        } else {
            throw new ExcepcionNumeroInvalido("Formato de número no válido: " + entrada);
        }
    }
    
    
    
    
    
}