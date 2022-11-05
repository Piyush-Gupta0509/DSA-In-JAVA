package HashMap;

import java.util.*;

public class EquivalentSubarray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		HashSet<Integer> set = new HashSet();
		for (int val : arr) {
			set.add(val);
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int i = 0;
		int j = 0;
		int ans = 0;

		while (j < arr.length) {
			while (map.size() != set.size() && j < arr.length) {
				//System.out.println(j);
				map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
				j++;
				
			}
			while (map.size() == set.size()) {
				ans += arr.length - j + 1;
				map.put(arr[i], map.get(arr[i]) - 1);
				if (map.get(arr[i]) == 0) {
					map.remove(arr[i]);
				}
				i++;

			}
		}
		System.out.println(ans);
	}

}
