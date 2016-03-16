package allSameAnswer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import allSameQuestion.AllSameA;
import allSameQuestion.AllSameB;
import allSameQuestion.AllSameC;

public class AllSameTests {

	private AllSameA a;
	private AllSameB b;
	private AllSameC c;
	
	private final int[] testArrayNotSame = {1,2,3};
	private final int[] testArraySame = {1,1,1};
	private final int[] testEmptyArray = {};
	private final int[] testArrayWithNegitive = {1,2,-3};
	private final int[] testArrayWithZero = {0,1,2};
	private final int[] testArrayBackwards = {2,1,3};
	private final int[] testArrayAllZero = {0,0,0};
	private final int[] testArrayAllNegitive = {-1,-1,-1};
		
	@Before
	public void setup(){
		a = new AllSameA();
		b = new AllSameB();
		c = new AllSameC();
	}
	
	@Test
	public void testBasicArrayASame() throws Exception {
		assertTrue(a.same(testArraySame));
	}
	
	@Test
	public void testBasicArrayBSame() throws Exception {
		assertTrue(b.same(testArraySame));
	}
	
	@Test
	public void testBasicArrayCSame() throws Exception {
		assertTrue(c.same(testArraySame));
	}
	
	@Test
	public void testBasicArrayANotSame() throws Exception {
		assertFalse(a.same(testArrayNotSame));
	}
	
	@Test
	public void testBasicArrayBNotSame() throws Exception {
		assertFalse(b.same(testArrayNotSame));
	}
	
	@Test
	public void testBasicArrayCNotSame() throws Exception {
		assertFalse(c.same(testArrayNotSame));
	}
	
	@Test(expected=Exception.class)
	public void testExceptionANoNumbers() throws Exception {
		a.same(testEmptyArray);
	}
	
	@Test(expected=Exception.class)
	public void testExceptionBNoNumbers() throws Exception {
		b.same(testEmptyArray);
	}
	
	@Test(expected=Exception.class)
	public void testExceptionCNoNumbers() throws Exception {
		c.same(testEmptyArray);
	}
	
	@Test(expected=Exception.class)
	public void testExceptionAWithNegitiveNumbers() throws Exception {
		a.same(testArrayWithNegitive);
	}
	
	@Test(expected=Exception.class)
	public void testExceptionBWithNegitiveNumbers() throws Exception {
		b.same(testArrayWithNegitive);
	}
	
	@Test(expected=Exception.class)
	public void testExceptionCWithNegitiveNumbers() throws Exception {
		c.same(testArrayWithNegitive);
	}
	
	@Test
	public void testArrayWithZeroA() throws Exception {
		assertFalse(a.same(testArrayWithZero));
	}
	
	@Test
	public void testArrayWithZeroB() throws Exception {
		assertFalse(b.same(testArrayWithZero));
	}
	
	@Test
	public void testArrayWithZeroC() throws Exception {
		assertFalse(c.same(testArrayWithZero));
	}
	
	@Test
	public void testArrayBackwardsA() throws Exception {
		assertFalse(a.same(testArrayBackwards));
	}
	
	@Test
	public void testArrayBackwardsB() throws Exception {
		assertFalse(b.same(testArrayBackwards));
	}
	
	@Test
	public void testArrayBackwardsC() throws Exception {
		assertFalse(c.same(testArrayBackwards));
	}
	
	@Test
	public void testArrayAllZeroA() throws Exception {
		assertTrue(a.same(testArrayAllZero));
	}
	
	@Test
	public void testArrayAllZeroB() throws Exception {
		assertTrue(b.same(testArrayAllZero));
	}
	
	@Test
	public void testArrayAllZeroC() throws Exception {
		assertTrue(c.same(testArrayAllZero));
	}
	
	@Test(expected=Exception.class)
	public void testArrayAllNegitiveA() throws Exception {
		assertTrue(a.same(testArrayAllNegitive));
	}
	
	@Test(expected=Exception.class)
	public void testArrayAllNegitiveB() throws Exception {
		assertTrue(b.same(testArrayAllNegitive));
	}
	
	@Test(expected=Exception.class)
	public void testArrayAllNegitiveC() throws Exception {
		assertTrue(c.same(testArrayAllNegitive));
	}
}
