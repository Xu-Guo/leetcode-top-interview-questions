package topinterviewquestions;

import java.util.HashMap;

public class Problem_0001_TwoSum {

	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}

}
