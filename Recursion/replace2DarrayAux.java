	/*
	 * Give a two-dim array of char values, find and replace a target value with a
	 * new value. For example, given the array:
	 * a a b c
	 * c b a d
	 * the target = 'a' and new value = 'x'
	 * will update the array to be:
	 * x x b c
	 * c b x d
	 */
	
	private static void replace(char[][] arr, char target, char newValue) {
		replaceAux(arr, target, newValue, 0, 0);
	}
	
	public static void replaceAux(char[][] arr, char target, char newValue, int row, int col) {
		if(row >= arr.length) {
			return;
			
			//row is bigger than arr's length means it is done. 
		}
		
		if(col >= arr[row].length) {
			replaceAux(arr, target, newValue, row + 1, 0);
			return;
			
			//if col is bigger than the col's length means you need to move to next row. 
			//but col should be reset to 0 for next row.
		}
		if(arr[row][col] == target) {
			arr[row][col] = newValue;
		}
		replaceAux(arr, target, newValue, row, col+1);
		//you need to move to next col. 
	}
