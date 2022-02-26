package com.systempro.calculator.convert;

public class NumberConvert {

	public static  Double convertToDouble(String strNumber) {
		if (strNumber == null) {
			return 0D;
		}
		// subistituindo todas as virgulas por .
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) {
			// faz o parse de string para double
			return Double.parseDouble(number);
		}
		return 0D;
	}

	// testa se numero for nulo retorna false
	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}

		// subistituindo todas as virgulas por .
		String number = strNumber.replaceAll(",", ".");
		// regex para verificar se é numeros
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
