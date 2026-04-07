import java.util.ArrayList;

public class PracticeJava2 {
	
	public static void main(String[] args) {

		//Search Element in ArrayList
		//Write a java program to search for an element in an array list.
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Korea");
		arrList.add("USA");
		arrList.add("Canada");
		arrList.add("Gana");
		arrList.add("Korea");
		
		System.out.println(arrList);		
		
		if(arrList.contains("Korea")) {
			System.out.println("We found it!");
		}else {
			System.out.println("There is not");
		}
		
		//Can we find specific index number too?
		
		if(arrList.contains("Korea")) {
			System.out.println("Yes, it is in index " + arrList.indexOf("Korea"));
		} else {
			System.out.println("No, There is not " + arrList.indexOf("China"));
		}
		
		if(arrList.contains("China")) {
			System.out.println("Yes, it is in index " + arrList.indexOf("Korea"));
		} else {
			System.out.println("No, There is not " + arrList.indexOf("China"));
		}
		
		System.out.println("The last index of \"Korea\" is " + arrList.lastIndexOf("Korea"));
	}
}
