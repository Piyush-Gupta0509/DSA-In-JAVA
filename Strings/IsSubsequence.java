package Strings;

public class IsSubsequence {

	public static void main(String[] args) {
		String s="abc";
		String t="ahcbgd";
		boolean ans=isSubsequence(s,t);
		System.out.println(ans);
	}

	public static boolean isSubsequence(String s, String t) {
		int count=0;
		int i=0;
		int j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)!=t.charAt(j)) {
				j++;
			}
			else {
				i++;
				j++;
				count++;
			}
		}
		if(count==s.length()) {
			return true;
		}
		return false;
	}

}
