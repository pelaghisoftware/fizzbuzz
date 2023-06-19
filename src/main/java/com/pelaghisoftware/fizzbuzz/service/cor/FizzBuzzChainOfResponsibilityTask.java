package com.pelaghisoftware.fizzbuzz.service.cor;

/**
 * Task to run within a {@link FizzBuzzChainOfResponsibility}.
 */
public interface FizzBuzzChainOfResponsibilityTask {

    /**
     * Performs a check on the input value and returns the appropriate String based on the check.
     * @param value value to check for a certain condition
     * @return A string representing the appropriate value if the check is successful.
     *  Otherwise, {@code null}
     */
    public String getResult(Integer value);
}
