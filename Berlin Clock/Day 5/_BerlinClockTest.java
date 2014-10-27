package kata;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class _BerlinClockTest {
	BerlinClock bc = new BerlinClock();
	
	@Test
	public void getSeconds_OneNumberGiven_ReturnsOneLight() throws Exception {
		assertEquals(1, bc.getSeconds(2).length());
	}
	
	@Test
	public void getSeconds_EvenNumberGiven_ReturnsY() throws Exception {
		assertEquals("Y", bc.getSeconds(2));
	}
	
	@Test
	public void getSeconds_NotEvenNumberGiven_ReturnsO() throws Exception {
		assertEquals("O", bc.getSeconds(3));
	}
	
	@Test
	public void getTopHours_OneNumberGiven_ReturnsFourLamps() throws Exception {
		assertEquals(4, bc.getTopHours(3).length());
	}
	
	@Test
	public void getTopHours_NumberFiveGiven_ReturnsTheFirstLigthOn() throws Exception {
		assertEquals("ROOO", bc.getTopHours(5));
	}
	
	@Test
	public void getTopHours_NumberTeenGiven_ReturnsTheFirstAndSecondLigthOn() throws Exception {
		assertEquals("RROO", bc.getTopHours(10));
	}
	
	@Test
	public void getBottomHours_OneNumberGiven_ReturnsFourLamps() throws Exception {
		assertEquals(4, bc.getBottomHours(5).length());
	}
	
	@Test
	public void getBottomHours_NumberOneGiven_ReturnsROOO() throws Exception {
		assertEquals("ROOO", bc.getBottomHours(1));
	}
	
	@Test
	public void getBottomHours_NumberTwoGiven_ReturnsRROO() throws Exception {
		assertEquals("RROO", bc.getBottomHours(2));
	}
	
	@Test
	public void getTopMinutes_OneNumberGiven_ReturnsElevenLamps() throws Exception {
		assertEquals(11, bc.getTopMinutes(1).length());
	}
	
	@Test
	public void getTopMinutes_NumberFiveGiven_ReturnsYOOOOOOOOOO() throws Exception {
		assertEquals("YOOOOOOOOOO", bc.getTopMinutes(5));
	}
	
	@Test
	public void getTopMinutes_NumberTeenGiven_ReturnsYYOOOOOOOOO() throws Exception {
		assertEquals("YYOOOOOOOOO", bc.getTopMinutes(10));
	}
	
	@Test
	public void getTopMinutes_NumberFifTeenGiven_ReturnsYYROOOOOOOO() throws Exception {
		assertEquals("YYROOOOOOOO", bc.getTopMinutes(15));
	}
	
	@Test
	public void getTopMinutes_NumberThirtyGiven_ReturnsYYRYYROOOOO() throws Exception {
		assertEquals("YYRYYROOOOO", bc.getTopMinutes(30));
	}
	
	@Test
	public void getBottomMinutes_OneNumberGiven_ReturnsFourLamps() throws Exception {
		assertEquals(4, bc.getBottomMinutes(1).length());
	}
	
	@Test
	public void getBottomMinutes_NumberOneGiven_ReturnsYOOO() throws Exception {
		assertEquals("YOOO", bc.getBottomMinutes(1));
	}
	
	@Test
	public void getBottomMinutes_NumberTwoGiven_ReturnsYYOO() throws Exception {
		assertEquals("YYOO", bc.getBottomMinutes(2));
	}
	@Test
	public void getBerlinHour_OneStringGiven_ReturnsFiveElemtnsArray() throws Exception {
		assertEquals(5, bc.getBerlinHour("").length);
	}
	
	@Test
	public void getBerlinHour_OneCorrectStringGiven_ReturnsCorrectBerlinHour() throws Exception {
		String[] assertion = { "Y", "RROO", "RRRO", "YYRYYRYYOOO", "YYOO" };
		String hour = "13:42:22";
		assertEquals(assertion, bc.getBerlinHour(hour));
	}
	

	
}
