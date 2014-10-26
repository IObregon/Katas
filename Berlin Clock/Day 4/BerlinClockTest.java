package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void testGetSecondsReturnsOnEvery2Seconds(){
		assertEquals("O", berlinClock.getSeconds(1));
		assertEquals("Y", berlinClock.getSeconds(2));
	}
	
	@Test
	public void testGetTopHoursReturns4Lamps(){
		assertEquals(4,berlinClock.getTopHours(2).length());
	}
	
	@Test
	public void testGetTopHoursReturnsRedEvery5Hours(){
		assertEquals("OOOO", berlinClock.getTopHours(1));
		assertEquals("ROOO", berlinClock.getTopHours(5));
		assertEquals("RRRR", berlinClock.getTopHours(20));
		
	}
	
	@Test
	public void testGetBottomHoursReturns4Lamps(){
		assertEquals(4, berlinClock.getBottomHours(1).length());
	}
	
	@Test
	public void testGetBottomHoursReturnRedEveryHour(){
		assertEquals("ROOO",berlinClock.getBottomHours(1));
		assertEquals("RRRR",berlinClock.getBottomHours(4));
	}
	
	@Test
	public void testGetTopMinutesReturns11Lamps() throws Exception {
		assertEquals(11,berlinClock.getTopMinutes(1).length());
		
	}
	@Test
	public void testGetTopMinutesReturnsRedLampEver15Minutes() throws Exception {
		assertEquals("R",berlinClock.getTopMinutes(15).subSequence(2, 3));
		assertEquals("R",berlinClock.getTopMinutes(30).subSequence(5, 6));
		assertEquals("R",berlinClock.getTopMinutes(45).subSequence(8, 9));
	}
	
	@Test
	public void testGetTopMinutesReturnsYellowEvery5Minutes() throws Exception {
		assertEquals("YOOOOOOOOOO", berlinClock.getTopMinutes(5));
		assertEquals("YYRYYRYYRYY", berlinClock.getTopMinutes(55));
	}
	
	@Test
	public void testGetBottomMinutesReturn4Lamps() throws Exception {
		assertEquals(4, berlinClock.getBottomMinutes(1).length());
	}
	
	@Test
	public void testGetBottomMinutesReturnYellowEvery1Minute() throws Exception {
		assertEquals("YOOO",berlinClock.getBottomMinutes(1));
		assertEquals("YYYY",berlinClock.getBottomMinutes(4));
	}
}
