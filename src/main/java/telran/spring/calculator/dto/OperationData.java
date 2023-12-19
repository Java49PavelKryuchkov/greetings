package telran.spring.calculator.dto;

import jakarta.validation.constraints.*;

public record OperationData(@NotEmpty 
		 String type, @NotEmpty String operation,
		@NotEmpty String operand1, String operand2) {

}
