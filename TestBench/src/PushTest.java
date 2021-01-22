import java.util.ArrayList;
import java.util.LinkedList;

public class PushTest {

	public static void main(String[] args) {
		double runtime = 0;
		double listTotalTime = 0;
		double linkTotalTime = 0;
		int runs = 0;
		double index = 1;
		while(runtime < 5000) {
			int number = (int) Math.pow(2.00, index);
			ArrayList<Integer> testList = new ArrayList<Integer>(number);
			testList = RandomGenerator.generateArrayList(0, 10, number);
			long start = System.currentTimeMillis();
			int lastDigit = testList.get(testList.size()-1);
			testList.add(0, );
			testList.set(0, lastDigit);
			long end = System.currentTimeMillis();
			runtime = end - start;
			arrayTotalTime += runtime;
			System.out.println("List: The average time is " + arrayTotalTime/(index-1) + " milliseconds at index " + index);
		
			LinkedList<Integer> testLinked = new LinkedList<Integer>();
			testLinked = RandomGenerator.generateLinkedList(0, 10, number);
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
