package ec.edu.ups.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	Calculator c = null;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("setUpClass()");
	}
	
	@Before
	public void setUp() {
		c = new Calculator();
		System.out.println("setUp()");
	}

	@Test
	public void given_two_integers_when_adition_then_ok() {
		System.out.println("Test 1");
		int a = 4;
		int b = 2;
		int expected = 6;
		assertEquals(expected,c.addition(a,b));
	}

	@Test
	public void given_two_integers_when_subtraction_then_ok() {
		System.out.println("Test 2");
		int a = 4;
		int b = 2;
		int expected = 2;
		assertEquals(expected,c.subtration(a,b));
	}

	@Test(expected = ArithmeticException.class)
	public void given_two_integers_when_division_then_exception() {
		System.out.println("Test 3");
		int a = 6;
		int b = 0;
		int expected = 3;
		assertEquals(expected,c.division(a,b));
	}

	@Test(timeout = 150)
	public void given_two_integers_when_multiplication_then_timout() {
		System.out.println("Test 4");
		int a = 4;
		int b = 2;
		int expected = 8;
		assertEquals(expected,c.multiplication(a,b));
	}

	@After
	public void tearDown() {
		System.out.println("TearDown()");
		c.setAns(0);
		c = null;
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("TearDownClass()");
	}	
	
}
