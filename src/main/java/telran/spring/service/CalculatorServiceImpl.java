package telran.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements calculatorService {

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double sum(double a, double b) {
		return a + b;
	}

	@Override
	public double substract(double a, double b) {
		return a - b;
	}

}
