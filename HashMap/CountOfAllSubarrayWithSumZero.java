package HashMap;

import java.util.*;

public class CountOfAllSubarrayWithSumZero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int count = 0;
		for (int val : arr) {
			sum += val;
			if (map.containsKey(sum)) {
				count += map.get(sum);
				map.put(sum, map.get(sum)+1);
			} else {
				map.put(sum, 1);

			}
		}

		return count;
	}

}
