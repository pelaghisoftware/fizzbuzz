package com.pelaghisoftware.fizzbuzz.service.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisibleCheckTest {

    @Test
    public void constructorFailDivisibleByNumIs0Test() {
        assertThrows(IllegalArgumentException.class, () -> new DivisibleCheck(0, "test"));
    }

    @Test
    public void getResultNotDivisibleTest() {
        assertNull(new DivisibleCheck(3, "fizz").getResult(4));
    }

    @Test
    public void getResultSuccessTest() {
        String result = "fizz";
        assertEquals(result, new DivisibleCheck(3, result).getResult(6));
    }
}
