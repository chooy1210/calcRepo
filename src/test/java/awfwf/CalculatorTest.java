package awfwf;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.Add(10, 20);;
		assertEquals(30,calc.getResult());
	}

}
