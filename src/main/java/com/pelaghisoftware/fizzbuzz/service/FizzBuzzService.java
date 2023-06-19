package com.pelaghisoftware.fizzbuzz.service;

import com.pelaghisoftware.fizzbuzz.service.cor.DivisibleByThreeAndFiveCheck;
import com.pelaghisoftware.fizzbuzz.service.cor.DivisibleCheck;
import com.pelaghisoftware.fizzbuzz.service.cor.FizzBuzzChainOfResponsibility;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Service used to process fizzbuzz data.
 */
@Service
public class FizzBuzzService {

    /**
     * Gets a list of fizzbuzz from 1-100.
     * @return List of String representing the fizzbuzz from 1-100
     */
    public List<String> getFizzBuzzList() {
        return IntStream.range(1, 101).mapToObj(value ->
            new FizzBuzzChainOfResponsibility(value)
                    .then(new DivisibleByThreeAndFiveCheck())
                    .then(new DivisibleCheck(3, "fizz"))
                    .then(new DivisibleCheck(5, "buzz"))
                    .run()).collect(Collectors.toList());
    }
}
