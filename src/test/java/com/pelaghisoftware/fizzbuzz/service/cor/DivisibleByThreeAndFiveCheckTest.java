package com.pelaghisoftware.fizzbuzz.service.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DivisibleByThreeAndFiveCheckTest {

    @Test
    public void getResultNullOnlyDivisibleBy3Test() {
        DivisibleByThreeAndFiveCheck check = new DivisibleByThreeAndFiveCheck();
        assertNull(check.getResult(9));
    }

    @Test
    public void getResultNullOnlyDivisibleBy5Test() {
        DivisibleByThreeAndFiveCheck check = new DivisibleByThreeAndFiveCheck();
        assertNull(check.getResult(10));
    }

    @Test
    public void getResultNullNotDivisibleBy3or5Test() {
        DivisibleByThreeAndFiveCheck check = new DivisibleByThreeAndFiveCheck();
        assertNull(check.getResult(8));
    }

    @Test
    public void getResultSuccessTest() {
        DivisibleByThreeAndFiveCheck check = new DivisibleByThreeAndFiveCheck();
        assertEquals("fizzbuzz", check.getResult(15));
    }
}
