package HashMap;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s="tmmzuxt";
		System.out.println(LSWRC(s));
	}

	public static int LSWRC(String s) {
		int n = s.length();
        int i = 0;
        int j = 0;
        Map<Character , Integer> map = new HashMap<>();
        int max = 0;
        while(i < n && j < n){
            while(j < n){
                char cj = s.charAt(j++);
                map.put(cj , map.getOrDefault(cj , 0) + 1);
                if(map.get(cj) == 2){
                    break;
                }
                max = Math.max(j - i , max);
            }
            while(i < n){
                char ci = s.charAt(i++);
                map.put(ci , map.getOrDefault(ci , 0) - 1);
                if(map.get(ci) == 1){
                    break;
                }
                else{
                    map.remove(ci);
                }
            }
        }
        return max;

	}
}
