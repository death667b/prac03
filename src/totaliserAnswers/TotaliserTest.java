package totaliserAnswers;

import static org.junit.Assert.*;

import org.junit.Test;

import totaliserQuestion.Totaliser;

public class TotaliserTest {

	@Test
	public void test() {

		/*Cant do type double
		 * int out of range
		 * cant do string
		 * console.log(myTest.getSum()); (console cannot beresolved)
		 * erros on boolean
		 * error on null, blank
		 */
		
		Totaliser myTest = new Totaliser();
		int	boo = 5;
		myTest.enterValue(boo*-1);
		myTest.enterValue(1);
		myTest.getSum();
		
		
	}

}
