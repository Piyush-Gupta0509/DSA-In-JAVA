package HashMap;

import java.util.HashMap;

public class SmallestSubstringOfAStringContainingAllCharactersOfAnotherString {

	public static void main(String[] args) {
		String ans=minWindow("totmtaptat","tat");
		System.out.println(ans);

	}
	public static String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        HashMap <Character, Integer>  freq = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i), 0) +1);
        }
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        int count = freq.size();
        int i = 0, j = 0;
        while(j < s.length()) {
            char cj = s.charAt(j);
            if(freq.containsKey(cj)) {
                freq.put(cj, freq.get(cj)-1);
                if (freq.get(cj) == 0) count--;
            }
            while(count == 0) {
                if(j-i+1 < minLen) {
                    minLen = j-i+1;
                    start = i;
                    end = j;
                }
                char ci = s.charAt(i);
                if(freq.containsKey(ci)) {
                    freq.put(ci, freq.get(ci)+1);
                    if (freq.get(ci) > 0) {
                        count++;
                        i++;
                        if(j-i+1 < minLen) {
                            minLen = j-i+1;
                            start = i-1;
                            end = j;
                        }
                        break;
                    }
                }
                i++;
            }
            j++;
        }
        if (start == -1 && end == -1) return "";
        return s.substring(start, end+1);
    }


}
