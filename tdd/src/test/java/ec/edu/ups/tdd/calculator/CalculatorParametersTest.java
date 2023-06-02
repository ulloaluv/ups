package ec.edu.ups.tdd.calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {

	private int a, b, expected;
	
	@Parameterized.Parameters
	public static Iterable<Object[]> parameters() {
		List<Object[]> objects = new ArrayList<Object[]>();
		objects.add(new Object[] {2,14,6});
		objects.add(new Object[] {1,8,9});
		objects.add(new Object[] {2,5,7});
		objects.add(new Object[] {7,3,10});
		objects.add(new Object[] {22,4,26});
		objects.add(new Object[] {12,14,26});
		return objects;
		
	}
	
	public CalculatorParametersTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Test
	public void given_two_integers_when_adition_then_ok() {
		Calculator c = new Calculator(); 
		assertEquals(expected,c.addition(a,b));
				
	}

}
