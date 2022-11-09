package Strings;

import java.util.*;

public class nextGreaterElementIII {

    public static int nextGreaterElement(int n) {
        String str = n + "";
        char[] chArr = str.toCharArray();
        int i = -1;
        int j = -1;

        for (int k = chArr.length - 2; k >= 0; k--) {
            if (chArr[k] < chArr[k + 1]) {
                i = k;
                break;
            }
        }
        if(i==-1) return -1;
        
        for (int k = chArr.length - 1; k >= 0; k--) {
            if (chArr[k] > chArr[i]) {
                j = k;
                break;
            }
        }
        
        
//        System.out.println(chArr[i]);
//        System.out.println(chArr[j]);
        char temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;
        
        String res="";
        for (int x =0; x <= i; x++) {
            res+=chArr[x];
        }
        for (int x =chArr.length-1; x >i; x--) {
            res+=chArr[x];
        }
        
        if(Long.parseLong(res) > Integer.MAX_VALUE) return -1;
        
        return Integer.parseInt(res);
        
    }

    public static void main(String[] args) {
        int n=2147483486;
        System.out.println(nextGreaterElement(n));
    }

}
