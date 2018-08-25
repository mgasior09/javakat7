package com.klb.commons;


import com.klb.exceptions.IncorrectArgumenException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NumbersCommonsTest {

    @Test
    public void testMinPositive() {
        List<Double> list = Arrays.asList(-2.3, 0.0, 10.0, 5.2, -1.0);
        assertEquals(5.2, NumbersCommons.minPositive(list), 0);

        //jesli ktos zadeklarowal ze metoda moze rzucic wyjatek,
        //dodac test rzucania wyjatku
    }

    @Test
    public void testSum() {
        List<Double> list = Arrays.asList(-2.3, 0.0, 10.0, 5.2, -1.0);
        try {
            assertEquals(15.2, NumbersCommons.sum(list, 1, 3), 0);
        } catch (IncorrectArgumenException e) {
            fail();
        }
    }

    @Test
    public void testSumException() {
        List<Double> list = Arrays.asList(-2.3, 0.0, 10.0, 5.2, -1.0);
        try {
            NumbersCommons.sum(list, -1, 3);
            NumbersCommons.sum(list, 2, 5);
            fail();
        } catch (IncorrectArgumenException e) {

        }
    }
}
