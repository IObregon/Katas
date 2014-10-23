package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	
	BerlinClock bc = new BerlinClock();
	
	@Test
	public void testYellowChangeEvery2Seconds(){
		assertEquals("Y", bc.getSeconds(0));
		assertEquals("O", bc.getSeconds(1));
		assertEquals("O", bc.getSeconds(59));
	}
	
	@Test
	public void testTopRedShouldLightEvery5Hours(){
		assertEquals("RRRR", bc.getTopHours(24));
		assertEquals("OOOO", bc.getTopHours(0));
		assertEquals("RROO", bc.getTopHours(13));
		assertEquals("RRRR", bc.getTopHours(23));
	}
	
	@Test
	public void testBottomRedShouldLightEvery1Hour(){
		assertEquals("OOOO", bc.getBottomHours(0));
		assertEquals("RRRO", bc.getBottomHours(13));
		assertEquals("RRRO", bc.getBottomHours(23));
		assertEquals("RRRR", bc.getBottomHours(24));
	}
	
	@Test
	public void testTopMinutesShouldHaveRedIn3rd6th9th(){
		assertEquals("R", bc.getTopMinutes(15).subSequence(2, 3));
		assertEquals("R", bc.getTopMinutes(30).subSequence(5, 6));
		assertEquals("R", bc.getTopMinutes(45).subSequence(8, 9));
	}
	
	@Test
	public void testTopYellowShouldLightEvery5Minutes(){
		assertEquals("OOOOOOOOOOO", bc.getTopMinutes(0));
		assertEquals("YYOOOOOOOOO", bc.getTopMinutes(11));
		assertEquals("YYROOOOOOOO", bc.getTopMinutes(15));
		assertEquals("YYRYOOOOOOO", bc.getTopMinutes(21));
		assertEquals("YYRYYROOOOO", bc.getTopMinutes(30));
		assertEquals("YYRYYRYOOOO", bc.getTopMinutes(36));		
		assertEquals("YYRYYRYYROO", bc.getTopMinutes(45));
		assertEquals("YYRYYRYYRYO", bc.getTopMinutes(51));		
	}
	
	@Test
	public void testBottomYellowShouldLightEvery1Minute(){
		assertEquals("OOOO", bc.getBottomMinutes(0));
		assertEquals("YOOO", bc.getBottomMinutes(11));
		assertEquals("YYOO", bc.getBottomMinutes(17));
		assertEquals("YYYO", bc.getBottomMinutes(23));
		assertEquals("YYYY", bc.getBottomMinutes(24));
		assertEquals("YYYY", bc.getBottomMinutes(59));		
	}

}
