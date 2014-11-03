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
		assertEquals("Y", bc.getSeconds(4));
		assertEquals("Y", bc.getSeconds(6));
	}
	
	@Test
	public void getSeconds_NotEvenNumberGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(1));
	}
	
	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getTopHours(5));
		assertEquals("RRRO", bc.getTopHours(15));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
	}
	
	@Test
	public void getBottomHours_Every1Hour_ReturnOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getBottomHours(1));
		assertEquals("RRRR", bc.getBottomHours(4));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(5).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
		assertEquals("Y", bc.getTopMinutes(20).subSequence(3, 4));
	}
	@Test
	public void getTopMinutes_Every15Minutes_ReturnsOneRedLamp() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_Every1Minutes_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
		assertEquals("YYYY", bc.getBottomMinutes(4));
	}
	
	@Test
	public void getBerlinTime_AnyHourGiven_Returns5ElementsArray() throws Exception {
		assertEquals(5, bc.getBerlinTime("11:11:11").length);
	}
	
	@Test
	public void getBerlinTime_AnyCorrectHourGiven_ReturnsItHasBerlinTime() throws Exception {
		String [] assertion = { "Y", "RRRR", "RROO", "YYRYYRYYROO", "YYYY"};
		assertEquals(assertion, bc.getBerlinTime("22:49:52"));
	}
	
	
}
