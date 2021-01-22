import java.util.ArrayList;
import java.util.LinkedList;

public class ShiftTest {

	public static void main(String[] args) {
		double runtime = 0;
		double index = 1;
		while(runtime < 5000) {
			int number = (int) Math.pow(2.00, index);
			int[] testData = RandomGenerator.generateArray(0, 10, number);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) {
				long start = System.currentTimeMillis();
				int lastDigit = testData[testData.length -1];
				for(int x = testData.length - 1; x > 0; x--) {
					testData[x] = testData[x-1];
				}
				testData[0] = lastDigit;
				long end = System.currentTimeMillis();
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
			}
			System.out.println("Array - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			
			ArrayList<Integer> testList = new ArrayList<Integer>(number);
			testList = RandomGenerator.generateArrayList(0, 10, number);
			min = 99999999;
			max = 0;
			singleTime = 0;
			for(int y = 0; y < 10; y++) {
				
				long start = System.currentTimeMillis();
				int lastDigit = testList.get(testList.size()-1);
				for(int x = testList.size() - 1; x > 0; x--) {
					testList.set(x, testList.get(x-1));
				}
				testList.set(0, lastDigit);
				long end = System.currentTimeMillis();
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
			}
			System.out.println("ArrayList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
		
			LinkedList<Integer> testLinked = new LinkedList<Integer>();
			testLinked = RandomGenerator.generateLinkedList(0, 10, number);
			min = 99999999;
			max = 0;
			singleTime = 0;
			for(int y = 0; y < 10; y++) {
				long start = System.currentTimeMillis();
				int lastDigit = testLinked.get(testLinked.size()-1);
				for(int x = testLinked.size() - 1; x > 0; x--) {
					testLinked.set(x, testLinked.get(x-1));
				}
				testLinked.set(0, lastDigit);
				long end = System.currentTimeMillis();
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
			}
			System.out.println("LinkedList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			index++;
			}
		System.out.println("Runtime exceeded!");
	}
}
