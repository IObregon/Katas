package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class _BerlinClockTest {
	
	BerlinClock bc = new BerlinClock();
	
	@Test
	public void getSeconds_EvenNumberGiven_ReturnsOnLamp() throws Exception {
		assertEquals("Y", bc.getSeconds(2));
	}
	
	@Test
	public void getSeconsd_NotEvenNumberGiven_ReturnsOffLamps() throws Exception {
		assertEquals("O", bc.getSeconds(3));
	}

	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getTopHours(5));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(2).length());
	}
	
	@Test
	public void getBottomHours_Every1Hours_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getBottomHours(1));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
		assertEquals("Y", bc.getTopMinutes(10).subSequence(1, 2));
	}
	
	@Test
	public void getTopMinutes_Every15Minutes_ReturnsOneMoreRedOnLamp() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_Every1Minute_Returns1MoreOnLamp() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
	}
	
	@Test
	public void getBerlinHour_AnyHourGiven_Returns5ElementsArray() throws Exception {
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_AnyCorrectHourGiven_ReturnsBerlinHour() throws Exception {
		String[] assertion = {"Y", "RROO", "RRRR", "YYRYYRYOOOO", "YYYY"};
		assertEquals(assertion, bc.getBerlinHour("14:39:52"));
	}
}
