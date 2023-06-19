package com.pelaghisoftware.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzServiceTest {
    @InjectMocks
    private FizzBuzzService service;

    @Test
    public void getFizzBuzzListTest() {
        assertEquals(100, service.getFizzBuzzList().size());
        assertEquals("fizz", service.getFizzBuzzList().get(2));
        assertEquals("buzz", service.getFizzBuzzList().get(4));
        assertEquals("fizzbuzz", service.getFizzBuzzList().get(14));
    }
}
