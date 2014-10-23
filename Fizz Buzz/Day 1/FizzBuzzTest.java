package prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void getResultShouldBeFizzIfTheNumberIsDivisibleBy3(){
		assertEquals("Fizz", FizzBuzz.getResult(3));
	}
	@Test
	public void getResultShouldBeBuzzIfTheNumberIsDivisibleBy5(){
		assertEquals("Buzz", FizzBuzz.getResult(5));
	}
	
	@Test
	public void getResultShouldBeFizzBuzzIfTheNumberIsDivisibleBy15(){
		assertEquals("FizzBuzz", FizzBuzz.getResult(15));
	}
	
	@Test
	public void getResultShouldBeNumberToStringIfTheNumberIsNotDivisibleBy5_3_15(){
		assertEquals(Integer.toString(1),FizzBuzz.getResult(1));
		assertEquals(Integer.toString(2),FizzBuzz.getResult(2));
		assertEquals(Integer.toString(4),FizzBuzz.getResult(4));
	}

}
