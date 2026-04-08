//Try This! Write a utility method called adjustInRange(int[] nums, int min, int max)
//That takes an array of integers and checks each element, if the value is > max,
//replace it with max, or if it's less than min, replace it with min. 


import java.util.Arrays;


public class PracticeJava2 {

	public int[] adjustInRange(int[] nums, int min, int max) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				nums[i] = min;
			}
			if (nums[i] > max) {
				nums[i] = max;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] scores = {90, 0, 101, 100, 120, -2, 88, -3};
		
		PracticeJava2 p = new PracticeJava2();
		p.adjustInRange(scores, 0, 100);
		System.out.println(Arrays.toString(scores));
	}
}
