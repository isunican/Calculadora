package com.isunican.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculadoraTest {

    Calculadora c = new Calculadora();

    @Test
    public void sumaTest() {
        c.setOperador1(1);
        c.setOperador2(1);
        assertTrue(c.suma() == 3);

        c.setOperador1(-1);
        assertTrue(c.suma() == 0);
    }
}