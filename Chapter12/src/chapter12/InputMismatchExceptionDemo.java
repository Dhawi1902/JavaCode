package chapter12;

import java.util.*;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an Interger: ");
				int number = input.nextInt();
				
				System.out.println("The number entered is " + number);
				
				continueInput = false;
			}
			
			catch (InputMismatchException ex) {
				System.out.println("Try again. (" + 
					"Incorrect input: an interger is required)");
				input.nextLine();
				
			}
		}while (continueInput);
	}

}
