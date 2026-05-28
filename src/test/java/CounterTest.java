package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i < 10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		assertEquals(0, testCounter.getCount());
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) {
			testCounter.increment();
			assertEquals(i, testCounter.getCount());
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) {
			testCounter.decrement();
			assertEquals(i * -1, testCounter.getCount());
		}
	}

	@Test
	public void testIncreaseAndDecreaseBy() {
		Counter testCounter = new Counter();
		
		testCounter.increaseBy(5);
		assertEquals(5, testCounter.getCount());
		
		testCounter.decreaseBy(3);
		assertEquals(2, testCounter.getCount());
	}

	@Test
	public void testMultiplicationAndTriple() {
		Counter testCounter = new Counter();
		
		testCounter.increaseBy(2); 
		testCounter.multiplyBy(4);  
		assertEquals(8, testCounter.getCount());
		
		testCounter.triple();      
		assertEquals(24, testCounter.getCount());
	}

	@Test
	public void testPowerByAndEvenOddLogic() {
		Counter testCounter = new Counter();
		
		assertTrue(testCounter.isCountEven());
		
		testCounter.increment(); 
		assertFalse(testCounter.isCountEven());
		
		testCounter.powerBy(2);
		assertEquals(3, testCounter.getCount());
	}
}
