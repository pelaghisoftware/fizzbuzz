package com.pelaghisoftware.fizzbuzz.controller;

import com.pelaghisoftware.fizzbuzz.model.FizzBuzzResponse;
import com.pelaghisoftware.fizzbuzz.service.FizzBuzzService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FizzBuzz Controller class containing endpoints for FizzBuzz.
 */
@RestController
public class FizzBuzzController {
    /** Service containing methods to process data for the FizzBuzzController. */
    private FizzBuzzService service;

    /**
     * Constructor. FizzBuzzService is autowired due to only having one constructor.
     * @param service Service containing methods to process data for the FizzBuzzController
     */
    public FizzBuzzController (FizzBuzzService service) {
        this.service = service;
    }

    /**
     * GET method for getting a list for FizzBuzz
     * @return {@link FizzBuzzResponse} containing the resulting fizz buzz list.
     */
    @GetMapping("/")
    public FizzBuzzResponse getFizzBuzz() {
        return new FizzBuzzResponse(service.getFizzBuzzList());
    }
}
