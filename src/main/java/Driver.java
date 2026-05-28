package src.main.java;
import src.main.java.Counter;

public class Driver {

	private static final String CURRENT_COUNT_MSG = "Current count:";

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println(CURRENT_COUNT_MSG + counter.getCount());
		
		counter.increment();
		
		System.out.println(CURRENT_COUNT_MSG + counter.getCount());
		
		counter.decrement();
		
		System.out.println(CURRENT_COUNT_MSG + counter.getCount());
		
	}

}
