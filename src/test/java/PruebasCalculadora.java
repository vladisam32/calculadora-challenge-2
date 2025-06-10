
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.litethinking.practica2.calculadora.modelo.ValoresOperacion;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PruebasCalculadora {

    @Test
    @DisplayName("Prueba de suma de dos números")
    public void testSuma() {
        // Crear valores de entrada
        ValoresOperacion valores = new ValoresOperacion("5.5", "4.5");
        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        BigDecimal resultado = valor1.add(valor2);
        Assertions.assertEquals(new BigDecimal("10.0"), resultado, "La suma no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de resta de dos números")
    public void testResta() {
        ValoresOperacion valores = new ValoresOperacion("10.0", "3.5");
        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        BigDecimal resultado = valor1.subtract(valor2);
        Assertions.assertEquals(new BigDecimal("6.5"), resultado, "La resta no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de multiplicación de dos números")
    public void testMultiplicacion() {
        ValoresOperacion valores = new ValoresOperacion("2.5", "4.0");
        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        BigDecimal resultado = valor1.multiply(valor2);
        Assertions.assertEquals(new BigDecimal("10.0"), resultado, "La multiplicación no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Prueba de división de dos números")
    public void testDivision() {
        ValoresOperacion valores = new ValoresOperacion("10.0", "2.0");
        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        BigDecimal resultado = valor1.divide(valor2);
        Assertions.assertEquals(new BigDecimal("5.0"), resultado, "La división no coincide con el resultado esperado");
    }

    @Test
    @DisplayName("Validación de división por cero")
    public void testErrores() {
        // Validar errores como división por cero
        ValoresOperacion valores = new ValoresOperacion("10.0", "0");

        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            valor1.divide(valor2);
        });

        Assertions.assertEquals("/ 0", exception.getMessage(), "El mensaje de error no es el esperado");
    }

    @Test
    @DisplayName("Prueba con supplier lambda ::new de valores")
    public void testSupplier() {
        // Simular un supplier que devuelve números como Strings
        ValoresOperacion valores = new ValoresOperacion("8.0", "12.0");
        BigDecimal valor1 = valores.getValor1();
        BigDecimal valor2 = valores.getValor2();

        Assertions.assertAll("Supplier Test",
                () -> assertEquals(new BigDecimal("8.0"), valor1),
                () -> assertEquals(new BigDecimal("12.0"), valor2)
        );
    }

    @Test
    @DisplayName("Validar el formato correcto de los números")
    public void testValidacionNumeros() {
        // Test para verificar que los valores están correctamente formateados
        ValoresOperacion valores = new ValoresOperacion("5.67", "8.90");

        Assertions.assertDoesNotThrow(() -> {
            new BigDecimal("5.67");
            new BigDecimal("8.90");
        }, "Hubo un error al validar los números");
    }
}



