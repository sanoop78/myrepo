package CalculatorPkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	@Test
	public void calTestAdd() {
		assertEquals(35, calculator.add(25, 10));
	}

	@Test
	public void calTestSub() {
		assertEquals(1, calculator.sub(10, 9));
	}

	@Test
	public void calcTestMul() {
		assertEquals(50, calculator.mul(25, 2));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(10, calculator.div(10, 1));
	}

}
