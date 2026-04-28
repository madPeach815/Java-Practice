	/*
	 * Write a recursive solution to return the index of the first occurrence of an
	 * element in an array. For example, given arr = {2, 5, 6, 3, 8, 9} and
	 * searching for 6, the method will return 2. If searching for 7 the method will
	 * return -1 (not found).
	 */

	public int firstIndex(int[] arr, int target) {
		
		return firstIndexAux(arr, target, 0);
	}
	
	public int firstIndexAux(int[] arr, int target, int index) {
		if(index >= arr.length) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		return firstIndexAux(arr, target, index+1);
	}
