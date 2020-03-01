package leetcode;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		System.out.println(getSum(-121,-9));
	}
	public static int getSum(int a, int b) {
		int res = 0;
		while (b != 0) {
			int carry = a&b;
			a = a^b;
			b = carry<<1;
		}
		return a;
	}

}
