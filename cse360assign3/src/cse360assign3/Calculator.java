package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * Initializes the total to 0 for the calculator.
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the total for the calculations
	 * 
	 * @return total of the calculations
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the number to the total
	 * 
	 * @param value the number you want to add
	 */
	
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts the number from the total
	 * 
	 * @param value the number you want to subtract
	 */
	
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the number to the total
	 * 
	 * @param value the number you want to multiply
	 */
	
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides the number from the total
	 * 
	 * @param value the number you want to divide with
	 */
	
	public void divide (int value) {
		if (value != 0){
			total = total / value;
		}
		else{
			total = 0;
		}
	}
	
	/**
	 * Prints out the history of the calculator
	 * 
	 * @return a string of the history
	 */
	public String getHistory () {
		return "";
	}
}
