package Strings;

public class ReverseWordsinaString3 {

	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
		String[] sarr=s.split(" ");
		String[] ans=new String[sarr.length];
		
		for(int i=0;i<sarr.length;i++) {
			ans[i]=reverseString(sarr[i]);
		}
		
		String Stringans=String.join(" ",ans);
		System.out.println(Stringans);
		

	}
	public static String reverseString(String s) {
		char[] arr=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		StringBuilder str = new StringBuilder();
		for(char c:arr) {
			str.append(c);
		}
		return str.toString();
	}

}
