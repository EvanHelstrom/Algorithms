import java.util.ArrayList;
import java.util.LinkedList;

public class PushTest {
	
	/**
	 * Instructions for test:
	 * 		Comment out one of the method calls in the main method
	 * 		The other test will run until memory limit is reached or a timeout occurs
	 * 		Data will be output to console
	 * 		Switch which method is commented out, and repeat
	 */
	public static void main(String[] args) {
		testLinkedList();
		testArrayList();
	}
	
	/**
	 * Run the PushTest on a LinkedList
	 * @return void but prints the test time to console.
	 */
	public static void testLinkedList() {
		double runtime = 0;
		double index = 1;
		boolean exe = true;
		while(exe) { // While the runtime of an attempt is less than 5 seconds
			int number = (int) Math.pow(2.00, index); // Determine the size for testing
			double min = 99999999;
			double max = 0;
			double singleTime = 0;	
			for(int y = 0; y < 10; y++) {
				LinkedList<Integer> testLinked = new LinkedList<Integer>(); // Declare test data
				testLinked = RandomGenerator.generateLinkedList(0, 10, number); // Generate random test data
				long start = System.currentTimeMillis(); // Start the time
				testLinked.addFirst(1); // Add a 1 to the front
				long end = System.currentTimeMillis(); // Stop the time
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;} // If its the first run or the runtime was smaller, replace min
				if(y == 0 || runtime > max){max = runtime;} // If its the first run or the runtime was smaller, replace max
				singleTime += runtime;
				if(runtime > 5000) {exe = false;} // If runtime exceedes 5 seconds end runs
			}
			System.out.println("LinkedList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			index++;
			}
		System.out.println("Runtime exceeded!");
	}
		
	/**
	 * Run the PushTest on an Arraylist
	 * @return void but prints the test time to console.
	 */
	public static void testArrayList() {
		double runtime = 0;
		double index = 1;
		boolean exe = true;
		while(exe) { // While the runtime of an attempt is less than 5 seconds
			int number = (int) Math.pow(2.00, index); // Determine the size for testing
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) { // Run this test 10 times
				ArrayList<Integer> testList = new ArrayList<Integer>(number); // Declare the test data
				testList = RandomGenerator.generateArrayList(0, 10, number); // Fill the test data
				long start = System.currentTimeMillis(); // Start the time
				testList.add(0, 1); // Add a 1 to index 0
				long end = System.currentTimeMillis(); // Stop the time
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;} // If its the first run or the runtime was smaller, replace min
				if(y == 0 || runtime > max){max = runtime;} // If its the first run or the runtime was smaller, replace max
				singleTime += runtime;
				if(runtime > 5000) {exe = false;} // If runtime exceedes 5 seconds end runs
			}
			System.out.println("ArrayList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			index++;
		}
		System.out.println("Runtime exceeded!");
	}
}
