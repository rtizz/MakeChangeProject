package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//Initial variable and prompts

		double price;
		double amountTendered;

			System.out.print("Please enter the price of the item: ");
			price = scan.nextDouble();
			scan.nextLine();

			System.out.print("Please enter the amount of money tendered: ");
			amountTendered = scan.nextDouble();
			scan.nextLine();
			
// Turning both dollars and decimals into individual whole numbers
			double change = (amountTendered - price);// initial amount of change
			int dollarChange = (int) (change); // cast to int to give a whole number to dollars remaining

			double centsPreCast = (change - dollarChange) * 100; // extracts the cents from dollars and converts the cents to whole number and remove from dollars before casting
			double centChange = centsPreCast + .005; // adding .005 to account for remaining decimals for rounding
			int finalCent = (int) centChange; // ensures cents is rounded to its respective true value.
			
//Response for Exact change or too little

			if (amountTendered < price) {
				System.err.print("Error: amount tendered is less than price.");
			} else if (amountTendered == price) {
				System.out.print("Perfect Change. Thank you!");
			}
			
//Extra-just cleans up the aesthetic look
			if ((finalCent < 10 && finalCent > 1) || finalCent == 1) {
			System.out.print("Your total change is " + dollarChange + "." + "0" + finalCent + ": ");
			totalDollars(dollarChange);
			totalCents(finalCent);
			System.out.println();
			} else if (finalCent > 10) {
			System.out.print("Your total change is " + dollarChange + "." + finalCent + ": ");
			totalDollars(dollarChange);
			totalCents(finalCent);
			System.out.println();
			} else if (finalCent == 0){
			System.out.print("Your total change is " + dollarChange + "." + "0" + finalCent + ": ");
			totalDollars(dollarChange);
			totalCents(finalCent);
			System.out.println();
			}
			scan.close();
	}// main

// method for dollars
	public static void totalDollars(int dollars) {
		int jackson;
		int hamilton;
		int lincoln;
		int washington;
//twenty
		jackson = dollars / 20;
		if (jackson == 0) {
			System.out.print("");
		}
		if (jackson > 1) {
			System.out.print(jackson + " twenty dollar bills, ");
		} else if (jackson == 1) {
			System.out.print(jackson + " twenty dollar bill, ");
		}
//ten
		dollars = dollars % 20;
		hamilton = dollars / 10;
		if (hamilton == 0) {
			System.out.print("");
		} else {
			System.out.print(hamilton + " ten dollar bill, ");
		}
//five		
		dollars = dollars % 10;
		lincoln = dollars / 5;
		if (lincoln == 0) {
			System.out.print("");
		} else {
			System.out.print(lincoln + " five dollar bill, ");
		}
//one		
		dollars = dollars % 5; 
		washington = dollars / 1;
		if (dollars > 1) {
			System.out.print(washington + " one dollar bills, ");
			} else if (washington == 1) {
				System.out.print(washington + " one dollar bill, ");
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
		cents = cents % 25;
//dimes
		dime = cents / 10;
		if (dime == 0) {
			System.out.print("");
		} else if (dime > 2) {
			System.out.print(dime + " dimes, "); 
		} else {
			System.out.print(dime + " dime, ");
		}
		cents = cents % 10; 
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
