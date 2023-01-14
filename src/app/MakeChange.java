package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 * we will calculate the amount of change returned to a customer based on the
		 * purchase price and the amount tendered. We will also notify the attendant how
		 * many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is
		 * needed to make the change for the customer. Change should be provided using
		 * the largest bill and coin denominations as possible. Denominations that are
		 * not used should not be displayed.
		 */

		double price = getitemPrice();
		double amountTendered = gettendered();
		double castChange = 0;
		double pennies; // unused ATM

		if (amountTendered < price) {
			System.out.print("Thats not enough, please visit an ATM, and return when you have enough.");
		} else if (amountTendered == price) {
			System.out.print("Perfect Change!!! Thank you!!");
		}

		// will need to convert doubles to nearest .XX (tenth)
		// dollars converted to floor dollar. = dollarChange
		// cents = whole number

		// Variable for change.

//Display an appropriate message if the customer provided too little money or the exact amount.
		// DICTATING OUTPUT IF CORRECT CHANGE OR NOT ENOUGH

		int hamilton = 0;
		int jackson = 0;
		int lincoln = 0;
		int washington = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		// int penny

		double change = amountTendered - price; // initial amount of change
		int dollarChange = (int) (change); // updated to give a whole number to dollars remaining
		double centsPreCast = (change - dollarChange) * 100; // converts decimals whole number - trailing decimals
																// remaining
		int centChange = ((int) centsPreCast); // casting to int removes trailing decimals
		centChange = centChange + 1; // ensures cents is rounded to its respective ceiling.
		// System.out.print(dollarChange + " ");
		// System.out.print(centChange);

// if statement for 20 or above testing again dollar change = 56.04 3.96 & 60
		if (dollarChange < 100 && dollarChange > 1) {
			hamilton = dollarChange / 20; // 2
			jackson = dollarChange % 20; // 16
			if (hamilton > 1) {
				System.out.print(hamilton + " twenty dollar bills, ");
			} else if (hamilton == 1) {
				System.out.print(hamilton + " twenty dollar bill, ");
			}
			if (jackson < 20 && jackson >= 10) {
				int jacksonOut = jackson / 10; // 1
				System.out.print(jacksonOut + " ten dollar bill, ");
				lincoln = jackson - 10; // 6
				if (lincoln > 5 && lincoln < 10) {
					int lincolnOut = lincoln / 5; // 1
					System.out.print(lincolnOut + " five dollar bill, ");
					washington = lincoln - 5;
					if (washington > 1) {
						System.out.println(washington + " one dollar bills, ");
					} else if (washington == 1) {
						System.out.println(washington + " one dollar bill, ");
					}
				} else if (lincoln < 5 && lincoln >= 1) {
					washington = lincoln;
					if (washington > 1) {
						System.out.println(washington + " one dollar bills, ");
					} else if (washington == 1) {
						System.out.println(washington + " one dollar bill, ");
					}
// *****else if for below 20 ***** testing again dollar change = 19.04 .96 % 20.00
				} else if (dollarChange < 20 && dollarChange > 1) {
					jackson = dollarChange % 10; // 9
					jacksonOut = jackson / 10; // 1
					System.out.println(jackson + " ten dollar bill, ");
					lincoln = jackson - 5; // 4
					if (lincoln > 5 && lincoln < 10) {
						int lincolnOut = lincoln / 5; // 1
						System.out.print(lincolnOut + " five dollar bill, ");
						washington = lincoln - 5;
						if (washington > 1) {
							System.out.println(washington + " one dollar bills, ");
						} else if (washington == 1) {
							System.out.println(washington + " one dollar bill, ");
						}
					} else if (lincoln < 5 && lincoln >= 1) {
						washington = lincoln;
						if (washington > 1) {
							System.out.println(washington + " one dollar bills, ");
						} else if (washington == 1) {
							System.out.println(washington + " one dollar bill, ");
						}
//					 
					}

				}
			}
		}
	} // end of dollarChange if statement
//cent if statement if more than 25 cents
//		if (centChange < 100 && centChange > 1) {
//			hamilton = dollarChange / 20; // 2
//			jackson = dollarChange % 20; // 16
//			if (hamilton > 1) {
//				System.out.print(hamilton + " twenty dollar bills, ");
//			} else if (hamilton == 1){
//				System.out.print(hamilton + " twenty dollar bill, ");
//			}
//			if (jackson < 20 && jackson >= 10) {
//				int jacksonOut = jackson / 10; // 1
//				System.out.print(jacksonOut + " ten dollar bill, ");
//				lincoln = jackson - 10; // 6
//				if (lincoln > 5 && lincoln < 10) {
//					int lincolnOut = lincoln / 5; // 1
//					System.out.print(lincolnOut + " five dollar bill, ");
//					washington = lincoln - 5;
//					if (washington > 1) {
//						System.out.println(washington + " one dollar bills, ");
//					} else if (washington == 1) {
//						System.out.println(washington + " one dollar bill, ");
//					}
//				} else if (lincoln < 5 && lincoln >= 1) {
//					washington = lincoln;
//					if (washington > 1) {
//						System.out.println(washington + " one dollar bills, ");
//					} else if (washington == 1) {
//						System.out.println(washington + " one dollar bill, ");
//					}
//// *****else if for below 25 *****
//				} else if (dollarChange < 20 && dollarChange > 1) {
//					jackson = dollarChange % 10; //9
//					jacksonOut = jackson / 10; // 1
//					System.out.println(jackson + " ten dollar bill, ");
//					lincoln = jackson - 5; // 4
//					if (lincoln > 5 && lincoln < 10) {
//							int lincolnOut = lincoln / 5; // 1
//							System.out.print(lincolnOut + " five dollar bill, ");
//							washington = lincoln - 5;
//							if (washington > 1) {
//								System.out.println(washington + " one dollar bills, ");
//							} else if (washington == 1) {
//								System.out.println(washington + " one dollar bill, ");
//							}
//						} else if (lincoln < 5 && lincoln >= 1) {
//							washington = lincoln;
//							if (washington > 1) {
//								System.out.println(washington + " one dollar bills, ");
//							} else if (washington == 1) {
//								System.out.println(washington + " one dollar bill, ");
//							}
////					 
//						}
//				}
//			}
//		}
//	}



// Price and tender Prompt methods // GET RID AND PLACE IN MAIN.

	public static double getitemPrice() {
		Scanner scan = new Scanner(System.in);
		double priceIn;
		System.out.println("Please enter the price of the item.");
		priceIn = scan.nextDouble();
		return priceIn;
	}

	public static double gettendered() {
		Scanner scan = new Scanner(System.in);
		double tenderOut;
		System.out.println("Please enter the amount of money tendered");
		tenderOut = scan.nextDouble();
		scan.close();
		return tenderOut;
	}

}