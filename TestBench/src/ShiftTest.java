import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ShiftTest {

	public static void main(String[] args) {
		double runtime = 0;
		double arrayTotalTime = 0;
		double listTotalTime = 0;
		double linkTotalTime = 0;
		int runs = 0;
		double index = 1;
		while(runtime < 5000) {
			int number = (int) Math.pow(2.00, index);
			int[] testData = RandomGenerator.generateArray(0, 10, 8*number);
			long start = System.currentTimeMillis();
			int lastDigit = testData[testData.length -1];
			for(int x = testData.length - 1; x > 0; x--) {
				testData[x] = testData[x-1];
			}
			testData[0] = lastDigit;
			long end = System.currentTimeMillis();
			runtime = end - start;
			arrayTotalTime += runtime;
			System.out.println("Array: The average time is " + arrayTotalTime/(index-1) + " milliseconds at index " + index);
			
			ArrayList<Integer> testList = new ArrayList<Integer>(8*number);
			testList = RandomGenerator.generateArrayList(0, 10, 8*number);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) {
				
				start = System.currentTimeMillis();
				lastDigit = testList.get(testList.size()-1);
				for(int x = testList.size() - 1; x > 0; x--) {
					testList.set(x, testList.get(x-1));
				}
				testList.set(0, lastDigit);
				end = System.currentTimeMillis();
				runtime = end - start;
				arrayTotalTime += runtime;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
			}
			System.out.println("Size: " + (8*number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			runtime = end - start;
			arrayTotalTime += runtime;
			System.out.println("List: The average time is " + arrayTotalTime/(index-1) + " milliseconds at index " + index);
		
			LinkedList<Integer> testLinked = new LinkedList<Integer>();
			testLinked = RandomGenerator.generateLinkedList(0, 10, 8*number);
			start = System.currentTimeMillis();
			lastDigit = testLinked.get(testLinked.size()-1);
			for(int x = testLinked.size() - 1; x > 0; x--) {
				testLinked.set(x, testLinked.get(x-1));
			}
			testLinked.set(0, lastDigit);
			end = System.currentTimeMillis();
			runtime = end - start;
			linkTotalTime += runtime;
			System.out.println("LinkedList: The average time is " + linkTotalTime/(index-1) + " milliseconds at index " + index);
			index++;
			}
		System.out.println("Runtime exceeded!");
	}
}
