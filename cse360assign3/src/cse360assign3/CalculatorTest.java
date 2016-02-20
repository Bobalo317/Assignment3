package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal); //checks if the calculator constructor works, to see if its not null
	}
	
	@Test
	public void testGetTotal() {
		Calculator cal = new Calculator();
		assertEquals(0, cal.getTotal()); //Didn't change total so it should default to zero, and we are checking if it equals 0
	}

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(5); // adds 5 to the total so it should be just 5
		assertEquals(5, cal.getTotal()); //checks if 5 is equal to the total
	}
	
	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		cal.subtract(5); //subtracts 5 to the total which is zero
		assertEquals(-5, cal.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		cal.add(2); //add something to total so it would not just be 0
		cal.multiply(4); //multiply the total by 4 to see if it works
		assertEquals(8, cal.getTotal()); //check if the multiply function works with predetermined value
	}
	
	@Test
	public void testDivide() {
		Calculator cal = new Calculator();
		cal.divide(0); //test that dividing by 0 returns a 0
		assertEquals(0, cal.getTotal());
		cal.add(4); // add 4 to total to check divide function
		cal.divide(2); //divide by 2 to see if it works
		assertEquals(2, cal.getTotal()); // checks if the divide function works with predetermined value
	}
	
	@Test
	public void testGetHistory() {
		Calculator cal = new Calculator();
		cal.add(1);
		cal.subtract(2);
		cal.multiply(3);
		cal.divide(4);
		assertEquals("0 + 1 - 2 * 3 / 4", cal.getHistory());
	}
}
