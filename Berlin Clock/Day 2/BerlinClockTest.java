package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void testGetSecondsIsOnEvery2Seconds(){
		assertEquals("Y", berlinClock.getSeconds(2));
		assertEquals("O", berlinClock.getSeconds(1));
	}
	
	@Test
	public void testGetTopHourspReturns4Lamps(){
		assertEquals(4, berlinClock.getTopHours(7).length());
	}
	
	@Test
	public void testGetTopHoursReturnsRedLightEvery5Hours(){
		assertEquals("OOOO",berlinClock.getTopHours(1));
		assertEquals("ROOO",berlinClock.getTopHours(6));
		
	}
	
	@Test
	public void testGetBottomHoursReturns4Lamps(){
		assertEquals(4, berlinClock.GetBottomHours(7).length());
	}
	
	@Test
	public void testGetBottomHoursReturnsRedLightsEvery1Hours(){
		assertEquals("OOOO",berlinClock.GetBottomHours(5));
		assertEquals("ROOO",berlinClock.GetBottomHours(6));
		assertEquals("RROO",berlinClock.GetBottomHours(12));
	}
	
	@Test
	public void testGetTopMinutesReturns11lamps(){
		assertEquals(11, berlinClock.getTopMinutes(5).length());
	}
	
	
	@Test
	public void testGetTopMinutesReturnsRedEvery15Minutes(){
		assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(0));
		assertEquals("YYROOOOOOOO", berlinClock.getTopMinutes(15));
		assertEquals("YYRYYROOOOO", berlinClock.getTopMinutes(30));
		assertEquals("YYRYYRYYROO", berlinClock.getTopMinutes(45));
	}
	
	@Test
	public void testGetTopMinutesReturnsYellowLightEvery5Minutes(){
		assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(0));
		assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(1));
		assertEquals("YOOOOOOOOOO", berlinClock.getTopMinutes(6));
		assertEquals("YYRYYRYYRYY", berlinClock.getTopMinutes(55));
	}
	
	@Test 
	public void testGetBottomMinutesReturns4Lamps(){
		assertEquals(4, berlinClock.getBottomMinutes(7).length());
	}
	
	@Test
	public void testGetBottomMinutesReturnsYellowLightsEvery1Minute(){
		assertEquals("OOOO", berlinClock.getBottomMinutes(0));
		assertEquals("YOOO", berlinClock.getBottomMinutes(1));
		assertEquals("YYYY", berlinClock.getBottomMinutes(4));
	}

	

}
