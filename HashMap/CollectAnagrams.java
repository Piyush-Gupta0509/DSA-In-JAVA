package HashMap;
import java.io.*;
import java.util.*;
public class CollectAnagrams {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        String[] strs=new String[n];
	        for(int i=0;i<n;i++){
	            strs[i]=scn.next();
	        }
	        
	        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap=new HashMap<>();
	        
	        for(String str:strs){
	            HashMap<Character,Integer> fmap=new HashMap<>();
	            for(int i=0;i<str.length();i++){
	                char ch=str.charAt(i);
	                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
	            }
	            if(bmap.containsKey(fmap)==false){
	                ArrayList<String> list=new ArrayList<>();
	                list.add(str);
	                bmap.put(fmap,list);
	            }
	            else{
	                ArrayList<String> list=bmap.get(fmap);
	                list.add(str);
	            }
	        }
	        
	        ArrayList<ArrayList<String>> res=new ArrayList<>();
	        for(ArrayList<String> val: bmap.values()){
	            res.add(val);    
	        }
	        
	        for(int i=res.size()-1;i>=0;i--){
	            for(int j=res.get(i).size()-1;j>=0;j--){
	                 System.out.print(res.get(i).get(j)+" ");
	            }
	            System.out.println();
	        }
	    }
	
}
