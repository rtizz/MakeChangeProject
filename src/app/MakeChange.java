package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);

///////***Initial variable and prompts***/////////////////////////////////////////////////////////////////

		double price;
		double amountTendered;

		System.out.println("Please enter the price of the item.");
		price = scan.nextDouble();

		System.out.println("Please enter the amount of money tendered");
		amountTendered = scan.nextDouble();
		scan.close();

///////***Response for Exact change or too little***//////////////////////////////////////////////////////

		if (amountTendered < price) {
			System.out.print("Thats not enough, please visit an ATM, and return when you have enough.");
		} else if (amountTendered == price) {
			System.out.print("Perfect Change!!! Thank you!!");
		}

///////***Setting up variables for nested if statements///////////////////////////////////////////////////	

		double change = (amountTendered - price);// initial amount of change
		int dollarChange = (int) (change); // updated to give a whole number to dollars remaining
		double centsPreCast = (change - dollarChange) * 100; // converts decimals whole number - trailing decimals
		
		double centChange = centsPreCast; // + .005; // casting to int removes trailing decimals
		int finalCent = (int) centChange; // ensures cents is rounded to its respective ceiling.

		//totalDollars(dollarChange);
		//totalCents(finalCent);
		


		int twenty;
		int ten;
		int five;
		int one;
		
		int quarter;
		int dime;
		int nickel;
		int penny;
		
		
		
		//test Run Dollars
		
		// 79
		twenty = dollarChange / 20;
		System.out.print(twenty + " twenty dollar bills, "); //3
		if (twenty == 1) {
			System.out.print(twenty + " twenty dollar bill, ");
		}
		dollarChange = dollarChange % 20; //19
		ten = dollarChange / 10;
		System.out.println(ten + " ten dollar bill");
		
		//.79
		//testRunCents
		quarter = finalCent / 25; 
		System.out.println(quarter + " quarters, "); //3
		finalCent = finalCent % 25;
		
		dime = finalCent / 10;
		System.out.println(dime + " dime, ");
		finalCent = finalCent % 10;
		
		nickel = finalCent / 5;
		System.out.println(nickel + " nickel, ");
		finalCent = finalCent % 5;
		
		//penny = final
		
		
		
	}// main

	// method for dollars
	public static void totalDollars(int dollars) {
		int remaining;
		int output;

		if (dollars > 20) {
			output = dollars / 20;
			System.out.print(output + " twenty dollar bill, ");
			remaining = dollars - (output * 20);

			if (remaining > 10) {
				output = remaining / 10;
				System.out.print(output + " ten dollar bill, ");
				remaining = remaining - (output * 10);
				if (remaining > 5) {
					output = remaining / 5;
					System.out.print(output + " five dollar bill, ");
					remaining = remaining - (output * 5);
					if (remaining > 1) {
						output = remaining / 1;
						System.out.print(output + " dollar bills");
					} else if (remaining == 1) {
						output = remaining;
						System.out.print(output + " dollar bill.");
					}
				}
			}
			if (remaining > 5) {
				output = remaining / 5;
				System.out.print(output + " five dollar bill, ");
				remaining = remaining - (output * 5);
				if (remaining > 1) {
					output = remaining / 1;
					System.out.print(output + " dollar bills");
				} else if (remaining == 1) {
					output = remaining;
					System.out.print(output + " dollar bill.");
				}
			}
		}
	}

	// method for cents
	public static void totalCents(int cents) {
		System.out.println(cents);

	}
}// class
