	/*
	 * Write a recursive solution to count the number of occurrences of a String in
	 * an ArrayList of String elements.
	 */
	
	public static int count(ArrayList<String> words, String target) {
		return countAux(words, target, 0);
	}

	public static int countAux(ArrayList<String> words, String target, int index) {
		int count = 0;
		
		if(words.size() <= index) {
			return 0;
		}
		if(words.get(index).equals(target)) {
			count += 1;
		}
		return count + countAux(words, target, index+1);	
	}
