import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void addTestPass() {
		assertEquals(-5, Calculator.add(-1, -4), "error in add()");
		assertEquals(25, Calculator.add(19, 6), "error in add()");
		assertEquals(0, Calculator.add(0, 0), "error in add()");
	}

	public void addTestFail() {
		assertEquals(9, Calculator.add(1, 2), "error in add()");
		assertEquals(3, Calculator.add(-1, -2), "error in add()");
		assertEquals(14, Calculator.add(1, 2), "error in add()");
	}
	public void subtractTestPass() {
		assertEquals(3, Calculator.subtract(-1, -4), "error in subtract()");
		assertEquals(13, Calculator.subtract(19, 6), "error in subtract()");
		assertEquals(0, Calculator.subtract(0, 0), "error in add()");
	}

	public void subtractTestFail() {
		assertEquals(9, Calculator.subtract(1, 2), "error in subtract()");
		assertEquals(3, Calculator.subtract(-1, -2), "error in subtract()");
		assertEquals(14, Calculator.subtract(1, 2), "error in subtract()");
	}
	public void multiplyTestPass() {
		assertEquals(2, Calculator.subtract(1, 2), "error in multiply()");
		assertEquals(2, Calculator.subtract(-1,-2), "error in multiply()");
		assertEquals(0, Calculator.subtract(0, 0), "error in multiply()");
	}
	public void multiplyTestFail() {
		assertEquals(0, Calculator.subtract(1, 2), "error in multiply()");
		assertEquals(-16, Calculator.subtract(-4, -4), "error in multiply()");
		assertEquals(9, Calculator.subtract(0, 0), "error in multiply()");
	}
}

