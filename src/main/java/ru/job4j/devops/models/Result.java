package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data model representing the result of a calculation.
 * Used as output for calculator operations.
 *
 * @author job4j
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    /**
     * Numeric result value.
     */
    private double value;
}
