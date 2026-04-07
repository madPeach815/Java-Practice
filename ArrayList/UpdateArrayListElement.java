public class PracticeJava2 {
	
	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Korea");
		arrList.add("USA");
		arrList.add("Canada");
		arrList.add("Gana");
		
		System.out.println(arrList);		
		
		//Update ArrayList Element
		//remove Canada and update to Japan
		
		arrList.remove(2);
		System.out.println("After removing Canada: " + arrList);
		//result after removing Canada from ArrayList 
		
		arrList.add(2, "Japan");
		System.out.println("After adding Japan: " + arrList);
		//result after adding Japan in the same spot.
		
		
		//However we can do that more efficiently using set.
		//set back to Canada.
		arrList.set(2, "Canada");
		System.out.println(arrList);

	}
}
