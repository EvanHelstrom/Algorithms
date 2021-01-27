import java.util.ArrayList;
import java.util.LinkedList;

public class ShiftTest {

	
	/**
	 * Instructions for test:
	 * 		Comment out two of the method calls in the main method
	 * 		The other test will run until memory limit is reached or a timeout occurs
	 * 		Data will be output to console
	 * 		Switch which methods are commented out, and repeat
	 */
	public static void main(String[] args) {
		testArray();
		testArrayList();
		testLinkedList();
	}
	
	/**
	 * Run the ShiftTest on an Array
	 * @return void but prints the test time to console.
	 */
	public static void testArray() {
		double runtime = 0;
		double index = 1;
		boolean exe = true;
		while(exe) { // While the runtime of an attempt is less than 5 seconds
			int number = (int) Math.pow(2.00, index); // Determine the size for testing
			int[] testData = RandomGenerator.generateArray(0, 10, number);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) { // Run the test 10 times
				long start = System.currentTimeMillis(); //Start the time
				int lastDigit = testData[testData.length -1]; // Save the last digit
				for(int x = testData.length - 1; x > 0; x--) {
					testData[x] = testData[x-1]; // Move everything to the right starting at the end
				}
				testData[0] = lastDigit; // Add the original last digit to the front
				long end = System.currentTimeMillis(); // End the time
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime; // Total time for all the runs
				if(runtime > 5000) {exe = false;} // End the loop if they go over time
			}
			System.out.println("Array - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10)); // Print some data!
			index++;
		}
	}
	
	/**
	 * Run the ShiftTest on an ArrayList
	 * @return void but prints the test time to console.
	 */
	public static void testArrayList() {
			double index = 1;
			double runtime = 0;
			boolean exe = true;
			while(exe) { // While the runtime of an attempt is less than 5 seconds
				int number = (int) Math.pow(2.00, index); // Determine the size for testing
				ArrayList<Integer> testList = new ArrayList<Integer>(number);
				testList = RandomGenerator.generateArrayList(0, 10, number);
				double min = 99999999;
				double max = 0;
				double singleTime = 0;
				for(int y = 0; y < 10; y++) { // Run the test 10 times
					long start = System.currentTimeMillis(); // Start the time
					int lastDigit = testList.get(testList.size()-1); // Save the last digit
					for(int x = testList.size() - 1; x > 0; x--) {
						testList.set(x, testList.get(x-1)); // Move everything right
					}
					testList.set(0, lastDigit); // Set the first digit to be the original last digit
					long end = System.currentTimeMillis(); // End the time
					runtime = end - start;
					if(y == 0 || runtime < min){min = runtime;}
					if(y == 0 || runtime > max){max = runtime;}
					singleTime += runtime; // Total time for all the runs
					if(runtime > 5000) {exe = false;} // End the loop if they go over time
				}
				System.out.println("ArrayList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10)); // Print some data!
				index++;
			}
	}
	
	/**
	 * Run the ShiftTest on a LinkedList
	 * @return void but prints the test time to console.
	 */
	public static void testLinkedList() {
		double index = 1;
		double runtime = 0;
		boolean exe = true;
		while(exe) { // While the runtime of an attempt is less than 5 seconds
			int number = (int) Math.pow(2.00, index); // Determine the size for testing
			LinkedList<Integer> testLinked = new LinkedList<Integer>();
			testLinked = RandomGenerator.generateLinkedList(0, 10, number);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) { // Run the test 10 times
				long start = System.currentTimeMillis(); // Start the time
				int lastDigit = testLinked.get(testLinked.size()-1); // Save the last digit
				for(int x = testLinked.size() - 1; x > 0; x--) {
					testLinked.set(x, testLinked.get(x-1)); // Move everything to the right
				}
				testLinked.set(0, lastDigit); // Set the first digit to the original last digit
				long end = System.currentTimeMillis(); // End the time
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime; // Total time for all the runs
				if(runtime > 5000) {exe = false;} // End the loop if they go over time
			}
			System.out.println("LinkedList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10)); // Print some data!
			index++;
		}
	}
}
