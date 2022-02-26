package com.systempro.calculator.math;

public class SimpleMath {

	// adição
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	// subtração
	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	// divisão
	public Double div(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}

	// multiplicação
	public Double mult(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	// media
	public Double media(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	// raiz quadrada
	public Double raiz(Double number) {
		return Math.sqrt(number);
	}
}
