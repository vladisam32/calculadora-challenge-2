
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.litethinking.practica2.calculadora.excepcion.MultiplicacionInvalidaException;
import org.litethinking.practica2.calculadora.modelo.Operacion;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;
import org.litethinking.practica2.calculadora.operaciones.Multiplicacion;
import org.litethinking.practica2.calculadora.operaciones.OperacionMatematica;
import org.litethinking.practica2.calculadora.servicio.CalculadoraServicio;
import org.litethinking.practica2.calculadora.util.ValidarNumero;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PruebasCalculadora {

    @Test
    @DisplayName("Prueba de suma con entrada simulada")
    public void testSumaSimulada() {
        ValoresOperacion valores = new ValoresOperacion("7.5", "2.5");
        Operacion operacion = Operacion.obtenerPorSimbolo("+")
                .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: +"));

        OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();
        CalculadoraServicio calculadora = new CalculadoraServicio(instanciaOperacion);

        BigDecimal resultado = calculadora.calcular(valores);
        Assertions.assertEquals(new BigDecimal("10.0"), resultado, "La suma no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de operación desconocida")
    public void testOperacionDesconocida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Operacion.obtenerPorSimbolo("%")
                    .orElseThrow(() -> new IllegalArgumentException("Operación desconocida"));
        }, "Se esperaba una excepción para la operación desconocida");
    }

    @Test
    @DisplayName("Prueba de división con entrada simulada")
    public void testDivisionSimulada() {
        ValoresOperacion valores = new ValoresOperacion("20.0", "4.0");
        Operacion operacion = Operacion.obtenerPorSimbolo("/")
                .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: /"));

        OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();
        CalculadoraServicio calculadora = new CalculadoraServicio(instanciaOperacion);

        BigDecimal resultado = calculadora.calcular(valores);
        Assertions.assertEquals(new BigDecimal("5.0"), resultado, "La división no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de multiplicación con entrada simulada")
    public void testMultiplicacionSimulada() {
        ValoresOperacion valores = new ValoresOperacion("3.0", "3.0");
        Operacion operacion = Operacion.obtenerPorSimbolo("*")
                .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: *"));

        OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();
        CalculadoraServicio calculadora = new CalculadoraServicio(instanciaOperacion);

        BigDecimal resultado = calculadora.calcular(valores);
        Assertions.assertEquals(new BigDecimal("9.0"), resultado, "La multiplicación no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de resta con entrada simulada")
    public void testRestaSimulada() {
        ValoresOperacion valores = new ValoresOperacion("15.0", "5");
        Operacion operacion = Operacion.obtenerPorSimbolo("-")
                .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: -"));

        OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();
        CalculadoraServicio calculadora = new CalculadoraServicio(instanciaOperacion);

        BigDecimal resultado = calculadora.calcular(valores);
        Assertions.assertEquals(new BigDecimal("9.5"), resultado, "La resta no coincide con el resultado esperado");
    }


    
    
    @Test
    @DisplayName("Prueba de multiplicación con valor nulo")
    public void testMultiplicacionConValorNulo() {
        Multiplicacion multiplicacion = new Multiplicacion();
        ValoresOperacion valores = new ValoresOperacion("", "5");

        MultiplicacionInvalidaException exception = Assertions.assertThrows(
                MultiplicacionInvalidaException.class, 
                () -> multiplicacion.calcular(valores), 
                "Se esperaba una excepción para el valor nulo"
        );

        Assertions.assertEquals("Expected exception message here", exception.getMessage());
    }
}



