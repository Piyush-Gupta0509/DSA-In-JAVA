package Strings;

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int start = 0, mCount=0, mlength=0;
        int[] arr = new int[26];
        
        for (int end = 0; end < s.length(); end++) {
            char ch=s.charAt(end);
            arr[ch-'A']++;
            mCount=Math.max(mCount, arr[ch-'A']);
            while(end-start+1 - mCount >k) {
                char startchar=s.charAt(start);
                arr[startchar-'A']--;
                start++;
            }
            mlength=Math.max(mlength, end-start+1);
        }
        return mlength;
    }

    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        System.out.print(characterReplacement(str, k));
    }

}
