package telran.spring.controller;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import telran.spring.service.calculatorService;

@RestController
@RequestMapping("calculator")
@RequiredArgsConstructor
public class CalculatorController {
final calculatorService CalculatorService;
@GetMapping("sum/{op1}/{op2}")
double sum(@PathVariable double op1, @PathVariable double op2) {
	return CalculatorService.sum(op1, op2);
}
@GetMapping("divide/{op1}/{op2}")
double divide(@PathVariable double op1, @PathVariable double op2) {
	return CalculatorService.divide(op1, op2);
}
@GetMapping("substract/{op1}/{op2}")
double substract(@PathVariable double op1, @PathVariable double op2) {
	return CalculatorService.substract(op1, op2);
}
@GetMapping("multiply/{op1}/{op2}")
double multiply(@PathVariable double op1, @PathVariable double op2) {
	return CalculatorService.multiply(op1, op2);
}
}
