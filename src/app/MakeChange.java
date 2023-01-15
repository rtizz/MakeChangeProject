package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

///////***Initial variable and prompts***/////////////////////////////////////////////////////////////////

		double price;
		double amountTendered;
		
		System.out.println();
		System.out.print("Please enter the price of the item: ");
		price = scan.nextDouble();

		System.out.print("Please enter the amount of money tendered: ");
		amountTendered = scan.nextDouble();

///////***Response for Exact change or too little***//////////////////////////////////////////////////////

		if (amountTendered < price) {
			System.out.print("Thats not enough, please visit an ATM.");
		} else if (amountTendered == price) {
			System.out.print("Perfect Change!!! Thank you!!");
		}

///////***Setting up variables for nested if statements///////////////////////////////////////////////////	

		double change = (amountTendered - price);// initial amount of change
		int dollarChange = (int) (change); // cast to int to give a whole number to dollars remaining
		double centsPreCast = (change - dollarChange) * 100; // converting the cents to whole number and remove from
																// dollars
		double centChange = centsPreCast + .005; // adding .005 to account for remaining decimals for rounding
		// before casting
		int finalCent = (int) centChange; // ensures cents is rounded to its respective true value.

		if (change > .01) {
			System.out.print("Your total change is: ");
			totalDollars(dollarChange);
			totalCents(finalCent);
		}

		scan.close();

	}// main

// method for dollars
	public static void totalDollars(int dollars) {
		int jackson;
		int hamilton;
		int lincoln;
		int washington;
//82.30
		jackson = dollars / 20; // 4
		if (jackson == 0) {
			System.out.print("");
		}
		if (jackson > 1) {
			System.out.print(jackson + " twenty dollar bills, "); // 3
		} else if (jackson == 1) {
			System.out.print(jackson + " twenty dollar bill, ");
		}

		dollars = dollars % 20; // 2
		hamilton = dollars / 10;
		if (hamilton == 0) {
			System.out.print("");
		} else {
			System.out.print(hamilton + " ten dollar bill, ");
		}
		dollars = dollars % 10; // 2
		lincoln = dollars / 5;
		if (lincoln == 0) {
			System.out.print("");
		} else {
			System.out.print(lincoln + " five dollar bill, ");
		}
		dollars = dollars % 5; // 4
		if (dollars > 1) {
			washington = dollars / 1;
			if (washington == 0) {
				System.out.print("");
			}
			if (washington > 1) {
				System.out.print(washington + " one dollar bills, ");
			} else if (washington == 1) {
				System.out.print(washington + " one dollar bill, ");
			}
		} else {
			System.out.println();
		}

	}// End of totalDollars

// method for cents
	public static void totalCents(int cents) {

		int quarter;
		int dime;
		int nickel;
		int penny = 0;
//quarters
		quarter = cents / 25;
		if (quarter == 0) {
			System.out.print("");
		} else if (quarter > 1) {
			System.out.print(quarter + " quarters, ");
		} else {
			System.out.print(quarter + " quarter, ");
		}
		cents = cents % 25; // 24
//dimes
		dime = cents / 10;
		if (dime == 0) {
			System.out.print("");
		} else if (dime > 2) {
			System.out.print(dime + " dimes, "); // 2
		} else {
			System.out.print(dime + " dime, ");
		}
		cents = cents % 10; // 4
//nickels
		nickel = cents / 5;
		if (nickel == 0) {
			System.out.print("");
		} else {
			System.out.print(nickel + " nickel, ");
		}
		cents = cents % 5;
//pennies	
		penny = cents;
		if (penny == 0) {
			System.out.print("");
		} else if (penny > 1) {
			System.out.print(penny + " pennies.");
		} else if (penny == 1) {
			System.out.print(penny + " penny.");
		}
	} // End of totalCents

}// class
