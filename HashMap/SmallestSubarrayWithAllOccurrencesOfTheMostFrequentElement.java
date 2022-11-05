package HashMap;

import java.util.*;

public class SmallestSubarrayWithAllOccurrencesOfTheMostFrequentElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		solution(arr);

	}

	public static void solution(int[] arr) {
		HashMap<Integer, int[]> map = new HashMap<>();
		int mele = arr[0];
		int li = 0;
		int ri = 0;
		int freq = 1;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])==true) {
				int[] b = map.get(arr[i]);
				b[1] = i;
				b[2]++;
				map.put(arr[i], b);
				if (b[2] > freq) {
					mele = arr[i];
					li = b[0];
					ri = b[1];
					freq = b[2];
				}
				if (b[2] == freq) {
					if((b[1]-b[0])<(li-ri)) {
						mele = arr[i];
						li = b[0];
						ri = b[1];
						freq = b[2];
					}
				}
			} else {
				int[] a = new int[3];
				a[0] = i;
				a[1] = i;
				a[2] = 1;
				map.put(arr[i], a);
			}
		}
		
		System.out.println(mele);
		System.out.println(li);
		System.out.println(ri);
		
	}

}
