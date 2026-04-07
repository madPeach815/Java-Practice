import java.util.Collections;

public class PracticeJava2 {
	
	public static void main(String[] args) {

		//Sort ArrayList
		//Write a java program to sort a given array list.
		//if the Class Type is String. it has built-in Sorting. Alphabetical(A-Z)
		//if it is Integer, also has built-in sorting. Numerical (1-10)
		//but if the class type is like Car, you must define it.
		//Can I fix String sort, like Z to A?
		//Yes, Use Collections.sort(fruit, collections.reverseOrder());
		// If the arrayList contains {"A", "b", "a", "c"...}, what will be the order after sorting?
		//Uppercase First rule. 
		
		
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("Apple");
		fruit.add("kiwi");
		fruit.add("Kiwi");
		fruit.add("watermelon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("Orange");
		
		System.out.println("Before sorting \n" + fruit);
		Collections.sort(fruit);
		System.out.println("After sorting \n" + fruit);
		
	}
}
