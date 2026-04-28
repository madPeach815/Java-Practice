	/*
	 * Write a recursive solution to traverse an ArrayList of String to find and
	 * replace a target with a new String value.
	 */
	
	public static int setTo(ArrayList<String> words, String target, String newValue) {
		return setToAux(words, target, newValue, 0);
	}
	
	public static int setToAux(ArrayList<String> words, String target, String newValue, int index) {
		int count =0;
		
		if(index >= words.size()) {
			return 0;
		}
		
		if(words.get(index).equals(target)) {
			count = 1;
			//words.add(index, newValue);
			//first time, I did, words.add(index, newValue) but if you add, it is just insert one more 
			//value in the index, and the old value will be stay after index. 
			//However we need to replace the value. in this case, we need to use set.
			words.set(index,  newValue);
		}
		return count + setToAux(words, target, newValue, index+1);
	}
