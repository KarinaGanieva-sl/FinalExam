package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Operation {
    @JsonProperty("arg1")
    private int arg1;

    @JsonProperty("arg2")
    private int arg2;

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }
}
