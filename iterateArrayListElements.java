import java.util.ArrayList;

public class PracticeJava2 {

	public static void main(String[] args) {

		// Write a java program to iterate through all elements in an array list.
		// This practice is from w3resource.com

		ArrayList<String> names = new ArrayList<String>();
		names.add("Jemma");
		names.add("Max");
		names.add("Jenny");

		for (String name : names) {
			System.out.print(name + ", ");
		}

		System.out.println();

		for (int i = 0; i < names.size(); i++) {
			if (i == names.size() - 1) {
				System.out.print(names.get(i));
			} else {
				System.out.print(names.get(i) + ", ");
			}
		}
		// without last ", "
	}
}
