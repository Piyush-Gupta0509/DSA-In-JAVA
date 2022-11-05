package HashMap;

import java.util.*;

public class SmallestSubstringInsideAString {

	public static class Main {

		public static void solution(String s1, String s2) {

//			------------------------CREATE HASHMAP-------------------------------------
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s2.length(); i++) {
				char ch = s2.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
//			-----------------------INITIALINZING VALUE------------------------------------------

			int st = 0;
			int end = 0;
			int minLength = Integer.MAX_VALUE;
			String ans = "";
			int size = map.size();

//			-----------------------MAIN LOGIC-------------------------------------

			while (end < s1.length()) {
				if (size != 0) {
					char ch = s1.charAt(end);
					if (map.containsKey(ch) == true) {
						map.put(ch, map.get(ch) - 1);
						if (map.get(ch) == 0) {
							size--;
						}
					}
					end++;
				} else {
					while (size == 0) {
						if ((end - st) < minLength) {
							minLength = end - st;
							ans = s1.substring(st, end);
						}
						char ch = s1.charAt(st);
						if (map.containsKey(ch) == true) {
							map.put(ch, map.get(ch) + 1);
							if (map.get(ch) == 1) {
								size++;
							}
						}
						st++;
					}
				}
			}
			while (size == 0) {
				if ((end - st) < minLength) {
					minLength = end - st;
					ans = s1.substring(st, end);
				}
				char ch = s1.charAt(st);
				if (map.containsKey(ch) == true) {
					map.put(ch, map.get(ch) + 1);
					if (map.get(ch) == 1) {
						size++;
					}
				}
				st++;
			}
			System.out.println(ans);
//			--------------------------------------------------------------------
		}

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String s1 = scn.next();
			String s2 = scn.next();
			solution(s1, s2);
		}

	}

}
