public class Lab1 {
	
	/**
	 * This method prints a main menu to the user, that exits once the corresponding option is selected.
	 */
	private static void displayMainMenu() {
		System.out.println("Please select one of the following:");
		System.out.println("1. Initialise a default array");
		System.out.println("2. To specify the max size of the array");
		System.out.println("3. Add value to an array");
		System.out.println("4. Display values in the array");
		System.out.println("5. Display average of the values, minumum value, maximum value, maximum modulo minimum");
		System.out.println("6. To Exit");
	}

	/**
	 * @param args for main method
	 */
	public static void main(String[] args) {
		
		//ensuring only numeric values are entered for whole menu
		while(true) {
			try {
				
				
		//creating new Numbers object
		Numbers numbers = new Numbers();
		//creating loop condition for main menu
		boolean loop = true;
		
		
		
		//start of menu
		while(loop) {
			displayMainMenu();
			int option = numbers.keyboard.nextInt();
			
			//switch case for menu
			switch(option) {
			case 1:
				numbers = new Numbers();
				break;
			case 2:
				System.out.println("Enter new size of array: ");
				//user input is taken for array size
				int numbersLength = numbers.keyboard.nextInt();
				numbers = new Numbers(numbersLength);
				break;
			case 3:
				numbers.addValue(numbers.keyboard);
				break;
			case 4:
				System.out.println("Numbers are: \n" + numbers.toString());
				break;
			case 5: 
				numbers.findMinMax();
				break;
			case 6:
				System.out.println("Exiting...");
				numbers.keyboard.close();
				//loop condition is broken and is exited
				loop = false;
				break;
				default:
				
			}//end of switch
		}//end of menu loop
		
		}catch(Exception e) {
			System.out.println("Please enter an integer value");
		}
			
		}//end of try catch
		
		
	}

}
