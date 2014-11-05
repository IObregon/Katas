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
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
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
	public void getTopMinutes_Every5Minutes_ReturnsOneMoreOnLamps() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
	}
	
	@Test
	public void getTopMinutes_Every15Minutes_ReturnsOneMoreRedLamp() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_Every1Minute_ReturnsOneMoreLamp() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
	}
	
	@Test
	public void getBerlinHour_AnyTimeGiven_Returns5ElementsString() throws Exception {
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_AnyCorrectTimeGiven_ReturnsTheCorrectBerlinHour() throws Exception {
		String[] assertion = {"Y","RRRO", "RRRR", "YYRYYRYYRYO", "YYYY"};
		assertEquals(assertion, bc.getBerlinHour("19:54:56"));
	}
	
}
