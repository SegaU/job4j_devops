package ru.job4j.devops.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.devops.models.Result;
import ru.job4j.devops.models.TwoArgs;

/**
 * REST controller for calculator operations.
 * Provides endpoints for basic arithmetic operations.
 *
 * @author job4j
 * @version 1.0.0
 */
@RestController
@RequestMapping("calc")
public class CalcController {
    /**
     * Adds two numbers together.
     *
     * @param twoArgs object containing two numbers to add
     * @return ResponseEntity with the sum result
     */
    @PostMapping("summarise")
    public ResponseEntity<Result> summarise(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() + twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }

    /**
     * Multiplies two numbers.
     *
     * @param twoArgs object containing two numbers to multiply
     * @return ResponseEntity with the multiplication result
     */
    @PostMapping("times")
    public ResponseEntity<Result> times(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() * twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }
}
