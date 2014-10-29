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
	}
	
	@Test
	public void getSeconds_NotEvenNumberGiven_ReturnsOffLamp() throws Exception {
		assertEquals("O", bc.getSeconds(3));
	}
	
	@Test
	public void getTopHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getTopHours(1).length());
	}
	
	@Test
	public void getTopHours_Every5Hours_ReturnsOnLamps() throws Exception {
		assertEquals("OOOO", bc.getTopHours(4));
		assertEquals("ROOO", bc.getTopHours(6));
		assertEquals("RROO", bc.getTopHours(13));
	}
	
	@Test
	public void getBottomHours_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomHours(1).length());
	}
	
	@Test
	public void getBottomHours_Every1Hour_ReturnsOnLamps() throws Exception {
		assertEquals("OOOO", bc.getBottomHours(5));
		assertEquals("ROOO", bc.getBottomHours(1));
		assertEquals("RRRR", bc.getBottomHours(4));
	}
	
	@Test
	public void getTopMinutes_AnyNumberGiven_Returns11Lamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_Every5Minutes_ReturnsOnLamps() throws Exception {
		assertEquals("Y", bc.getTopMinutes(5).subSequence(0, 1));
		assertEquals("Y", bc.getTopMinutes(10).subSequence(1, 2));
	}
	
	@Test
	public void getTopMinutes_Every15Minutes_ReturnsRedOnLamps() throws Exception {
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
		assertEquals("R", bc.getTopMinutes(30).subSequence(5, 6));
	}
	
	@Test
	public void getBottomMinutes_AnyNumberGiven_Returns4Lamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_Every1Minute_ReturnsOnLamps() throws Exception {
		assertEquals("OOOO", bc.getBottomMinutes(5));
		assertEquals("YOOO", bc.getBottomMinutes(1));
		assertEquals("YYYY", bc.getBottomMinutes(4));
	}
	
	@Test
	public void getBerlinHour_AnyHourGiven_Returns5ElementsArray() throws Exception {
		
		assertEquals(5, bc.getBerlinHour("11:11:11").length);
	}
	
	@Test
	public void getBerlinHour_OneCorrectHourGiven_ReturnsCorrectBerlinHour() throws Exception {
		String assertion[] = {"Y", "RRRO", "RROO", "YYRYYRYYRYO", "YYOO"};
		assertEquals(assertion, bc.getBerlinHour("17:52:14"));
	}
	
	
	
	
	
	
	
	

	
}
