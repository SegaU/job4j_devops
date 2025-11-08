package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data model representing two numeric arguments.
 * Used as input for calculator operations.
 *
 * @author job4j
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoArgs {
    /**
     * First numeric argument.
     */
    private double first;

    /**
     * Second numeric argument.
     */
    private double second;
}
