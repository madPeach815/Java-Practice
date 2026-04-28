	/*
	 * Write a recursive solution to determine if an element is found in an array.
	 * For example, given arr = {2, 5, 6, 3, 8, 9} and searching for 6, the method
	 * will return true. If searching for 7 the method will return false
	 */

	public boolean findTarget(int[] arr, int target) {
		return findTargetAux(arr, target, 0);
		}
	
	public boolean findTargetAux(int[] arr, int target, int index) {
		if(index >= arr.length) {
			return false;
		}
		if(arr[index] == target) {
			return true;
		}
		return findTargetAux(arr, target, index+1);
	}
		
