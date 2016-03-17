package journeyPlannerAnswer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import journeyPlannerQuestion.JourneyPlannerA;
import journeyPlannerQuestion.JourneyPlannerB;

public class JourneyPlannerTests {

	private JourneyPlannerA jpA;
	private JourneyPlannerB jpB;
	
	@Test
	public void jpATestZeroDistance() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertEquals(0, jpA.journeyTime());
	}

	@Test
	public void jpBTestZeroDistance() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertEquals(0, jpB.journeyTime());
	}
	
	@Test
	public void jpATestFiveDistance() throws Exception {
		jpA = new JourneyPlannerA(1);
		jpA.setOrigin(0, 0);
		jpA.setDestination(5, 0);
		assertEquals(5, jpA.journeyTime());
	}

	@Test
	public void jpBTestFiveDistance() throws Exception {
		jpB = new JourneyPlannerB(1);
		jpB.setOrigin(0, 0);
		jpB.setDestination(5, 0);
		assertEquals(5, jpB.journeyTime());
	}
	
	
}
