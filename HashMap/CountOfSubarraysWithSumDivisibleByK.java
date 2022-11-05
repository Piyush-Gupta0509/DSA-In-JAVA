package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfSubarraysWithSumDivisibleByK {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scn.nextInt();
	        }
	        int k = scn.nextInt();
	        System.out.println(solution(arr, k));

	}
	public static int solution(int[] arr, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int val:arr){
            sum+=val;
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        return count;
    }

}
