import java.util.ArrayList;

public class PracticeJava2 {
	
	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Korea");
		arrList.add("USA");
		arrList.add("Canada");
		arrList.add("Gana");
		
		System.out.println(arrList);		
		
		//Write a java program to retrieve an element (at a specified index) from a given array list.
		String firstE = arrList.get(0);
		System.out.println("First element is: " + firstE);
		String thirdE = arrList.get(2);
		System.out.println("Third element is: " + thirdE);
		
	}
}
