package leetcode;

public class CountingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ans = countBits(5);
		for (int i : ans)
			System.out.print(i + ",");
	}
	public static int[] countBits(int num) {
		int[] ans = new int[num  +1];
		ans[0] = 0;
		for (int i = 1; i <= num; i++) {
			ans[i] = ans[i&(i - 1)] + 1;
		}
		return ans;
    }
}
