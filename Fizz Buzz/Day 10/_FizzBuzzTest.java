package prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class _FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void getResult_NumberOneGiven_ReturnsOneAsString() throws Exception {
		assertEquals("1", fb.getResult(1));
	}
	
	@Test
	public void getResult_NumberTwoGiven_ReturnsTwoAsString() throws Exception {
		assertEquals("2", fb.getResult(2));
	}

	@Test
	public void getResult_NumberThreeGiven_ReturnsFizz() throws Exception {
		assertEquals("Fizz", fb.getResult(3));
	}
	
	@Test
	public void getResult_NumberFiveGiven_ReturnsBuzz() throws Exception {
		assertEquals("Buzz", fb.getResult(5));
	}
	
	@Test
	public void getResult_NumberSixGiven_ReturnsFizz() throws Exception {
		assertEquals("Fizz", fb.getResult(6));
	}
	
	@Test
	public void getResult_NumberTenGiven_ReturnsBuzz() throws Exception {
		assertEquals("Buzz", fb.getResult(10));
	}
	
	@Test
	public void getResult_NumberFiftenGiven_ReturnsFizzBuzz() throws Exception {
		assertEquals("FizzBuzz", fb.getResult(15));
	}
	@Test
	public void getResult_NumberThirtyGiven_ReturnsFizzBuzz() throws Exception {
		assertEquals("FizzBuzz", fb.getResult(30));
	}
	
}
