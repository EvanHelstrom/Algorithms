import java.util.ArrayList;
import java.util.LinkedList;

public class RandomGenerator {
	public static void main(String[] args) {
		if(args.length > 0) {
		if(args[0].equals("array")){
			generateArray(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else if(args[0].equals("arraylist")) {
			generateArrayList(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else if(args[0].equals("linkedlist")) {
			generateLinkedList(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else {
			System.out.println("Missing data type argument!");
		}
		} else {
			System.out.println("No Arguments Passed! Requires Three!");
		}
	}
	
	public static ArrayList<Integer> generateArrayList(int min, int max, int number) {
		ArrayList<Integer> output = new ArrayList<Integer>(number);
		for(int i = 0; i < number; i++) {
			int rand = (int) (Math.random() * (max - min + 1) + min);
			output.add(rand);
			//System.out.println(rand);
		}	
		return output;
	}
	public static LinkedList<Integer> generateLinkedList(int min, int max, int number) {
		LinkedList<Integer> output = new LinkedList<Integer>();
		for(int i = 0; i < number; i ++) {
			int rand = (int) (Math.random() * (max - min + 1) + min);
			output.add(rand);
			//System.out.println(rand);
		}
		return output;
	}
	public static int[] generateArray(int min, int max, int number) {
		int[] output = new int[number];
		for(int i = 0; i < number; i++) {
			int rand = (int) (Math.random() * (max - min + 1) + min);
			output[i] = rand;
			//System.out.println(rand);
		}
		return output;
	}

}
