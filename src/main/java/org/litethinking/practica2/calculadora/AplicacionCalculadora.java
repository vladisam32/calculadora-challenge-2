package org.litethinking.practica2.calculadora;

import org.litethinking.practica2.calculadora.util.ValidarNumero;

import java.math.BigDecimal;
import java.util.Scanner;

import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;
import org.litethinking.practica2.calculadora.servicio.CalculadoraServicio;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        try {

            System.out.println("CALCULADORA...: ");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            String valor1 = ValidarNumero.validar(scanner.nextLine());

            System.out.println("Ingrese el símbolo de operación matematica (+, -, *, /): ");
            String simboloOperacion = scanner.nextLine();

            System.out.println("Ingrese el segundo número: ");
            String valor2 = ValidarNumero.validar(scanner.nextLine());

            ArithmeticInput result = new ArithmeticInput(valor1, simboloOperacion, valor2);

            BigDecimal resultado = getCalculoOperacionMatematica(result.valor1(), result.valor2(), result.simboloOperacion());

            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private record ArithmeticInput(String valor1, String simboloOperacion, String valor2) {
    }

    private static BigDecimal getCalculoOperacionMatematica(final String valor1, final String valor2, final String simboloOperacion) {
        ValoresOperacion valores = new ValoresOperacion(valor1, valor2);

           /* Operacion operacion = Operacion.obtenerPorSimbolo(simboloOperacion)
                    .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: " + simboloOperacion));

            OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();*/

        CalculadoraServicio calculadora = new CalculadoraServicio();

        return calculadora.calcular(valores, simboloOperacion);
    }


}