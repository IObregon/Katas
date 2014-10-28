package kata;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class _BerlinClockTest {
	BerlinClock bc = new BerlinClock();
	
	@Test
	public void getSeconds_NumberTwoGiven_ReturnsOnLamp() throws Exception {
		assertEquals("Y", bc.getSeconds(2));
	}
	
	@Test
	public void getSeconds_NumberThreeGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(3));
	}
	
	@Test
	public void getSeconds_PeerNumberGiven_ReturnsOnLamp() throws Exception {
		assertEquals("Y", bc.getSeconds(4));
	}
	
	@Test
	public void getSeconds_NotPeerNumberGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(5));
	}
	
	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOnLamps() throws Exception {
		assertEquals("ROOO", bc.getTopHours(5));
		assertEquals("RROO", bc.getTopHours(10));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
	}
	
	@Test
	public void getBottomHours_EveryHour_ReturnsOnLamps() throws Exception {
		assertEquals("ROOO", bc.getBottomHours(1));
		assertEquals("RROO", bc.getBottomHours(2));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOnLamps() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).substring(0, 1));
		assertEquals("Y", bc.getTopMinutes(10).substring(1, 2));
	}
	
	@Test
	public void getTopMinutes_Every15minutes_ReturnsRedLamps() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).substring(2, 3));
		
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_EveryMinute_ReturnsOnLamps() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
	}
	
	@Test
	public void getBerlinHour_AnyTimeGiven_ReturnsFiveElementsArray() throws Exception {
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_OneCorrectTimeGiven_ReturnsBerlinHour() throws Exception {
		String assertion[] = {"Y", "RROO", "RROO", "YYRYYROOOOO", "YOOO"}; 
		assertEquals(assertion, bc.getBerlinHour("12:31:02"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
