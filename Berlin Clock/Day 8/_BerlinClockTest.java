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
	public void getSeconds_AnyEvenNumberGiven_ReturnsOnLamp() throws Exception {
		assertEquals("Y", bc.getSeconds(2));
		assertEquals("Y", bc.getSeconds(4));
		assertEquals("Y", bc.getSeconds(10));
	}
	
	@Test
	public void getSeconds_NotEvenNumberGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(1));
		assertEquals("O", bc.getSeconds(3));
		assertEquals("O", bc.getSeconds(5));
	}
	
	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getTopHours(5));
		assertEquals("RROO", bc.getTopHours(10));
		assertEquals("RRRR", bc.getTopHours(20));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
	}
	
	@Test
	public void getBottomHours_Every1Hour_ReturnOneMoreOnLamp() throws Exception {
		assertEquals("ROOO", bc.getBottomHours(1));
		assertEquals("RRRR", bc.getBottomHours(14));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lmaps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOneMoreOnLamp() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
		assertEquals("Y", bc.getTopMinutes(10).subSequence(1, 2));
	}
	@Test
	public void getTopMinutes_Every15Minutes_ReturnsOneRedLamp() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
		assertEquals("R", bc.getTopMinutes(30).subSequence(5, 6));
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
	public void getBerlinHour_AnyHourGiven_Returns5ElementsArray() throws Exception {
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_OneCorrectHourGiven_ReturnsTheCorrectBelinTime() throws Exception {
		String [] assertion = {"Y", "RRRO", "RRRO", "YYRYYRYOOOO", "YYYO"};
		assertEquals(assertion, bc.getBerlinHour("18:38:02"));
	}
	
	
	
	
	

	
}
