package Arrays;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 45;
		System.out.println(intToRoman(nums));

	}

	public static String intToRoman(int num) {
		int[] intcode = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < intcode.length; i++) {
			while (num >= intcode[i]) {
				sb.append(code[i]);
				num -= intcode[i];
			}
		}
		return sb.toString();
	}

}
