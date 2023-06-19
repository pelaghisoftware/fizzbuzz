package com.pelaghisoftware.fizzbuzz.service.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzChainOfResponsibilityTest {

    @Test
    public void runNoTaskSuccessfulTest() {
        Integer value = 1;
        assertEquals(value.toString(), new FizzBuzzChainOfResponsibility(value).then(new DivisibleByThreeAndFiveCheck()).run());
    }

    @Test
    public void runNoTasksAddedTest() {
        Integer value = 1;
        assertEquals(value.toString(), new FizzBuzzChainOfResponsibility(value).run());
    }

    @Test
    public void runSuccessfulTest() {
        Integer value = 15;
        String expectedResult = "fizzbuzz";
        assertEquals(expectedResult, new FizzBuzzChainOfResponsibility(value).then(new DivisibleByThreeAndFiveCheck()).run());
    }
}
