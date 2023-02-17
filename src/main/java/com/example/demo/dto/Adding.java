package com.example.demo.dto;

public interface Adding {
    default int add(int a, int b) {
        return a + b;
    }
}
