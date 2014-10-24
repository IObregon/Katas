package prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@Test
	public void testReturnsFizzIfTheNumberIsDivisibleBy3(){
		assertEquals("Fizz", fizzbuzz.getResult(3));
	}

	@Test
	public void testReturnsBuzzIfTheNumberIsDivisibleBy5(){
		assertEquals("Buzz", fizzbuzz.getResult(5));
	}
	
	@Test
	public void testReturnsFizzBuzzIfTheNumberIsDivisibleBy15(){
		assertEquals("FizzBuzz", fizzbuzz.getResult(15));
		assertEquals("FizzBuzz", fizzbuzz.getResult(30));
	}
	
	@Test
	public void testReturnsTheNumberAsStringIfNotMatchingOther(){
		assertEquals("2", fizzbuzz.getResult(2));
		assertEquals("1", fizzbuzz.getResult(1));
	}
}
