package HashMap;

import java.util.*;

public class SmallestSubstringOfAStringContainingAllUniqueCharactersOfItself {
	public static void solution(String str) {
//		------------------------CREATE HASHMAP-------------------------------------
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

//		-----------------------INITIALINZING VALUE------------------------------------------

		HashMap<Character, Integer> helper_map = new HashMap<>();
		int st = 0;
		int end = 0;
		int minLength = Integer.MAX_VALUE;
		String ans = "";
		int mapsize = map.size();
		int size = 0;

//		-----------------------MAIN LOGIC-------------------------------------

		while (end < str.length()) {
			if (size != mapsize) {
				char ch = str.charAt(end);
				helper_map.put(ch, helper_map.getOrDefault(ch, 0) + 1);
				if (helper_map.get(ch) == 1) {
					size++;
				}
				end++;
			} else {
				while (size == mapsize) {

					if ((end - st) < minLength) {
						minLength = end - st;
						ans = str.substring(st, end);
					}
					char ch = str.charAt(st);
					if (helper_map.containsKey(ch) == true) {
						helper_map.put(ch, helper_map.get(ch) - 1);
						if (helper_map.get(ch) == 0) {
							size--;
						}
					}
					st++;
				}
			}
		}
		while (size == mapsize) {

			if ((end - st) < minLength) {
				minLength = end - st;
				ans = str.substring(st, end);
			}
			char ch = str.charAt(st);
			if (helper_map.containsKey(ch) == true) {
				helper_map.put(ch, helper_map.get(ch) - 1);
				if (helper_map.get(ch) == 0) {
					size--;
				}
			}
			st++;
		}
		
		System.out.println(minLength);

//		---------------------------------------------------------------------
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
