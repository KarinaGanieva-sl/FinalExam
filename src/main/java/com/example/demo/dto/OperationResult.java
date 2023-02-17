package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperationResult implements Adding, Multiplying {
    @JsonProperty("result")
    private int result;

    public void addNumbers(int a, int b) {
        result = add(a, b);
    }

    public void multiplyNumbers(int a, int b) {
        result = multiply(a, b);
    }

    public int getResult() {
        return  result;
    }
}
