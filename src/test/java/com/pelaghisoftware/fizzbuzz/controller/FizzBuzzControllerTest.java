package com.pelaghisoftware.fizzbuzz.controller;

import com.pelaghisoftware.fizzbuzz.service.FizzBuzzService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzControllerTest {

    @InjectMocks
    private FizzBuzzController controller;

    @Mock
    private FizzBuzzService service;

    @Test
    public void getFizzBuzzTest() {
        List<String> fizzBuzzResult = Arrays.asList("1", "2", "fizz");
        when(service.getFizzBuzzList()).thenReturn(fizzBuzzResult);

        assertEquals(fizzBuzzResult, controller.getFizzBuzz().fizzBuzzList());
    }
}
