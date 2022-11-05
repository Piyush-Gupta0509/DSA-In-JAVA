package BackTracking;
import java.util.*;
public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1b2";
		List<String> ans=letterCasePermutation(s);
		System.out.println(ans);
	}
	public static List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        helper(0,s,"",ans);
        return ans;
    }
    
    public static void helper(int idx, String s, String asf, List<String> ans){
    	if(asf.length()==s.length()) {
    		ans.add(asf);
    		return;
    	}
        char ch=s.charAt(idx);
        if(Character.isDigit(ch)){
            helper(idx+1,s,asf+ch,ans);
        }
        else {
        	helper(idx+1,s,asf+Character.toLowerCase(ch),ans);
        	helper(idx+1,s,asf+Character.toUpperCase(ch),ans);
        }
    }

}
