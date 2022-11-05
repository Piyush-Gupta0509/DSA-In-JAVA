package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfSubarraysWithEqualNumberOf0s1sAnd2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int count = 0;

		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		String key = (c1 - c0) + "#" + (c2 - c1);
		HashMap<String, Integer> map = new HashMap<>();
		map.put(key, 1);

		for (int val : arr) {
			if (val == 0) {
				c0++;
			} else if (val == 1) {
				c1++;
			} else {
				c2++;
			}

			key = (c1 - c0) + "#" + (c2 - c1);
			if (map.containsKey(key)) {
				count += map.get(key);
			}
			map.put(key, map.getOrDefault(key, 0) + 1);

		}
		return count;
	}
}
