package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfSubarraysWithEqualNumberOfZeroesAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scn.nextInt();
	        }
	        System.out.println(solution(arr));
	}
	public static int solution(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int val:arr){
            if(val==0)  sum--;
            else sum++;

            if (map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
