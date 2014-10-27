package prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class _FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	@Test
	public void getResult_NumberDivisibleBy3_ReturnsFizz() throws Exception {

		assertEquals("Fizz", fb.getResult(3));
	}
	
	@Test
	public void getResult_NumberDivisibleBy5_ReturnsBuzz() throws Exception {
		assertEquals("Buzz",fb.getResult(5));
	}
	
	@Test
	public void getResult_NumberDivisibleBy15_ReturnsFizzBuzz() throws Exception {
		assertEquals("FizzBuzz",fb.getResult(15));
	}
	
	@Test
	public void getResult_NumberNotDivisibleBy3or5or15_ReturnsTheNumberAsString() throws Exception {
		assertEquals("1",fb.getResult(1));
	}
}
