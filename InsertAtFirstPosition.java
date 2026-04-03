public class PracticeJava2 {

	public static void main(String[] args) {

		// Write a Java program to insert an element into the array list at the first position.
		// This practice is from w3resource.com
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("Korea");
		countries.add("ButterLand");
		countries.add("Fillala");
		
		System.out.println(countries);
		
		countries.add(0, "USA");
		
		System.out.println(countries);
		
		countries.add(2, "Canada");
		
		System.out.println(countries);
		
	}
}
