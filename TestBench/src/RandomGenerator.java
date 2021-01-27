/**
 * @author Evan Quist
 * Assignment 1
 * 1/27/2021
 */


import java.util.ArrayList;
import java.util.LinkedList;

public class RandomGenerator {
	public static void main(String[] args) {
		if(args.length > 0) { //Ensure arguments were passed through command line.
			
		if(args[0].equals("array")){ //Determine which operation is being used
			generateArray(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])); //Pass min, max, size
		} else if(args[0].equals("arraylist")) {
			generateArrayList(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else if(args[0].equals("linkedlist")) {
			generateLinkedList(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else {
			System.out.println("Missing data type argument!"); // If the data type argument is missing inform the user
		}
		} else {
			System.out.println("No Arguments Passed! Requires Three!"); // If no arguments are passed inform the user
		}
	}
	
	/**
	 * Generate an ArrayList of random numbers
	 * @param min - the lowest random number allowed to be generated
	 * @param max - the largest random number allowed to be generated
	 * @param number - the number of elements in the ArrayList, or size
	 * @return - ArrayList object with a minimum and maximum element value, of a specified size
	 */
	public static ArrayList<Integer> generateArrayList(int min, int max, int number) {
		ArrayList<Integer> output = new ArrayList<Integer>(number);
		for(int i = 0; i < number; i++) { //Loop to generate randoms and add to the ArrayList
			int rand = (int) (Math.random() * (max - min + 1) + min); //Returns a random number between min and max
			output.add(rand);
			//System.out.println(rand);
		}	
		return output;
	}
	
	/**
	 * Generate a LinkedList of random numbers
	 * @param min - the lowest random number allowed to be generated
	 * @param max - the largest random number allowed to be generated
	 * @param number - the number of elements in the LinkedList, or size
	 * @return - LinkedList object with a minimum and maximum element value, of a specified size
	 */
	public static LinkedList<Integer> generateLinkedList(int min, int max, int number) {
		LinkedList<Integer> output = new LinkedList<Integer>();
		for(int i = 0; i < number; i ++) { //Loop to generate randoms and add to the LinkedList
			int rand = (int) (Math.random() * (max - min + 1) + min); //Returns a random number between min and max
			output.add(rand);
			//System.out.println(rand);
		}
		return output;
	}
	
	/**
	 * Generate an Array of random numbers
	 * @param min - the lowest random number allowed to be generated
	 * @param max - the largest random number allowed to be generated
	 * @param number - the number of elements in the Array, or length
	 * @return - Array object with a minimum and maximum element value, of a specified length
	 */
	public static int[] generateArray(int min, int max, int number) {
		int[] output = new int[number];
		for(int i = 0; i < number; i++) { //Loop to generate randoms and add to the array
			int rand = (int) (Math.random() * (max - min + 1) + min); //Returns a random number between min and max
			output[i] = rand;
			//System.out.println(rand);
		}
		return output;
	}

}
