package org.litethinking.practica2.calculadora;

import org.litethinking.practica2.calculadora.servicio.ICalculoServicio;
import org.litethinking.practica2.calculadora.util.ValidarNumero;

import java.math.BigDecimal;
import java.util.Scanner;

import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;
import org.litethinking.practica2.calculadora.servicio.CalculadoraServicio;

public class AplicacionCalculadora {

    private final ICalculoServicio calculadoraServicio;

    public AplicacionCalculadora(ICalculoServicio calculadoraServicio) {
        this.calculadoraServicio = calculadoraServicio;
    }

    public static void main(String[] args) {

        AplicacionCalculadora app = new AplicacionCalculadora(new CalculadoraServicio());

        try {

            System.out.println("CALCULADORA...: ");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            String valor1 = ValidarNumero.validar(scanner.nextLine());

            System.out.println("Ingrese el símbolo de operación matematica (+, -, *, /): ");
            String simboloOperacion = scanner.nextLine();

            System.out.println("Ingrese el segundo número: ");
            String valor2 = ValidarNumero.validar(scanner.nextLine());

            DataInput input = new DataInput(valor1, simboloOperacion, valor2);

            BigDecimal resultado = app.getCalculoOperacionMatematica(input);
                    //(input.valor1(), input.valor2(), input.simboloOperacion());

            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private record DataInput(String valor1, String simboloOperacion, String valor2) {
    }

    private BigDecimal getCalculoOperacionMatematica( DataInput input ){
            //final String valor1, final String valor2, final String simboloOperacion) {
        ValoresOperacion valores = new ValoresOperacion(input.valor1, input.valor2);

           /* Operacion operacion = Operacion.obtenerPorSimbolo(simboloOperacion)
                    .orElseThrow(() -> new IllegalArgumentException("Operación desconocida: " + simboloOperacion));

            OperacionMatematica instanciaOperacion = operacion.obtenerInstancia();*/

        return calculadoraServicio.calcular(valores, input.simboloOperacion);
    }
}


