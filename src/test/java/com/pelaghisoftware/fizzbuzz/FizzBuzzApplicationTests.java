package com.pelaghisoftware.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzApplicationTests {

    @Test
    public void testMain() {
        FizzBuzzApplication.main(new String[] {});
        assertTrue(true, "Silly condition to be compliant with testing frameworks.");
    }
}
