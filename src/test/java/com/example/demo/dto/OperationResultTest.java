package com.example.demo.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationResultTest {
    OperationResult operationResult = new OperationResult();

    @Test
    void addNumbers() {
        operationResult.addNumbers(2, 3);
        assertEquals(5, operationResult.getResult());
    }

    @Test
    void multiplyNumbers() {
        operationResult.addNumbers(2, 3);
        assertEquals(5, operationResult.getResult());
    }
}