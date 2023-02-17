package com.example.demo.dto;

public interface Multiplying {
    default int multiply(int a, int b) {
        return a * b;
    }
}
