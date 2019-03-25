package nz.ac.ara.dos0311.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyClassTest {
	
	@BeforeAll
//	This is static because they only run once.
	static void setup() {
		System.out.println("@BeforeAll - Execute once before all test methods in this class");
	}
	
	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - Executed before each test method in this class");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - Executed after each test method in this class");
	}
	
	@AfterAll
	static void done() {
		System.out.println("@AfterAll - Execute once after all test methods in this class");
	}
	
	@Test
	public void testMultiply() {
//		Arrange
		MyClass tester = new MyClass();
		final int EXPECTED = 50;
		final String ERROR_MSG = "10 * 5 must be 50";
		
//		Act
		final int ACTUAL = tester.multiply(10, 5);
		
//		Assert
		assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
	}
	
	@DisplayName("Test expects Exception")
	@Test
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		assertThrows(IllegalArgumentException.class, () -> {
			tester.multiply(1000, 5);
		});
	}

}
