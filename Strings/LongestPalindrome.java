package Strings;
import java.util.*;
public class LongestPalindrome {

	public static void main(String[] args) {
		String s="abccccda";
		
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		int ans=0;
		boolean Firstodd=false;
		for(char c:map.keySet()) {
			if(map.get(c)%2==0) {
				ans+=map.get(c);
			}else {
				if(Firstodd==false) {
					ans+=map.get(c);
					Firstodd=true;
				}
				else {
					ans+=(map.get(c)-1);
				}
			}
		}
		
	}

}
