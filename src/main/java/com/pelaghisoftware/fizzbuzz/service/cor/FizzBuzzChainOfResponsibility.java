package com.pelaghisoftware.fizzbuzz.service.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * Chain of responsibility to process a fizz buzz request.
 * Will process all steps in the order that they were added.
 */
public class FizzBuzzChainOfResponsibility {

    /** Tasks to process the given data. */
    private List<FizzBuzzChainOfResponsibilityTask> tasks = new ArrayList<>();

    /** Value to test for fizzbuzz. */
    private Integer value;

    /**
     * Constructor.
     * @param value Value to test for fizzbuzz
     */
    public FizzBuzzChainOfResponsibility(Integer value) {
        this.value = value;
    }

    /**
     * Adds a new task to the tasks list.
     * @param task Task to process the given data
     * @return @{@code this}
     */
    public FizzBuzzChainOfResponsibility then(FizzBuzzChainOfResponsibilityTask task) {
        tasks.add(task);
        return this;
    }

    /**
     * Runs the processing chain for the given value
     * @return String containing either the input value if all checks are null, or the given value from
     *  the processing task.
     */
    public String run() {
        for(FizzBuzzChainOfResponsibilityTask task : tasks) {
            String result = task.getResult(value);

            if(result != null) {
                return result;
            }
        }

        return value.toString();
    }
}
