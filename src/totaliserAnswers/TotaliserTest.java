package totaliserAnswers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import totaliserQuestion.Totaliser;

public class TotaliserTest {

	private Totaliser tot;
	private final int FIVE_NUMBER = 5;
	private final int NEG_NUMBER = -5;
	
	@Before
	public void setup() {
		tot = new Totaliser();
	}
	
	@Test
	public void testAddNegOneToPosOne() {
		tot.enterValue(1);
		tot.enterValue(-1);
		assertEquals(0, tot.getSum());
	}

	@Test
	public void testAddOneToOne(){
		tot.enterValue(1);
		tot.enterValue(1);
		assertEquals(2, tot.getSum());
	}
	
	@Test
	public void testFiftyFive(){
		tot.enterValue(55);
		assertEquals(55, tot.getSum());
	}
	
	@Test
	public void testReset(){
		tot.enterValue(55);
		tot.reset();
		assertEquals(0, tot.getSum());
	}
	
	@Test
	public void testAddFiveNumbers(){
		tot.enterValue(FIVE_NUMBER);
		tot.enterValue(FIVE_NUMBER);
		tot.enterValue(FIVE_NUMBER);
		tot.enterValue(FIVE_NUMBER);
		tot.enterValue(FIVE_NUMBER);
		assertEquals(25, tot.getSum());
	}
	
	@Test
	public void testAddTwoNegNumbers(){
		tot.enterValue(NEG_NUMBER);
		tot.enterValue(NEG_NUMBER);
		assertEquals(-10, tot.getSum());
	}
}
