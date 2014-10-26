package prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void testReturnsOneAsString(){
		
		assertEquals("1", fb.getResult(1));
	}
	
	@Test
	public void testReturnsTwoAsString(){
		assertEquals("2", fb.getResult(2));
	}
	
	@Test
	public void testReturnsFizzWhenIsThree(){
		assertEquals("Fizz", fb.getResult(3));
	}
	
	@Test
	public void testReturnsFizzWhenDivisibleByThree(){
		assertEquals("Fizz",fb.getResult(6));
		assertEquals("Fizz",fb.getResult(9));
	}
	
	@Test
	public void testReturnsBuzzWhenIsFive(){
		assertEquals("Buzz", fb.getResult(5));
		
	}
	
	@Test
	public void testReturnsBuzzWhenDivisibleByFive(){
		assertEquals("Buzz", fb.getResult(10));
		assertEquals("Buzz", fb.getResult(20));
	}
	
	@Test
	public void testReturnsFizzBuzzWheIfFifteen(){
		assertEquals("FizzBuzz", fb.getResult(15));
	}
	
	@Test
	public void testReturnsFizzBuzzWhenDivisibleByFifteen(){
		assertEquals("FizzBuzz", fb.getResult(30));
	}
}
