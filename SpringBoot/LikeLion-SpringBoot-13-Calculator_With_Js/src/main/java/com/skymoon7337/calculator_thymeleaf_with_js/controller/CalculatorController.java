package com.skymoon7337.calculator_thymeleaf_with_js.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public Map<String, Double> calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operator
    ) {
        double result = switch (operator) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> num2 != 0 ? num1 / num2 : Double.NaN;
            default -> Double.NaN;
        };

        return Map.of("result", result);
    }
}