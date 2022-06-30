import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	
	//creates scanner object
	Scanner keyboard = new Scanner(System.in);
	
	
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor creates a default array size of 3, each element initialised to 0.0f
	 */
	public Numbers() {
		numbers = new Float[3];
		for(int i = 0; i<numbers.length;i++) {
			numbers[i]=0.0f;
		}
		numItems = 0;
	}

	/**
	 * Constructor that initialises the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		//creates array with size of given value, each element initialised to 0.0f
		numbers = new Float[size];
		for(int i = 0; i<numbers.length;i++) {
			numbers[i]=0.0f;
		}
		numItems = 0;
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		//if the array is full, message is displayed
		if(numbers.length == numItems) {
			System.out.println("Array full");
		}else {
		//value is added to array
		System.out.println("Enter value:");
		Float value = keyboard.nextFloat();
		numbers[numItems] = value;
		numItems+=1;
		}
	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		//creates a total of all array elements
		float sum = 0.0f;
		for(int i=0; i<numItems;i++) {
			sum += numbers[i];
		}
		
		//divides sum of all elements by the size of the array to get the mean average
		float average = sum/numbers.length;
		
		//returns average
		return (float) average;
	}
	/**
	 * Prints the numbers on the array as a string
	 */
	@Override
	public String toString() {
		//StringBuilder class creates a string of all elements in array, except for if the element is 0.0f
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] != 0.0f) {
				builder.append(numbers[i] + "\n");
			}
		}
		//joined string is created
		String joined = builder.toString();
		//joined string returned
		return joined;
	}
	/**
	 * returns the average of elements in array, the minimum and maximum values in the array, and also returns modulo between those values.
	 */
	public void findMinMax() {
		//average is printed first
		System.out.print("Average is: " + calcAverage());
		
		//array is sorted from lowest to highest, minimum is first element, highest is last element
		Arrays.sort(numbers);
		float min = numbers[0];
		float max = numbers[numbers.length-1];
		
		//finding modelo for max and min
		float maxModMin = max % min;
		
		System.out.print(", Minimum value is: " + min + ", Maximum value is: " + max + ", max mod min is: " + maxModMin + "\n\n");
		
	}
	
}
