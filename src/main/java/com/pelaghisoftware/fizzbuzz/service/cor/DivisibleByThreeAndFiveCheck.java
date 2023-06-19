package com.pelaghisoftware.fizzbuzz.service.cor;

/**
 * Performs a check if an Integer is divisible by 3 and 5.
 */
public class DivisibleByThreeAndFiveCheck implements FizzBuzzChainOfResponsibilityTask {

    /**
     * Performs a check if an Integer is divisible by 3 and 5.
     * @param value
     * @return fizzbuzz if the value is divisible by 3 and 5. Otherwise, {@code null}.
     */
    @Override
    public String getResult(Integer value) {
        if(value % 3 == 0 && value % 5 == 0) {
            return "fizzbuzz";
        }

        return null;
    }
}
