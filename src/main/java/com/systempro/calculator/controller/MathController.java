package com.systempro.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systempro.calculator.convert.NumberConvert;
import com.systempro.calculator.exceptions.UnsuportedMathOperationException;
import com.systempro.calculator.math.SimpleMath;

@RestController
public class MathController {

	SimpleMath simpleMath = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if ((!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}
		return simpleMath.sum(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if ((!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}

		return simpleMath.sub(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if ((!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}

		return simpleMath.mult(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if ((!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}

		return simpleMath.div(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if ((!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}

		return simpleMath.media(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/raiz/{number}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("number") String number) throws Exception {
		if (!NumberConvert.isNumeric(number)) {
			throw new UnsuportedMathOperationException("plese set a numeric");
		}
		return simpleMath.raiz(NumberConvert.convertToDouble(number));
	}

}
