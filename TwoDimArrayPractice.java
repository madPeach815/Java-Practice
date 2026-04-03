// This is from UMD OOP1 class slide "W9L2 Two=Dim Arrays "Try This". 

package allThePractice;

import java.util.Arrays;

public class PracticeJava2 {
	/*
	 * Create a two-dim array of ints that represent the number of items sold over a
	 * week. The rows represent the different items(for example, you sell three
	 * varieties of cookies) and the columns represent the days of the week.
	 * 
	 * 
	 * Write the helper methods
	 */

	// 1. printSales() Display all of the values in the array

	private static String printSales(int[][] sales) {

		/* First attempt
		 * first time, I coded like that, but the format is not nice, rows should be
		 * clearly distinguished.
		 * 
		 * String print = "";
		 * for (int row = 0; row < sales.length; row++) { for (int col = 0; col <
		 * sales[row].length; col++) { print += sales[row][col] + " "; } } return print;
		 * }
		 */

		
		/* Second attempt : the format is improved but since I use String, it use many memory. 
		 * try to change to StringBuffer.
		 * 	String print = "";
		 * 	for (int row = 0; row < sales.length; row++) {
			print += "Total of the " + row + " line: ";
			for (int col = 0; col < sales[row].length; col++) {
				print += sales[row][col] + " ";
			}
			print += "\n";
		}
		 */
		StringBuffer print = new StringBuffer();
		for (int row = 0; row < sales.length; row++) {
			print.append("Total of the ").append(row).append(" line: "); 
			for (int col = 0; col < sales[row].length; col++) {
				print.append(sales[row][col]).append(" ");
			}
			print.append("\n");
		}
		return print.toString();
	}

	// 2. totalQtySold() Calculate and return the sum of the values
	private static int totalQtySold(int[][] sales) {
		int sum = 0;
		for (int row = 0; row < sales.length; row++) {
			for (int col = 0; col < sales[row].length; col++) {
				sum += sales[row][col];
			}
		}
		return sum;
	}

	// 3. itemTotals() return array of sums for each row
	private static int[] itemTotals(int[][] sales) {
		int[] sumOfEach = new int[sales.length];

		/*
		 * first time I tried this way. but it is hard coded. int sumFirst = 0; int
		 * sumSec = 0; int sum3rd = 0; for (int row = 0; row < sales.length; row++) {
		 * for (int col = 0; col < sales[row].length; col++) { if (row == 0) { sumFirst
		 * += sales[0][col]; } else if (row == 1) { sumSec += sales[1][col]; } else {
		 * sum3rd += sales[2][col]; } } } sumOfEach[0] = sumFirst; sumOfEach[1] =
		 * sumSec; sumOfEach[2] = sum3rd;
		 * 
		 * return sumOfEach;
		 */

		int sum = 0;
		for (int row = 0; row < sales.length; row++) {
			int rowTotal = 0;
			for (int col = 0; col < sales[row].length; col++) {
				rowTotal += sales[row][col];
			}
			sumOfEach[row] = rowTotal;
		}

		return sumOfEach;
	}

	public static void main(String[] args) {

		int[][] weeklySales = { { 3, 4, 5, 6, 5, 7, 10 }, { 11, 12, 13, 14, 10, 3, 2 }, { 5, 15, 2, 1, 6, 7, 10 } };

		System.out.println(printSales(weeklySales));
		System.out.println(totalQtySold(weeklySales));
		System.out.println(Arrays.toString(itemTotals(weeklySales)));

	}
}
