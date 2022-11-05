package BITManipulation;
import java.util.*;

public class GrayCode {
	public static ArrayList<String> helper(int n){
        if(n==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        
        ArrayList<String> rans=helper(n-1);
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<rans.size();i++){
            ans.add(0+rans.get(i));
        }
        for(int i=rans.size()-1;i>=0;i--){
            ans.add(1+rans.get(i));
        }
        
        return ans;
    }
    public static List<Integer> grayCode(int n) {
	    ArrayList<String> tans=helper(n);
	    List<Integer> ans=new ArrayList<>();
	    for(String str:tans){
	        ans.add(Integer.parseInt(str));
	    }
	    
	    return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> ans=grayCode(scn.nextInt());
        Collections.sort(ans);
        System.out.println(ans);
    }
}
