package org.litethinking.practica2.calculadora.modelo;

import org.litethinking.practica2.calculadora.operaciones.*;

import java.util.Optional;
import java.util.function.Supplier;

public enum Operacion {

    SUMAR("+", Suma::new),
    RESTAR("-", Resta::new),
    MULTIPLICACION("*", Multiplicacion::new),
    DIVISION("/", Division::new);

    private final String symbol;
    private final Supplier<OperacionMatematica> operationSupplier;

    Operacion(String symbol, Supplier<OperacionMatematica> operationSupplier) {
        this.symbol = symbol;
        this.operationSupplier = operationSupplier;
    }

    public OperacionMatematica obtenerInstancia() {
        return operationSupplier.get();
    }

    public static boolean esOperacionValida(String symbol) {
        return obtenerPorSimbolo(symbol).isPresent();
    }

    public static Optional<Operacion> obtenerPorSimbolo(String symbol) {
        return buscOperacionSegunSimbolo(symbol);
    }

    private static Optional<Operacion> buscOperacionSegunSimbolo(String symbol) {
        for (Operacion operacion : values()) {
            if (operacion.symbol.equals(symbol)) {
                return Optional.of(operacion);
            }
        }
        return Optional.empty();
    }
}