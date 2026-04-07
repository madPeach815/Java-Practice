import java.util.ArrayList;

public class PracticeJava2 {

	public static void main(String[] args) {

		// Write a java program to create an array list, add some colors (strings)
		// and print out the collection.
		// This practice is from w3resource.com

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("orange");
		colors.add("green");

		System.out.println(colors.toString());
		System.out.println(colors);
		// Same result. with [ ]
		
		for(String color : colors) {
			System.out.print(color + " ");
		}
		// Same values but without [ ] 

	}
}
