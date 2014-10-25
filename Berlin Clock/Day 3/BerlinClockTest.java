package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void test1LampsReturnsYellowEverySecond(){
		assertEquals("O", berlinClock.getSeconds(1));
		assertEquals("Y", berlinClock.getSeconds(2));
	}

	@Test
	public void testGetTopHourLightsReturn4Lamps(){
		assertEquals(4, berlinClock.getTopHours(5).length());	
	}
	
	@Test
	public void testGetTopHoursReturnRedEvery5Hours(){
		assertEquals("OOOO",berlinClock.getTopHours(1));
		assertEquals("ROOO",berlinClock.getTopHours(5));
		assertEquals("RRRR",berlinClock.getTopHours(24));
	}
	
	@Test
	public void testButtonHourReturns4Lamps(){
		assertEquals(4,berlinClock.getBottomHours(5).length());
	}
	
	@Test
	public void testButtonHoursReturnsRedEveryHour(){
		assertEquals("OOOO",berlinClock.getBottomHours(0));
		assertEquals("ROOO",berlinClock.getBottomHours(1));
		assertEquals("RRRR",berlinClock.getBottomHours(4));
	}
	
	@Test
	public void testTopMinutesReturns11Lamps(){
		assertEquals(11,berlinClock.getTopMinutes(0).length());
	}
	
	@Test
	public void testTopMinutesReturnsYellowEvery5Minutes(){
		assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(0));
		assertEquals("YOOOOOOOOOO", berlinClock.getTopMinutes(5));
		assertEquals("YYOOOOOOOOO", berlinClock.getTopMinutes(10));
	}
	
	@Test
	public void testTopMinutesReturnRedEvery15Minutes(){
		assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(0));
		assertEquals("YYROOOOOOOO", berlinClock.getTopMinutes(15));
		assertEquals("YYRYYROOOOO", berlinClock.getTopMinutes(30));
		assertEquals("YYRYYRYYROO", berlinClock.getTopMinutes(45));
	}
	
	@Test
	public void testBottomMinutesReturns4Lamps(){
		assertEquals(4,berlinClock.getBottomMinutes(0).length());
	}
	
	@Test
	public void testBottomMinutesReturnsYellowEvery1Minute(){
		assertEquals("OOOO",berlinClock.getBottomMinutes(0));
		assertEquals("YOOO",berlinClock.getBottomMinutes(1));
		assertEquals("YYYY",berlinClock.getBottomMinutes(4));
	}
	

}
