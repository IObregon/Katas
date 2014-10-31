package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class _BerlinClockTest {
	BerlinClock bc;
	
	@Before
	public void setUp(){
		bc = new BerlinClock();
	}
	
	@Test
	public void getSeconds_EvenNumberGiven_ReturnsOnLamp() throws Exception {
		assertEquals("Y", bc.getSeconds(2));
		assertEquals("Y", bc.getSeconds(4));
	}
	
	@Test
	public void getSeconds_NotEvenNumberGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(1));
		assertEquals("O", bc.getSeconds(3));
	}
	
	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("OOOO", bc.getTopHours(1));
		assertEquals("ROOO", bc.getTopHours(5));
		assertEquals("RROO", bc.getTopHours(10));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
	}
	
	@Test
	public void getBottomHours_EveryOneHour_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("OOOO", bc.getBottomHours(5));
		assertEquals("ROOO", bc.getBottomHours(1));
		assertEquals("RRRR", bc.getBottomHours(4));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
		assertEquals("Y", bc.getTopMinutes(10).subSequence(1, 2));
		assertEquals("Y", bc.getTopMinutes(55).subSequence(9, 10));
	}
	
	@Test
	public void getTopMinutes_Every15Minutes_returnsOneRedLamp() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
		assertEquals("R", bc.getTopMinutes(30).subSequence(5, 6));
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_EveryOneMinute_ReturnsOnLamps() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
		assertEquals("YYYY", bc.getBottomMinutes(4));
	}
	
	@Test
	public void getBerlinHour_AnyCorrectHourGiven_Returns5ElementsArray() throws Exception {
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_AnyCorrectHourGiven_ReturnsCorrectBerlinTime() throws Exception {
		String [] assertion = {"Y", "RRRR", "RRRO", "YYRYYRYYRYO", "YYOO"};
		assertEquals(assertion, bc.getBerlinHour("23:52:52"));
	}
	
	
	
	

	
}
