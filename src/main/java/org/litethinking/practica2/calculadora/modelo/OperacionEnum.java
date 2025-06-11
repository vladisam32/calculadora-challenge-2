package org.litethinking.practica2.calculadora.modelo;

import org.litethinking.practica2.calculadora.operaciones.*;

import java.util.Optional;
import java.util.function.Supplier;

public enum OperacionEnum {

    SUMAR("+", Suma::new),
    RESTAR("-", Resta::new),
    MULTIPLICACION("*", Multiplicacion::new),
    DIVISION("/", Division::new);

    private final String symbol;
    private final Supplier<OperacionMatematica> operationSupplier;

    OperacionEnum(String symbol, Supplier<OperacionMatematica> operationSupplier) {
        this.symbol = symbol;
        this.operationSupplier = operationSupplier;
    }

    public OperacionMatematica obtenerInstancia() {
        return operationSupplier.get();
    }

    public static boolean esOperacionValida(String symbol) {
        return obtenerPorSimbolo(symbol).isPresent();
    }

    public static Optional<OperacionEnum> obtenerPorSimbolo(String symbol) {
        return buscOperacionSegunSimbolo(symbol);
    }

    private static Optional<OperacionEnum> buscOperacionSegunSimbolo(String symbol) {
        return Optional.ofNullable(
            java.util.Arrays.stream(values())
            .filter(operacion -> operacion.symbol.equals(symbol))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Simbolo no definido"))
        );
    }
}


