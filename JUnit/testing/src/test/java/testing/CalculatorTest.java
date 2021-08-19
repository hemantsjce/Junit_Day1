package testing;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// To run Fn + F11
class CalculatorTest {
	
	Calculator calculator;
	@BeforeEach
	public void init() {
		calculator = new Calculator(); // Arrange
		System.out.println("init");

	}

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		
		int result = calculator.add(1,3); // Act
		assertEquals(4, result);
	
	}
	
	@Test
	void testAddFloat() {
		//fail("Not yet implemented");
		
		float result = calculator.add(1.2f,3.1f); // Act
		assertEquals(4.3, result,0.0000002);
	
	}
	
	@Test
	void testAddNegative() {
		//fail("Not yet implemented");
		
		int result = calculator.add(-1,-8); // Act
		assertEquals(-9, result);
	
	}
	
	@Test
	void divideInteger() {
		
		
		double result = calculator.divide(17,5); // Act
		assertEquals(3.0, result);
	
	}
	
	@Test
	void testWhenDenominatorIsZero() {
		try {
			calculator.divide(1,0); // Act
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
		
		
	
	}
	@Test
	void testAddFloatIfAisGreaterThan2() {
		
		float result = calculator.add(3.0f,3.1f); // Act
		assertEquals(6.1, result,0.0000002);
	
	}

}
