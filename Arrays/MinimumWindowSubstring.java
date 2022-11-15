package Arrays;
import java.util.*;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            char ch=t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        int size= map.size();
        
        int start=0;
        int end=0;
        int minSize=Integer.MAX_VALUE;
        String ans="";
        
        while(end<s.length()) {
            if(size!=0) {
                char ch=s.charAt(end);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch)==0) {
                        size--;
                    }
                }
                
                end++;
            }
            else {
                while(size==0) {
                    if(end-start < minSize) {
                        minSize=end-start;
                        ans=s.substring(start,end);
                    }
                    
                    char ch=s.charAt(start);
                    if(map.containsKey(ch)) {
                        map.put(ch, map.get(ch)+1);
                        if(map.get(ch)==1) {
                            size++;
                        }
                    }
                    
                    start++;
                }
            }
            while(size==0) {
                if(end-start < minSize) {
                    minSize=end-start;
                    ans=s.substring(start,end);
                }
                
                char ch=s.charAt(start);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch)+1);
                    if(map.get(ch)==1) {
                        size++;
                    }
                }
                
                start++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));

    }

}
