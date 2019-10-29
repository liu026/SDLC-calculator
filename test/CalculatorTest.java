import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void addTestPass() {
		assertEquals(-5, Calculator.add(-1, -4), "error in add()");
		assertEquals(25, Calculator.add(19, 6), "error in add()");
		assertEquals(0, Calculator.add(0, 0), "error in add()");
	}
	@Test
	void addTestFail() {
		assertNotEquals(2, Calculator.add(1, 2), "error in add()");
		assertNotEquals(3, Calculator.add(-1, -2), "error in add()");
		assertNotEquals(14, Calculator.add(1, 2), "error in add()");
	}
	@Test
	public void subtractTestPass() {
		assertEquals(3, Calculator.subtract(-1, -4), "error in subtract()");
		assertEquals(13, Calculator.subtract(19, 6), "error in subtract()");
		assertEquals(0, Calculator.subtract(0, 0), "error in subtract()");
	}
	@Test
	public void subtractTestFail() {
		assertNotEquals(9, Calculator.subtract(1, 2), "error in subtract()");
		assertNotEquals(3, Calculator.subtract(-1, -2), "error in subtract()");
		assertNotEquals(14, Calculator.subtract(1, 2), "error in subtract()");
	}
	@Test
	public void multiplyTestPass() {
		assertEquals(2, Calculator.multiply(1, 2), "error in multiply()");
		assertEquals(2, Calculator.multiply(-1,-2), "error in multiply()");
		assertEquals(0, Calculator.multiply(0, 0), "error in multiply()");
	}
	@Test
	public void multiplyTestFail() {
		assertNotEquals(4, Calculator.multiply(1, 2), "error in multiply()");
		assertNotEquals(-16, Calculator.multiply(-4, -4), "error in multiply()");
		assertNotEquals(9, Calculator.multiply(0, 0), "error in multiply()");
	}
	@Test
	public void divideTestPass() {
		assertEquals(0.5, Calculator.divide(1, 2), "error in divide()");
		assertEquals(0.5, Calculator.divide(-1,-2), "error in divide()");
		assertEquals(2, Calculator.divide(4, 2), "error in divide()");
	}
	@Test
	public void divideTestFail() {
		assertNotEquals(0, Calculator.divide(1, 2), "error in divide()");
		assertNotEquals(-16, Calculator.divide(-4, -4), "error in divide()");
		assertNotEquals(9, Calculator.divide(0, 0), "error in divide()");
	}
}

