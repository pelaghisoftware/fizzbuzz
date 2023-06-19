package com.pelaghisoftware.fizzbuzz.model;

import java.util.List;

/**
 * Data Model Class for a Fizz Buzz Response.
 * @param fizzBuzzList List of Strings containing either the number or the appropriate fizz, buzz combination
 */
public record FizzBuzzResponse(List<String> fizzBuzzList) {
}
