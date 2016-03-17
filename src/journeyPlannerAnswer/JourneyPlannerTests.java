package journeyPlannerAnswer;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

import journeyPlannerQuestion.JourneyPlannerA;
import journeyPlannerQuestion.JourneyPlannerB;

public class JourneyPlannerTests {

	private JourneyPlannerA jpA;
	private JourneyPlannerB jpB;
	
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
	public void jpATestTwentyDistance() throws Exception {
		jpA = new JourneyPlannerA(1);
		jpA.setOrigin(0, 0);
		jpA.setDestination(10, 10);
		assertEquals(20, jpA.journeyTime());
	}

	@Test
	public void jpBTestTwentyDistance() throws Exception {
		jpB = new JourneyPlannerB(1);
		jpB.setOrigin(0, 0);
		jpB.setDestination(10, 10);
		assertEquals(20, jpB.journeyTime());
	}
	
	@Test
	public void jpATestNegitiveOriginForX() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setOrigin(-1, 0));
	}

	@Test
	public void jpBTestNegitiveOriginForX() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setOrigin(-1, 0));
	}
	
	@Test
	public void jpATestNegitiveOriginForY() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setOrigin(0, -1));
	}

	@Test
	public void jpBTestNegitiveOriginForY() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setOrigin(0, -1));
	}
	
	@Test
	public void jpATestNegitiveDestinationForX() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setDestination(-1, 0));
	}

	@Test
	public void jpBTestNegitiveDestinationForX() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setDestination(-1, 0));
	}
	
	@Test
	public void jpATestNegitiveDestinationForY() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setDestination(0, -1));
	}

	@Test
	public void jpBTestNegitiveDestinationForY() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setDestination(0, -1));
	}
	
	@Test(expected=Exception.class)
	public void jpATestZeroConstructor() throws Exception {
		jpA = new JourneyPlannerA(0);
	}

	@Test(expected=Exception.class)
	public void jpBTestZeroConstructor() throws Exception {
		jpB = new JourneyPlannerB(0);
	}
	
	@Test(expected=Exception.class)
	public void jpATestNegitiveConstructor() throws Exception {
		jpA = new JourneyPlannerA(-1);
	}

	@Test(expected=Exception.class)
	public void jpBTestNegitiveConstructor() throws Exception {
		jpB = new JourneyPlannerB(-1);
	}
	
	@Test
	public void jpATestOutOfBoundsOriginForX() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setOrigin(11, 0));
	}
	
	@Test
	public void jpBTestOutOfBoundsOriginForX() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setOrigin(11, 0));
	}
	
	@Test
	public void jpATestOutOfBoundsOriginForY() throws Exception {
		jpA = new JourneyPlannerA(1);
		assertFalse(jpA.setOrigin(0, 11));
	}
	
	@Test
	public void jpBTestOutOfBoundsOriginForY() throws Exception {
		jpB = new JourneyPlannerB(1);
		assertFalse(jpB.setOrigin(0, 11));
	}
}

