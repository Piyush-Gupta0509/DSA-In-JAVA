package HashMap;

import java.util.*;

public class LargestSubarrayWithContiguousElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int n = arr.length;
		int ans = 0;

		for (int i = 0; i < n - 1; i++) {
			int maxv = arr[i];
			int minv = arr[i];
			HashSet<Integer> set = new HashSet<>();
			set.add(arr[i]);
			
			for (int j = i + 1; j < n; j++) {
				if (set.contains(arr[j])) {
					break;
				}
				set.add(arr[j]);
				minv = Math.min(minv, arr[j]);
				maxv = Math.max(maxv, arr[j]);

				if (maxv - minv == j - i) {
					int len = j - i + 1;
					if (len > ans) {
						ans = len;
					}
				}
			}
		}

		return ans;
	}

}
