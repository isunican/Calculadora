package com.isunican.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {

    Calculadora c = new Calculadora();

    @Test
    public void suma() {
        c.setOperador1(1);
        c.setOperador2(1);
        double resultado = c.suma();
        assertEquals(2, resultado, 0);
    }
}