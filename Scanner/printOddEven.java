/* Write a program that prompts the user for two integers. If either of the integers are negative, the program should print out "Invalid input" and no further computation should be performed. Otherwise, the program should print the sum of the two numbers and tell the user whether the sum is even or odd*/

public class PracticeJava2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int first = input.nextInt();
		System.out.print("Enther a number: ");
		int second = input.nextInt();
		
		if(first < 0 || second < 0) {
			System.out.println("Invalid input");
		} else {
			int sum = first + second;
      System.out.println("The sum is " + sum);
			if(sum % 2 == 0) {
				System.out.println("The sum is even");
			}else {
				System.out.println("The sum is odd");
			}
		}
		input.close();
	}
}
