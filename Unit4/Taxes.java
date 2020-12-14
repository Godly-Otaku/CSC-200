package Unit4;

/*
Byron Washington
Unit 4 Project
10/10/2020
Calculating Tax Returns: 
User input: number of clients, filing status, and taxable income
Output: Tax return
*/
import java.util.Scanner;

public class Taxes {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		String lineBreak = "===============================";
		System.out.println(lineBreak);
		System.out.println("Enter the number of clients: ");
		int numofClient = scnr.nextInt();
		double finalOutput = 0;

		while (numofClient >= 0) {
			for (int i = 1; i <= numofClient; i++) {
				System.out.println("Client #" + i + " -");
				System.out.println("Enter the filing status: ");
				int filingStatus = scnr.nextInt();
				if (!(filingStatus >= 0) || !(filingStatus <= 3)) {
					System.out.println("Error: Wrong filing status! Please input a valid status.");
					System.out.println(lineBreak);
					System.exit(0);
				}
				System.out.println("Enter the taxable income: ");
				double input = scnr.nextDouble();

				switch ( filingStatus )  {	//Input is a filing status 0-3
					case 0:	//Single
						finalOutput = getRate(input, 8350, 8350, 33950, 25600, 82250, 48300, 171550, 89300, 372950, 201400);	//Ending value of tax rate, then value in between tax rate values	
						break;
					case 1:	//Married filing jointly or qualified widow(er)
						finalOutput = getRate(input, 16700, 16700, 67900, 51200, 137050, 69150, 208850, 71800, 372950, 164100);
						break;
					case 2:	//Married filing separately
						finalOutput = getRate(input, 8350, 8350, 33950, 25600, 68525, 34575, 104425, 35900, 186475, 82050);
						break;
					case 3:	//Head of household
						finalOutput = getRate(input, 11950, 11950, 45500, 33550, 117450, 71950, 190200, 72750, 372950, 182750);
						break;
					default:	//If filing status isn't valid
						System.out.println("Error: Wrong filing status! Please input a valid status.");
						System.exit(0);
				}
				System.out.printf("Tax Client #" + i + " is $%.2f%n", finalOutput);
				System.out.println(lineBreak);
			}
		scnr.close();
		System.exit(0);
		}	
	}
	public static double getRate(double taxIncome, int bottomTaxRate, int bottomTaxRange, int aTaxRate, int aTaxRange,  int bTaxRate, int bTaxRange, int cTaxRate, int cTaxRange, int topTaxRate, int topTaxRange) {
		double[][] rates = {{bottomTaxRate, 0.10, bottomTaxRange},
							{aTaxRate, 0.15, aTaxRange}, 
							{bTaxRate, 0.25, bTaxRange}, 
							{cTaxRate, 0.28, cTaxRange}, 
							{topTaxRate, 0.33, topTaxRange}};
		double finalTax = 0;
		if (taxIncome < bottomTaxRate) return taxIncome * .10;	//If it's in the lowest range, just do the bottom tax rate
		else if (taxIncome > topTaxRate) {	//If it's in the highest range, do all tax rates
			for (int i = 0; i < rates.length; i++) {
				finalTax += rates[i][2] * rates[i][1];
			}
			double remainder = taxIncome - topTaxRate;
			finalTax += remainder * .35;
		}
		else {
			for (int chunks = 0; chunks < rates.length; chunks++) { //If it's in the middle, check which tax rate it is less than
				if (taxIncome <= rates[chunks][0]) {
					for (int index = 0; index < chunks; index++) { //Incrememting the tax values
						finalTax += rates[index][2] * rates[index][1];
					}
					double remainder = taxIncome - rates[(chunks - 1)][0];	//Gets remaining value
					finalTax += remainder * rates[chunks][1];	//Taxes remaining value
					break;
				}
			}
		}
		return finalTax;
	}
}
/*  
===============================
Enter the number of clients:
2
Client #1 -
Enter the filing status:
0
Enter the taxable income:
100000
Tax Client #1 is $21720.00
===============================
Client #2 -
Enter the filing status:
1
Enter the taxable income:
300339
Tax Client #2 is $76932.87
===============================
*/