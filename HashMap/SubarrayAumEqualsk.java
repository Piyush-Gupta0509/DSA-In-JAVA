package HashMap;

import java.util.HashMap;

public class SubarrayAumEqualsk {

	public static void main(String[] args) {
		int[] nums = { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, 7, 6, 2, 1 };
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,1);
		int count = 0;
		int sum=0;
		int k=5;
		for(
		int num:nums)
		{
			sum += num;
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		System.out.println( count);

	}

}
