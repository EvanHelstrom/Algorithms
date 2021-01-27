import java.util.ArrayList;
import java.util.LinkedList;

public class PushTest {

	public static void main(String[] args) {
		double runtime = 0;
		double index = 1;
		boolean exe = true;
		while(exe) {
			int number = (int) Math.pow(2.00, index);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;
			for(int y = 0; y < 10; y++) {
				ArrayList<Integer> testList = new ArrayList<Integer>(number);
				testList = RandomGenerator.generateArrayList(0, 10, number);
				long start = System.currentTimeMillis();
				testList.add(0, 1);
				long end = System.currentTimeMillis();
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
				if(runtime > 5000) {exe = false;}
			}
			System.out.println("ArrayList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			index++;
		}
		System.out.println("Runtime exceeded!");
		exe = true;
		while(exe) {
			int number = (int) Math.pow(2.00, index);
			double min = 99999999;
			double max = 0;
			double singleTime = 0;	
			for(int y = 0; y < 10; y++) {
				LinkedList<Integer> testLinked = new LinkedList<Integer>();
				testLinked = RandomGenerator.generateLinkedList(0, 10, number);
				long start = System.currentTimeMillis();
				testLinked.addFirst(1);
				long end = System.currentTimeMillis();
				runtime = end - start;
				if(y == 0 || runtime < min){min = runtime;}
				if(y == 0 || runtime > max){max = runtime;}
				singleTime += runtime;
				if(runtime > 5000) {exe = false;}
			}
			System.out.println("LinkedList - Size: " + (number) + " - Min: " + min + " - Max: " + max + " - Avg: " + (singleTime/10));
			index++;
			}
		System.out.println("Runtime exceeded!");
	}
}
