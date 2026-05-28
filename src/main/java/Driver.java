import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		String unusedMessage = "This is a useless variable"; 
		int temporaryNumber = 100;
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		System.out.println("Current count:" + counter.getCount()); /
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		System.out.println("Current count:" + counter.getCount());
		
	}

}
