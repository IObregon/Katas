package prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@Test
	public void testReturnsFizzWhenDivisibleBy3(){
		assertEquals("Fizz", fizzbuzz.getResult(3));
	}
	
	@Test
	public void testReturnsBuzzWhenDivisibleBy5(){
		assertEquals("Buzz", fizzbuzz.getResult(5));
	}
	
	@Test
	public void testReturnsFizzBuzzWhenDivisibleBy15(){
		assertEquals("FizzBuzz", fizzbuzz.getResult(15));
		assertEquals("FizzBuzz", fizzbuzz.getResult(30));
	}
	
	@Test
	public void testIfNothingMatchesReturnsTheNumberAsString(){
		assertEquals("2", fizzbuzz.getResult(2));
	}
}
