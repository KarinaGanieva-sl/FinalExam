package com.example.demo.controllers;

import com.example.demo.dto.Operation;
import com.example.demo.dto.OperationResult;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping(value ="/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationResult> add(@RequestBody Operation operation) {
        OperationResult result = new OperationResult();
        result.addNumbers(operation.getArg1(), operation.getArg2());
        return ResponseEntity.ok(result);
    }

    @GetMapping(value ="/multiply", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationResult> multiply(@RequestBody Operation operation) {
        OperationResult result = new OperationResult();
        result.multiplyNumbers(operation.getArg1(), operation.getArg2());
        return ResponseEntity.ok(result);
    }

}
