package Strings;

public class PermutationinString {
    
    public static boolean check(int[] arr) {
        boolean ans=true;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] !=0) {
                ans=false;
            }
        }
        return ans;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0; i<s1.length();i++) {
            char ch=s1.charAt(i);
            arr[ch-'a']++;
        }
        
        int i=0;
        int j=0;
        
        while(j<s1.length()) {
            char ch=s2.charAt(j);
            arr[ch-'a']--;
            j++;
        }
        
        if(check(arr)) {
            return true;
        }
        
        
        while(j<s2.length()) {
            arr[s2.charAt(i)-'a']++;
            arr[s2.charAt(j)-'a']--;
            if(check(arr)) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        boolean ans=checkInclusion(s1,s2);
        System.out.println(ans);
    }

}
