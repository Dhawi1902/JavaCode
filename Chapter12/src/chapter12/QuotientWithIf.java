package chapter12;

import java.util.Scanner;

public class QuotientWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two intergers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if (number2 != 0)
			System.out.println(number1 + " / " + number2 +
			" is " + (number1/number2));
		else
			System.out.println("Divisor cannot be zero");
	}

}
