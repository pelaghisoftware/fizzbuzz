package com.pelaghisoftware.fizzbuzz.service.cor;

/**
 * Checks if an input number is divisible by the given value and returns the given String value.
 */
public class DivisibleCheck implements FizzBuzzChainOfResponsibilityTask {

    /** Number to use for divisibility check. */
    private Integer divisibleByNum;

    /** String value to return to the user if the input value is divisible by {@link DivisibleCheck#divisibleByNum}. */
    private String resultValue;

    /**
     * Constructor.
     * @param divisibleByNum Number to use for divisibility check
     * @param resultValue String value to return to the user if the input value is divisible by {@link DivisibleCheck#divisibleByNum}
     */
    public DivisibleCheck(Integer divisibleByNum, String resultValue) {
        if(divisibleByNum.equals(0)) {
            throw new IllegalArgumentException("divisibleByNum cannot be 0");
        }

        this.divisibleByNum = divisibleByNum;
        this.resultValue = resultValue;
    }

    /**
     * Checks if the input value is divisible by {@link DivisibleCheck#divisibleByNum}.
     * @param value value to check for divisibilty by {@link DivisibleCheck#divisibleByNum}
     * @return {@link DivisibleCheck#resultValue if the value is divisible by {@link DivisibleCheck#divisibleByNum}. Otherwise, {@code null}.
     */
    @Override
    public String getResult(Integer value) {
        if(value % divisibleByNum == 0) {
            return resultValue;
        }

        return null;
    }
}
