	/*
	 * Write a recursive solution that will return an ArrayList of Integers that are
	 * the indices of elements in an int array that are the same as the int target
	 * value.
	 * 
	 * for example, give the int arr = {2, 15, 1, 7, 8, 10, 11, 3, 2, 2, 5} and
	 * target = 2 The arrayList[0, 8, 9] will be returned.
	 */

	public ArrayList<Integer> indicesOfNumOfTarget(int[] arr, int target) {
		ArrayList<Integer> indices = new ArrayList<>();
		return indicesOfNumOfTargetAux(arr, target, indices, 0);
	}

	public ArrayList<Integer> indicesOfNumOfTargetAux(int[] arr, int target, ArrayList<Integer> arrList, int index) {

		if (arr.length <= index) {
			return arrList;
		}
		if (arr[index] == target) {
			arrList.add(index);
		}

		return indicesOfNumOfTargetAux(arr, target, arrList, index + 1);
	}
