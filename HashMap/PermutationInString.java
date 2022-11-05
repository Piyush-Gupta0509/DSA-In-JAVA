package HashMap;

import java.util.HashMap;

public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "adc";
		String s2 = "dcda";
		System.out.println(PIS(s1, s2));

	}

	public static boolean PIS(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		int n1 = s1.length();
		int n2 = s2.length();

		for (int i = 0; i < n1; i++) {
			char ch = s1.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int i = 0;
		int j = 0;
		int count=0;
		while (j < n2) {
			char ch = s2.charAt(j);
			if (map.containsKey(ch)&& map.get(ch)>0) {
				count++;
				j++;
				if(count==n1) {
					return true;
				}
				map.put(ch, map.get(ch)-1);
			} else {
				count=0;
				j++;
				while(i!=j) {
					char c=s2.charAt(i);
					map.put(c,map.get(c)+1);
				}
			}
			
		}
		return false;

	}

}
