package ba.bild.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ba.bild.code.Calculator;

public class CalculatorTest {

	Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void shouldSabratWhenPassDvaDoubleBroja() {
		double rezultat = calculator.sabiranje(1, 2);
		assertEquals(3,rezultat,0);
	}
	
	@Test
	public void shouldOduzetWhenPassDvaDoubleBroja() {
		double rezultat = calculator.oduzimanje(2, 2);
		assertEquals(0, rezultat, 0);
	}
	
	@Test
	public void shouldPomnozitWhenPassDvaDoubleBroja() {
		double rezultat = calculator.mnozenje(1, 2);
		assertEquals(2,rezultat,0);
	}
	
	@Test
	public void shouldPodijelitWhenPassDvaDoubleBroja() {
		double rezultat = calculator.dijeljenje(2, 2);
		assertEquals(1,rezultat,0);
	}

}
